package com.hulele.model;

import java.util.Date;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Order")
public class Order {
	private int id;
	private int userId;
	private int prodId;
	private int quantity;
	private Date orderDate;
}
