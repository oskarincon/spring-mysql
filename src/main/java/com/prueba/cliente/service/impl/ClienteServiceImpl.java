/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.cliente.service.impl;

import com.prueba.cliente.model.Cliente;
import com.prueba.cliente.repository.ClienteRepository;
import com.prueba.cliente.service.ClienteService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author digital
 */
@Service
@Slf4j
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listarClientes() {
        log.info("llgo al servicio");
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente listaClienteId(Cliente cliente) {
       return clienteRepository.findById(cliente.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void insertaCliente(Cliente cliente) {
         clienteRepository.save(cliente);
    }

    @Override
    @Transactional
    public void deleteCliente(Cliente cliente) {
        clienteRepository.delete(cliente);
    }
    
}
