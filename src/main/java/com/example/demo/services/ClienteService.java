/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.model.ClienteModel;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SimoneBarbosa
 */
@Service
public class ClienteService {
 @Autowired   
 ClienteRepository clienteRepository;
 public void cadastrarCliente(ClienteModel cli) {
        clienteRepository.save(cli);
    }

    public ClienteModel editarCliente(ClienteModel cli) {
       return clienteRepository.save(cli);
    }
    

   public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }

   public ClienteModel buscaCliente(Long id) {
        return clienteRepository.findById(id).get();
    }

}

 
 
 
 
