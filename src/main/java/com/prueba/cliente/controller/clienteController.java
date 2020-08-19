/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.cliente.controller;

import com.prueba.cliente.model.Cliente;
import com.prueba.cliente.service.ClienteService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author digital
 */
@RestController
@Slf4j
public class clienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public List<Cliente> getAllCliente() {
        log.info("pasa por aca");
        return clienteService.listarClientes();
    }

    @PostMapping("/cliente")
    public ResponseEntity postCliente(@RequestBody Cliente cliente) {
        clienteService.insertaCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClientebyId(@PathVariable("id") long id) {
        Cliente cliente = Cliente.builder().id(id).build();
        return clienteService.listaClienteId(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public ResponseEntity deleteCliente(@PathVariable("id") long id) {
        Cliente cliente = clienteService.listaClienteId(Cliente.builder().id(id).build());
        if (cliente != null) {
            clienteService.deleteCliente(cliente);
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
