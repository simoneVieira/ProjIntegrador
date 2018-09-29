/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;


import com.example.demo.model.EstoqueModel;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SimoneBarbosa
 */
@Service
public class EstoqueService {
 @Autowired   
 EstoqueRepository estoqueRepository;
 public void cadastrarEstoque(EstoqueModel estoque) {
        estoqueRepository.save(estoque);
    }

    public EstoqueModel editarEstoque(EstoqueModel estoque) {
       return estoqueRepository.save(estoque);
    }
    

   public void excluirEstoque(Long id) {
        estoqueRepository.deleteById(id);
    }

   public EstoqueModel buscaEstoque(Long id) {
        return estoqueRepository.findById(id).get();
    }

}

 
 
 
 


