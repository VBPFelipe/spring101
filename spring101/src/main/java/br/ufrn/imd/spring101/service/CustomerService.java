package br.ufrn.imd.spring101.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufrn.imd.spring101.model.Customer;
import br.ufrn.imd.spring101.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> listAll(){
		return customerRepository.findAll();
	}
	
	public Customer findCustomerById(int id){
		return customerRepository.getOne(id);
	}
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
//	public void populate(int n) {
//		for(int i=0; i< n; i++) {
//			Customer c = new Customer(i, "Customer " + Integer.toString(i));
//			customerRepository.save(c);
//		}
//	}

}
