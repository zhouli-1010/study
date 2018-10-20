package jp.ken.basesample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public interface EmployeeDAO<T> {
  public List<T> allList();
//  public Employees getById(int id);
//  public List<T> getByName(String name);
}
