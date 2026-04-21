package com.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.dto.CustomerResponseDTO;

@Service
public interface CustomerService {
	
	List<CustomerResponseDTO> findAllCustomers();

}
