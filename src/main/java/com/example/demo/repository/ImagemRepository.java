package com.example.demo.repository;

import com.example.demo.model.ImagemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagemRepository extends JpaRepository<ImagemModel, Long> {

}