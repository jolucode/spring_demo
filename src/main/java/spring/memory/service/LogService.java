package spring.memory.service;

import spring.memory.model.Log;

import java.util.List;

public interface LogService {
  List<Log> getData(int N);
}