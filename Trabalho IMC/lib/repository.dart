import 'package:dio/dio.dart';

class Repository {
  Dio dio;
  Repository(this.dio);

  Future<List<ImcModel>> getData() async {
    final response = await dio.get("");
    final resultList = (response.data["data"] as List)
        .map((json) => ImcModel.fromJson(json))
        .toList();
    return resultList;
  }
}

class ImcModel {
  final String name;
  final double value;

  ImcModel({this.name, this.value});

  factory ImcModel.fromJson(Map<String, dynamic> json) {
    return ImcModel(name: json["name"], value: json["value"]);
  }
}
