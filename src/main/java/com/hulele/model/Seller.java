package com.hulele.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Seller")
public class Seller {
	@Id
	private int id;
	private int name;
	private int address;
	private int zipcode;
}
