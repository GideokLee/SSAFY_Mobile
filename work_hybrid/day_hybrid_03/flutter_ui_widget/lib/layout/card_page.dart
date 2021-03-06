import 'package:flutter/material.dart';

class CardPage extends StatelessWidget {
  const CardPage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(title)
      ),
      body: Center(
        child: Card(
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(16.0),
          ),
          elevation: 10.0,  // 그림자 깊이
          child: Container(
            width: 100,
            height: 100,
            color: Colors.lightBlueAccent,
          ),
        ),
      ),
    );
  }
}
