package jp.ken.databasesample.dao;

import java.util.List;

import jp.ken.databasesample.entity.Employees;

public interface EmployeeDAO<T> {
  public List<T> allList();
  public Employees getById(int id);
  public List<T> getByName(String name);
}
