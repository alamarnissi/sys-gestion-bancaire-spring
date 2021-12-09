package com.sgb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgb.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
