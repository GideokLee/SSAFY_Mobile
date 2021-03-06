import 'package:flutter/material.dart';

class CircleAvatarPage extends StatelessWidget {
  const CircleAvatarPage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(title)
      ),
      body: Center(
        child: CircleAvatar(
          child: Icon(Icons.person),
        ),
      ),
    );
  }
}
