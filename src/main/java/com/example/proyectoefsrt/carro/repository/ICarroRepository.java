package com.example.proyectoefsrt.carro.repository;

import com.example.proyectoefsrt.carro.entity.Carro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarroRepository extends JpaRepository<Carro, Integer> {
	List<Carro> findByObjMarcaIdmarca(int id);
	List<Carro> findByModelo(String modelo);
}
