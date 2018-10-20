package jp.ken.bookstore.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class BookStoreModel implements Serializable{
	private static final long serialVersionUID = 4433727345657953659L;

	private String selectRadio;
	
	@NotEmpty(message="è»ó™Ç∑ÇÈÇ±Ç∆ÇÕÇ≈Ç´Ç‹ÇπÇÒ")
	private String vagueField;

	public String getSelectRadio() {
		return selectRadio;
	}

	public void setSelectRadio(String selectRadio) {
		this.selectRadio = selectRadio;
	}

	public String getVagueField() {
		return vagueField;
	}

	public void setVagueField(String vagueField) {
		this.vagueField = vagueField;
	}
	
	
}
