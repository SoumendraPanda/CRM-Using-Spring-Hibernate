package com.pandahero.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pandahero.springdemo.dao.CustomerDAO;
import com.pandahero.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	//need to inject the customer Dao
	@Autowired
	private CustomerDAO customerDAO;
	
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		
		return customerDAO.getCustomers();
	}



	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
	}



	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		
		return customerDAO.getCustomer(theId);
	}



	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(theId);
	}

}
