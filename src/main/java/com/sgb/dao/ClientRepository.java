/**
 * 
 */
package com.sgb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgb.entities.Client;

/**
 * @author sgb
 *
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

}
