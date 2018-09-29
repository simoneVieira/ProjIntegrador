/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.model.CarrinhoModel;
import com.example.demo.repository.CarrinhoRepository;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SimoneBarbosa
 */
@Service
public class CarrinhoService {
    @Autowired   
 CarrinhoRepository carrinhoRepository;
 public void cadastrarCarrinho(CarrinhoModel carrinho) {
        carrinhoRepository.save(carrinho);
    }

    public CarrinhoModel editarCarrinho(CarrinhoModel carrinho) {
       return carrinhoRepository.save(carrinho);
    }
    

   public void excluirCarrinho(Long id) {
        carrinhoRepository.deleteById(id);
    }

   public CarrinhoModel buscaCliente(Long id) {
        return carrinhoRepository.findById(id).get();
    }

}


