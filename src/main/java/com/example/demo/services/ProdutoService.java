/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;


import com.example.demo.model.ProdutoModel;
import com.example.demo.repository.ImagemRepository;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author SimoneBarbosa
 */
public class ProdutoService {
    @Autowired   
 ProdutoRepository produtoRepository;
 public void cadastrarProduto(ProdutoModel produto) {
        produtoRepository.save(produto);
    }

    public ProdutoModel editarProduto(ProdutoModel produto) {
       return produtoRepository.save(produto);
    }
    

   public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }

   public ProdutoModel buscaImagem(Long id) {
        return produtoRepository.findById(id).get();
    }

}


