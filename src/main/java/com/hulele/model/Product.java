package com.hulele.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")
@Entity
public class Product {
	@Id
	private int id;
	private String pName;
	private int pQuantity;
	private int cid;
	private int selledId;
}
