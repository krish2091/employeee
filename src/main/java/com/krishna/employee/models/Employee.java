package com.krishna.employee.models;

import java.util.Date;

public class Employee {
	private String emp_name;
	private int emp_id;
	private int emp_dept_id;
	private double emp_sal;
	private Date emp_dob;
	private Date emp_doj;

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getEmp_dept_id() {
		return emp_dept_id;
	}

	public void setEmp_dept_id(int emp_dept_id) {
		this.emp_dept_id = emp_dept_id;
	}

	public double getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}

	public Date getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	public Date getEmp_doj() {
		return emp_doj;
	}

	public void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}
}
