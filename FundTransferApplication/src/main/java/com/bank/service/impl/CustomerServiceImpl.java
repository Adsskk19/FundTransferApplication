package com.bank.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.CustomerRepository;
import com.bank.dto.CustomerResponseDTO;
import com.bank.model.Customer;
import com.bank.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;


	@Override
	public List<CustomerResponseDTO> findAllCustomers() {
		List<Customer> customersList = customerRepository.findAll();
		List<CustomerResponseDTO> customerResponseDTOList = new ArrayList<CustomerResponseDTO>();
		for(Customer customer : customersList) {
			CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();
			BeanUtils.copyProperties(customer, customerResponseDTO);
			customerResponseDTOList.add(customerResponseDTO);
			
		}
	return customerResponseDTOList;
		
	}
	

}
