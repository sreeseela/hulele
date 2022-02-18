package com.hulele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hulele.model.Credentials;

@Repository
public interface CredentialsRep extends JpaRepository<Credentials, Integer>{

}
