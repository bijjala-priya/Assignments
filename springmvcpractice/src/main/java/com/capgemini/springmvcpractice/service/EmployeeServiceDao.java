package com.capgemini.springmvcpractice.service;

import java.util.List;

import com.capgemini.springmvcpractice.dto.EmployeeInfoBean;

public interface EmployeeServiceDao {
	
	EmployeeInfoBean getEmployeeDetails(int id);
	boolean addEmployee(EmployeeInfoBean info);
	boolean deleteEmployeeInfo(int id);
	boolean updateEmployeeInfo(EmployeeInfoBean info);
	List<EmployeeInfoBean> getAllEMployeeInfo();


}
