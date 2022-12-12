import 'package:test/test.dart';

void main() {
  double medidaaltura = 1.70;
  double medidapeso = 69;
  double imc = medidapeso / (medidaaltura * medidaaltura);

  test('medida da altura é diferente de nulo', () {
    assert(medidaaltura != null);
  });

  test('medida do peso é diferente de nulo', () {
    assert(medidapeso != null);
  });

  test('medida da altura maior que o peso', () {
    AssertionError(medidaaltura > medidapeso);
  });

  test('medida da altura é um número positivo', () {
    assert(medidaaltura != null && medidaaltura >= 0);
  });

  test('medida do peso é um número positivo válido', () {
    assert(medidapeso != null && medidapeso >= 0);
  });

  test('imc é um numero positivo válido', () {
    assert(imc != null && imc >= 0);
  });
}
