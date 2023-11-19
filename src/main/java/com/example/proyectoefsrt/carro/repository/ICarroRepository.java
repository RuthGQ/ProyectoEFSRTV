package com.example.proyectoefsrt.carro.repository;

import com.example.proyectoefsrt.carro.entity.Carro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarroRepository extends JpaRepository<Carro, Integer> {
	List<Carro> findByObjMarca_Descripcion(String MarcaDes);
	List<Carro> findByModelo(String Modelo);
}
