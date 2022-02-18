package com.hulele.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Credentials")
@Entity
public class Credentials {
	@Id
	private int id;
	@Column(unique = true)
	private String email;
	private String password; 
}
