package com.hulele.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hulele.model.Credentials;

public interface CredentialsRep extends JpaRepository<Credentials, Integer>{

}
