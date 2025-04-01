import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'firebase_options.dart'; // Import the file
import 'pages/home_page.dart';
import 'pages/sketchpad_page.dart';
import 'pages/templates_page.dart';
import 'pages/saved_designs_page.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(
    options: DefaultFirebaseOptions.currentPlatform, // Use Firebase options
  );

  runApp(FashionSketchbookApp());
}

class FashionSketchbookApp extends StatelessWidget {
  const FashionSketchbookApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Fashion Sketchbook',
      theme: ThemeData(
        primarySwatch: Colors.purple,
        scaffoldBackgroundColor: Colors.black87,
        textTheme: const TextTheme(bodyMedium: TextStyle(color: Colors.white)),
      ),
      home: HomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}