package jp.ken.bookstore.dao;

import java.util.List;

public interface ProductDAO<T> {
	public List<T> allList();
}
