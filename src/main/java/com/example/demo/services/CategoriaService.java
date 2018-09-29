/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;


import com.example.demo.model.CategoriaModel;
import com.example.demo.repository.CarrinhoRepository;
import com.example.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SimoneBarbosa
 */
@Service
public class CategoriaService {
 @Autowired   
 CategoriaRepository categoriaRepository;
 public void cadastrarCategoria(CategoriaModel categoria) {
        categoriaRepository.save(categoria);
    }

    public CategoriaModel editarCategoria(CategoriaModel categoria) {
       return categoriaRepository.save(categoria);
    }
    

   public void excluirCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

   public CategoriaModel buscaCategoria(Long id) {
        return categoriaRepository.findById(id).get();
    }

}




