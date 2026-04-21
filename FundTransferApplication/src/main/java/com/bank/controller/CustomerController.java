package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.dto.CustomerResponseDTO;
import com.bank.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	
//	public CustomerController(CustomerService customerService) {
//		this.customerService = customerService;
//	}


	@GetMapping("/getAll")
	public List<CustomerResponseDTO> getCustomers(){
		
		List<CustomerResponseDTO> allCustomers = customerService.findAllCustomers();
	
		
		return allCustomers; 
		
	}
	

}
