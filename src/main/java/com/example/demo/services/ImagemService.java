/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;


import com.example.demo.model.ImagemModel;
import com.example.demo.repository.EstoqueRepository;
import com.example.demo.repository.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SimoneBarbosa
 */
@Service
public class ImagemService {
 @Autowired   
 ImagemRepository imagemRepository;
 public void cadastrarImagem(ImagemModel imagem) {
        imagemRepository.save(imagem);
    }

    public ImagemModel editarImagem(ImagemModel imagem) {
       return imagemRepository.save(imagem);
    }
    

   public void excluirImagem(Long id) {
        imagemRepository.deleteById(id);
    }

   public ImagemModel buscaImagem(Long id) {
        return imagemRepository.findById(id).get();
    }

}


