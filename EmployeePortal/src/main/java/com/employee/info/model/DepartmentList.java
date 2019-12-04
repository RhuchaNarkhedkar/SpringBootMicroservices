package com.employee.info.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DepartmentList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7981512095480243440L;
	@JsonFormat(shape = JsonFormat.Shape.ARRAY, with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<Department> department;

	public DepartmentList() {
		department = new ArrayList<Department>();
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

}
