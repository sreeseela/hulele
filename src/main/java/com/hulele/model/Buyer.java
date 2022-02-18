package com.hulele.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Buyer")
@Entity
public class Buyer{
	@Id
	private int id;
	private String name;
	private int credId;
	private int countryCode;
	private Date dob;
}
