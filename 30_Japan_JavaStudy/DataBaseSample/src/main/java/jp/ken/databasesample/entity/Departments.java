package jp.ken.databasesample.entity;

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
@Table(name="departments")
public class Departments {

	@Id
	@Column(name="department_id")

	private int department_id;
	private String department_name;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="department_id", insertable=false, updatable=false)
	private List<Employees> emp = new ArrayList<Employees>();
	

	public List<Employees> getEmp() {
		return emp;
	}

	public void setEmp(List<Employees> emp) {
		this.emp = emp;
	}
	/**
	 * @return the department_id
	 */
	public int getDepartment_id() {
		return department_id;
	}
	/**
	 * @param department_id the department_id to set
	 */
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	/**
	 * @return the department_name
	 */
	public String getDepartment_name() {
		return department_name;
	}
	/**
	 * @param department_name the department_name to set
	 */
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}


}
