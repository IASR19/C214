import 'dart:convert';

import 'package:CalculoImc/repository.dart';
import 'package:CalculoImc/controller.dart';
import 'package:dio/dio.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:mockito/mockito.dart';

import 'utils/mockdata.dart';

class ControllerMock extends Mock implements Controller {}

class DioMock extends Mock implements Dio {}

void main() {
  ControllerMock mock;
  DioMock dio;
  Repository repository;

  setUp(() {
    mock = ControllerMock();
    dio = DioMock();
    repository = Repository(dio);
  });

  group('HomeController Test', () {
    test("First test: instance", () {
      expect(mock, isInstanceOf<Controller>());
    });

    test('Seu cabo de vassoura! :)', () async {
      when(dio.get(any, options: anyNamed('options'))).thenAnswer(
        (_) async => Response(
          data: jsonDecode(dataMock),
          statusCode: 200,
        ),
      );
      await repository.getData().then((value) {
        expect('Seu cabo de vassoura! :)', value.first.name);
        expect(18.5, value.first.value);
      });
    });

    test('Tá gordinho hein? :)', () async {
      when(dio.get(any, options: anyNamed('options'))).thenAnswer(
        (_) async => Response(
          data: jsonDecode(dataMock),
          statusCode: 200,
        ),
      );
      await repository.getData().then((value) {
        expect('Tá gordinho hein? :)', value.last.name);
        expect(25.0, value.last.value);
      });
    });
  });
}
