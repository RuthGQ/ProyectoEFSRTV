package com.example.proyectoefsrt.carro.repository;

import com.example.proyectoefsrt.carro.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICarroRepository extends JpaRepository<Carro, Integer> {
    public List<Carro> findById (int id);
}
