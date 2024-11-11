package com.example.backend.controller;

import com.example.backend.model.Producto;
import com.example.backend.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository repository;

    // Método para manejar la ruta principal
    @GetMapping("/")
    public String saludo() {
        return "Hola, bienvenido a la API de productos!";
    }

    @GetMapping
    public List<Producto> obtenerProductos() {
        return repository.findAll();
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return repository.save(producto);
    }
}
