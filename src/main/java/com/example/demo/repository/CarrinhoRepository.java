package com.example.demo.repository;

import com.example.demo.model.CarrinhoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoRepository extends JpaRepository<CarrinhoModel, Long> {

}