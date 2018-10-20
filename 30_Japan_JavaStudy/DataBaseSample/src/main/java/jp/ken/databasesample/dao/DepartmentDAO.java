package jp.ken.databasesample.dao;

import java.util.List;

public interface DepartmentDAO<T> {
  public List<T> allList();
}
