import 'package:flutter/material.dart';

class Controller {
  final key = GlobalKey<FormState>();

  final TextEditingController controllerAltura = TextEditingController();
  final TextEditingController controllerPeso = TextEditingController();
  var result = 0.0;

  void calcular() {
    if (key.currentState.validate()) {
      double medidaAltura = double.parse(controllerAltura.text);
      double medidaPeso = double.parse(controllerPeso.text);
      if (medidaPeso == null || medidaAltura == null) {
        result = 0.0;
      } else {
        result = medidaPeso / (medidaAltura * medidaAltura);
      }

      _limparCampos();
    }
  }

  void _limparCampos() {
    controllerAltura.clear();
    controllerPeso.clear();
  }
}
