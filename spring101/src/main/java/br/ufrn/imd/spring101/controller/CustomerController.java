package br.ufrn.imd.spring101.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufrn.imd.spring101.model.Customer;
import br.ufrn.imd.spring101.service.CustomerService;

@RequestMapping("/customer")
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	private boolean edit = false;
	
	@GetMapping("/list")
	public String listaPage(Model model){
		model.addAttribute("modelTxt", "Lista de Clientes");
		model.addAttribute("customers", customerService.listAll());
		
		return "/customer/list";
	}
	
	/**
	 * Página de formulário será usada tanto para editar quanto para criar um novo objeto
	 * @param model
	 * @return
	 */
	@GetMapping("/form")
	public String formPage(Model model) {
		if(!edit) {
			Customer c = new Customer();
			model.addAttribute("customer", c);
		}else {
			edit = false;
		}
		return "/customer/form";
	}
	
	@PostMapping("/save")
	@Transactional
	public String save(Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:list";
	}
	
	
	public String editForm(Integer id, Model model) {
		model.addAttribute("customer", customerService.findCustomerById(id));
		edit = true;
		return formPage(model);
	}
	
//	public List<Customer> list(Customer customer){
//		return customerRepository.findByCustomer(customer.getId());
//	}
	
	

}
