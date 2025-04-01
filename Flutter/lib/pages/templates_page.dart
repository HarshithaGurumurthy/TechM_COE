import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class TemplatesPage extends StatefulWidget {
  const TemplatesPage({super.key});

  @override
  _TemplatesPageState createState() => _TemplatesPageState();
}

class _TemplatesPageState extends State<TemplatesPage> {
  final _formKey = GlobalKey<FormState>();
  final TextEditingController _designController = TextEditingController();
  final TextEditingController _typeController = TextEditingController();
  final TextEditingController _imageUrlController = TextEditingController();

  Future<void> _addTemplate() async {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: const Text('Add New Template'),
        content: Form(
          key: _formKey,
          child: SingleChildScrollView(
            child: Column(
              mainAxisSize: MainAxisSize.min,
              children: [
                // Design Name Field
                TextFormField(
                  controller: _designController,
                  decoration: const InputDecoration(labelText: 'Sketch Design'),
                  validator: (value) => value!.isEmpty ? 'Enter design name' : null,
                ),
                // Type Field
                TextFormField(
                  controller: _typeController,
                  decoration: const InputDecoration(labelText: 'Type'),
                  validator: (value) => value!.isEmpty ? 'Enter type' : null,
                ),
                // Image URL Field with copy-paste enabled
                TextFormField(
                  controller: _imageUrlController,
                  decoration: const InputDecoration(labelText: 'Image URL (Paste here)'),
                  keyboardType: TextInputType.url,
                  enableInteractiveSelection: true,  // Enables copy/paste
                  toolbarOptions: const ToolbarOptions(
                    copy: true,
                    paste: true,
                    selectAll: true,
                    cut: true,
                  ),
                  validator: (value) => value!.isEmpty ? 'Paste Image URL' : null,
                ),
              ],
            ),
          ),
        ),
        actions: [
          ElevatedButton(
            onPressed: () async {
              if (_formKey.currentState!.validate()) {
                await FirebaseFirestore.instance.collection('templates').add({
                  'design': _designController.text,
                  'type': _typeController.text,
                  'imageUrl': _imageUrlController.text,
                });
                _designController.clear();
                _typeController.clear();
                _imageUrlController.clear();
                Navigator.of(context).pop();
              }
            },
            child: const Text('Submit'),
          ),
        ],
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Templates")),
      floatingActionButton: FloatingActionButton(
        onPressed: _addTemplate,
        child: const Icon(Icons.add),
      ),
      body: StreamBuilder(
        stream: FirebaseFirestore.instance.collection('templates').snapshots(),
        builder: (context, AsyncSnapshot<QuerySnapshot> snapshot) {
          if (!snapshot.hasData) return const Center(child: CircularProgressIndicator());
          return GridView.builder(
            itemCount: snapshot.data!.docs.length,
            gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(crossAxisCount: 2),
            itemBuilder: (context, index) {
              var data = snapshot.data!.docs[index];
              String imageUrl = data['imageUrl'];
              return Card(
                child: Column(
                  children: [
                    Expanded(
                      child: Image.network(imageUrl, fit: BoxFit.cover),
                    ),
                    Text(data['design'] ?? ''),
                    Text(data['type'] ?? '', style: const TextStyle(color: Colors.grey)),
                  ],
                ),
              );
            },
          );
        },
      ),
    );
  }
}
