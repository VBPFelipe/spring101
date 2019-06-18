package br.ufrn.imd.spring101.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.ufrn.imd.spring101.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Override
	public List<Customer> findAll();
	
//	public void delete(Integer id);
	
	@Query(value="select * from customer c where c.id= ?1")
	public Customer getOne(Integer id);
	
	
//	public List<Customer> findByCustomer(Integer customerId);
	
}
