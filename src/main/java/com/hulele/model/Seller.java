package com.hulele.model;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Seller")
public class Seller {
	@Id
	private int id;
	private String name;
	private String address;
	private String zipcode;
}
