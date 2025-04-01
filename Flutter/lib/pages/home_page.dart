import 'package:flutter/material.dart';
import 'templates_page.dart';
import 'sketchpad_page.dart';
import 'saved_designs_page.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _currentIndex = 0;

  final List<Widget> _pages = [
    SketchpadPage(),
    TemplatesPage(),
    SavedDesignsPage(),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Fashion Sketchbook')),
      body: _pages[_currentIndex],
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _currentIndex,
        backgroundColor: const Color.fromARGB(255, 1, 0, 1),
        selectedItemColor: Colors.white,
        unselectedItemColor: Colors.white60,
        items: const [
          BottomNavigationBarItem(icon: Icon(Icons.brush), label: "Sketchpad"),
          BottomNavigationBarItem(icon: Icon(Icons.image), label: "Templates"),
          BottomNavigationBarItem(icon: Icon(Icons.save), label: "Saved"),
        ],
        onTap: (index) {
          setState(() {
            _currentIndex = index;
          });
        },
      ),
    );
  }
}
