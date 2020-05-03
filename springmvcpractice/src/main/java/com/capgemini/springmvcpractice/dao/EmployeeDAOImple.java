package com.capgemini.springmvcpractice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.capgemini.springmvcpractice.dto.EmployeeInfoBean;
@Repository
public class EmployeeDAOImple implements EmployeeDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EmployeeInfoBean employeeInfoBean=getEmployeeDetails(empId);
		if (employeeInfoBean!=null && employeeInfoBean.getPassword().equals(password)) {
			return employeeInfoBean;
		}
		
		
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeDetails(int id) {
		EntityManager manager = factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, id);

		return employeeInfoBean;
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean info) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		boolean isAdded=false;
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			isAdded=true;
			System.out.println("Added");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
			System.out.println("add");
		}
		return isAdded;

	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		boolean isDeleted=false;
		EntityManager manager=factory.createEntityManager();
		EmployeeInfoBean employeeinfo=manager.find(EmployeeInfoBean.class,id);
		if(employeeinfo!=null) {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.remove(employeeinfo);
			transaction.commit();
			isDeleted=true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean info) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		boolean isUpdated=false;
		try {
			transaction.begin();
		String jpql="update EmployeeInfoBean e set e.name=:name where e.empId=:empId";
		Query query=manager.createQuery(jpql);
		query.setParameter("empId",info.getEmpId());
		query.setParameter("name",info.getName());
         int id=query.executeUpdate();
         transaction.commit();
         isUpdated=true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		
		return isUpdated;
	}

	@Override
	public List<EmployeeInfoBean> getAllEMployeeInfo() {
		EntityManager manager=factory.createEntityManager();
		String jpql="Select e from EmployeeInfoBean e";
		Query query=manager.createQuery(jpql);
		List<EmployeeInfoBean> employeelist=query.getResultList();
		manager.close();
		return employeelist;
		
	}

	
}
