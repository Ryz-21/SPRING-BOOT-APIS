package com.semana8.semana8.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semana8.semana8.Modelo.Producto;
import com.semana8.semana8.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoControler {
    @Autowired
    private ProductoService service;

    @GetMapping
    public List<Producto> listar()
    {
        return service.listar();
    }
}
