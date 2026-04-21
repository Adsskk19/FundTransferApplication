package com.bank.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponseDTO {
	
	private long customerId;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false, unique = true)
	private String email;

}
