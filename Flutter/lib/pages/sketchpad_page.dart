import 'dart:typed_data';
import 'package:flutter/material.dart';
import 'package:flutter_drawing_board/flutter_drawing_board.dart';
import 'package:firebase_storage/firebase_storage.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class SketchpadPage extends StatefulWidget {
  const SketchpadPage({super.key});

  @override
  _SketchpadPageState createState() => _SketchpadPageState();
}

class _SketchpadPageState extends State<SketchpadPage> {
  final DrawingController _controller = DrawingController();

  Future<void> _saveSketch() async {
    final imageBytes = await _controller.getImageData();
    if (imageBytes == null) return;

    String fileName = "sketch_${DateTime.now().millisecondsSinceEpoch}.png";
    Reference ref = FirebaseStorage.instance.ref().child('designs/$fileName');
    UploadTask uploadTask = ref.putData(imageBytes as Uint8List);
    TaskSnapshot snapshot = await uploadTask;
    String downloadUrl = await snapshot.ref.getDownloadURL();

    await FirebaseFirestore.instance.collection('designs').add({'imageUrl': downloadUrl});

    ScaffoldMessenger.of(context).showSnackBar(
      const SnackBar(content: Text("Sketch saved successfully!")),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Sketchpad")),
      body: Column(
        children: [
          Expanded(
            child: DrawingBoard(
              controller: _controller,
              background: Container(color: Colors.white),
            ),
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              ElevatedButton(
                onPressed: _saveSketch,
                child: const Text("Save Sketch"),
              ),
              ElevatedButton(
                onPressed: () => _controller.clear(),
                child: const Text("Clear"),
              ),
            ],
          ),
        ],
      ),
    );
  }
}

