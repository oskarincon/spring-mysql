/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.cliente.service;

import com.prueba.cliente.model.Cliente;
import java.util.List;

/**
 *
 * @author digital
 */
public interface ClienteService {
    
    public List<Cliente> listarClientes();
    
    public Cliente listaClienteId(Cliente cliente);
    
    public void insertaCliente(Cliente cliente);
    
    public void deleteCliente(Cliente cliente);
}
