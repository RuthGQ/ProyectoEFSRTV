package com.example.proyectoefsrt.marca.repository;

import com.example.proyectoefsrt.marca.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMarcaRepository extends JpaRepository<Marca,Integer> {
}
