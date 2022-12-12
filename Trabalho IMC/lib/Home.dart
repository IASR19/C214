import 'package:CalculoImc/controller.dart';
import 'package:flutter/material.dart';

class Home extends StatefulWidget {
  const Home({Key key}) : super(key: key);

  @override
  _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
  final Controller _controller = Controller();

  String _textoResultado = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Cálculo IMC"),
        backgroundColor: Colors.blue,
      ),
      body: Form(
        key: _controller.key,
        child: Container(
          child: SingleChildScrollView(
            padding: EdgeInsets.all(32),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Padding(
                  padding: EdgeInsets.only(bottom: 32),
                  child: Image.asset("imagens/logo.png"),
                ),
                Padding(
                  padding: EdgeInsets.only(bottom: 10),
                  child: Text(
                    "Saiba qual o seu índice de massa corpórea!",
                    style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
                  ),
                ),
                TextFormField(
                  keyboardType: TextInputType.number,
                  decoration:
                      InputDecoration(labelText: "Digite sua altura (em metros). EX: 1.70"),
                  style: TextStyle(fontSize: 22),
                  controller: _controller.controllerAltura,
                  validator: (value) {
                    if (value == null || value.isEmpty) {
                      return "Preencha o campo";
                    }
                    return null;
                  },
                ),
                TextFormField(
                  keyboardType: TextInputType.number,
                  decoration:
                      InputDecoration(labelText: "Digite seu peso (em Kg). EX: 69.2"),
                  style: TextStyle(fontSize: 22),
                  controller: _controller.controllerPeso,
                  validator: (value) {
                    if (value == null || value.isEmpty) {
                      return "Preencha o campo";
                    }
                    return null;
                  },
                ),
                Padding(
                  padding: EdgeInsets.only(top: 10),
                  child: ElevatedButton(
                    onPressed: () {
                      _controller.calcular();
                      if (_controller.result == 0.0) {
                        setState(() {
                          _textoResultado =
                              "Dados inválidos. Preencha os campos corretamente!";
                        });
                      } else if (_controller.result < 18.5) {
                        setState(() {
                          _textoResultado = "Seu cabo de vassoura! :)";
                        });
                      } else if ((_controller.result >= 18.5) && (_controller.result <= 24.9) ) {
                        setState(() {
                          _textoResultado = "Normal... :)";
                        });
                      } else if ((_controller.result >= 25) && (_controller.result <= 29.9) ){
                        setState(() {
                          _textoResultado = "Tá gordinho hein? :)";
                        });
                      }else if ((_controller.result >= 30) && (_controller.result <= 39.9) ){
                        setState(() {
                          _textoResultado = "Uma dietinha vai bem... :)";
                        });
                      }else if ((_controller.result >= 40) ){
                        setState(() {
                          _textoResultado = "Sem salvação... :(";
                        });
                      }
                    },
                    child: Text(
                      "Calcular",
                      style: TextStyle(fontSize: 20),
                    ),
                  ),
                ),
                Padding(
                  padding: EdgeInsets.only(top: 20),
                  child: Text(
                    _textoResultado,
                    style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
                  ),
                )
              ],
            ),
          ),
        ),
      ),
    );
  }
}
