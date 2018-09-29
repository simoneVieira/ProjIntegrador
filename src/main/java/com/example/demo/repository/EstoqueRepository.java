package com.example.demo.repository;

import com.example.demo.model.EstoqueModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<EstoqueModel, Long> {

}
