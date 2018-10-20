package jp.ken.bookstore.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@Column(name="author_id")
	private int author_id;

	//@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="author_id", insertable=false, updatable=false)
	private List<Product> author = new ArrayList<Product> ();

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public List<Product> getAuthor() {
		return author;
	}

	public void setAuthor(List<Product> author) {
		this.author = author;
	}

	
}
