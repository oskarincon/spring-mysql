/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.cliente.repository;

import com.prueba.cliente.model.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author digital
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
