package com.capgemini.springmvcpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.capgemini.springmvcpractice.dto.EmployeeInfoBean;
import com.capgemini.springmvcpractice.service.EmployeeServiceDao;
@Controller
public class EmployeeController {
	@Autowired
	EmployeeServiceDao service;
	
	@GetMapping("/getEmployeeForm")
	public String getEmployeeForm() {
		
		return "searchEmployee";
	}
	@GetMapping("getEmployee")
	public String getEmployee(int id,ModelMap modelMap) {
		EmployeeInfoBean employeeInfoBean=service.getEmployeeDetails(id);
		if(employeeInfoBean!=null) {
			modelMap.addAttribute("employeeInfo",employeeInfoBean);
		}else {
			modelMap.addAttribute("errmsg","Employee Id Not Found");
		}
		return "searchEmployee";
		
	}
	@GetMapping("/delete")
	public String getdeleteForm() {
		return "deleteEmployee";
	}
	@GetMapping("/deleteEmployee")
	public String getDelete(int id, ModelMap map) {//model map to transfer the data
		boolean deleted = service.deleteEmployeeInfo(id);
		if(deleted) {
			map.addAttribute("hello", "Record Deleted");
			return "hello";
		} else {
			return "deleteEmployee";
		}
	}
	@GetMapping("/getAll")
	public String getAllForm() {
		return "allDetailOfEmp";
	}
	@GetMapping("/getAllEmployee")
	public String getAllForm(ModelMap map) {
		List<EmployeeInfoBean> allRecord = service.getAllEMployeeInfo();
		map.addAttribute("list", allRecord);
		return "getAllEmployee";
	}
	@GetMapping("/update")
	public String getupdateForm() {
		return "updateEmp";
	}
	@PostMapping("/updateEmployee")
	public String getUpdate(EmployeeInfoBean info, ModelMap map) {//model map to transfer the data
		boolean updated = service.updateEmployeeInfo(info);
		if(updated) {
			map.addAttribute("hello", "Record Updated");
			return "hello";
		} else {
			return "updateEmp";
		}
	}
	
	

}
