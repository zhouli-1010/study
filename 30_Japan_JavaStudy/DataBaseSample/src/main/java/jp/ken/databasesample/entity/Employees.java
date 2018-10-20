package jp.ken.databasesample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {

	@Id
	@Column(name="employee_id")
	@GeneratedValue	(strategy=GenerationType.AUTO)
	private int employee_id;
	private String employee_name;
	private String employee_phone;
	private String employee_email;
	private int department_id;
	
	
	@OneToOne
	@JoinColumn(name="department_id", insertable=false, updatable=false)
	private Departments dept;
	

	public Departments getDept() {
		return dept;
	}

	public void setDept(Departments dept) {
		this.dept = dept;
	}
	/**
	 * @return the employee_id
	 */
	public int getEmployee_id() {
		return employee_id;
	}
	/**
	 * @param employee_id the employee_id to set
	 */
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	/**
	 * @return the employee_name
	 */
	public String getEmployee_name() {
		return employee_name;
	}
	/**
	 * @param employee_name the employee_name to set
	 */
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	/**
	 * @return the employee_phone
	 */
	public String getEmployee_phone() {
		return employee_phone;
	}
	/**
	 * @param employee_phone the employee_phone to set
	 */
	public void setEmployee_phone(String employee_phone) {
		this.employee_phone = employee_phone;
	}
	/**
	 * @return the employee_email
	 */
	public String getEmployee_email() {
		return employee_email;
	}
	/**
	 * @param employee_email the employee_email to set
	 */
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
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
	

}
