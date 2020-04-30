package com.capgemini.springmvcpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springmvcpractice.dao.EmployeeDAO;
import com.capgemini.springmvcpractice.dto.EmployeeInfoBean;
@Service
public class EmployeeServiceDAOImple implements EmployeeServiceDao {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeInfoBean getEmployeeDetails(int id) {
		
		return dao.getEmployeeDetails(id);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean info) {
		
		return dao.addEmployee(info);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		
		return dao.deleteEmployeeInfo(id);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean info) {
		
		return dao.updateEmployeeInfo(info);
	}

	@Override
	public List<EmployeeInfoBean> getAllEMployeeInfo() {
		
		return dao.getAllEMployeeInfo();
	}

}
