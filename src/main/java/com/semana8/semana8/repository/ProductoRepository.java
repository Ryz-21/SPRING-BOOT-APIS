package com.semana8.semana8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semana8.semana8.Modelo.Producto;



public interface  ProductoRepository  extends JpaRepository<Producto, Long>{
    
}
