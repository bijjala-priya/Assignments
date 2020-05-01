package com.capgemini.springmvcpractice.dao;

import java.util.List;


import com.capgemini.springmvcpractice.dto.EmployeeInfoBean;

public interface EmployeeDAO {
	
	EmployeeInfoBean getEmployeeDetails(int id);
	boolean addEmployee(EmployeeInfoBean info);
	boolean deleteEmployeeInfo(int id);
	boolean updateEmployeeInfo(EmployeeInfoBean info);
	List<EmployeeInfoBean> getAllEMployeeInfo();

	

}
