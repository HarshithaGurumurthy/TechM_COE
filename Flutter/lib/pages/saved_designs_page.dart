import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class SavedDesignsPage extends StatelessWidget {
  const SavedDesignsPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Saved Designs")),
      body: StreamBuilder(
        stream: FirebaseFirestore.instance.collection('designs').snapshots(),
        builder: (context, AsyncSnapshot<QuerySnapshot> snapshot) {
          if (!snapshot.hasData) return const Center(child: CircularProgressIndicator());
          return ListView.builder(
            itemCount: snapshot.data!.docs.length,
            itemBuilder: (context, index) {
              String imageUrl = snapshot.data!.docs[index]['imageUrl'];
              return Card(
                child: ListTile(
                  leading: Image.network(imageUrl),
                  title: Text("Sketch ${index + 1}"),
                ),
              );
            },
          );
        },
      ),
    );
  }
}
