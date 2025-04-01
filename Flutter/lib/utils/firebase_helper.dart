import 'dart:io';
import 'package:firebase_storage/firebase_storage.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class FirebaseHelper {
  static Future<String?> uploadImage(File file, String path) async {
    try {
      String fileName = DateTime.now().millisecondsSinceEpoch.toString();
      Reference ref = FirebaseStorage.instance.ref().child('$path/$fileName');
      await ref.putFile(file);
      return await ref.getDownloadURL();
    } catch (e) {
      print("Error uploading image: $e");
      return null;
    }
  }

  static Future<void> saveTemplate(String imageUrl) async {
    await FirebaseFirestore.instance.collection('templates').add({'imageUrl': imageUrl});
  }

  static Future<void> saveSketch(String imageUrl) async {
    await FirebaseFirestore.instance.collection('designs').add({'imageUrl': imageUrl});
  }
}
