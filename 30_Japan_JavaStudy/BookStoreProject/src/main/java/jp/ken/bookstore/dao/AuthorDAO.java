package jp.ken.bookstore.dao;

import java.util.List;

public interface AuthorDAO<T> {
	public List<T> allList();
}
