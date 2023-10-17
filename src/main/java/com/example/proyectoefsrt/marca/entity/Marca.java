package com.example.proyectoefsrt.marca.entity;

import com.example.proyectoefsrt.carro.entity.Carro;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "tb_marca")
public class Marca {
    @Id
    @Column(name = "id_marca")
    private int idmarca;

    @Column(name = "nom_marca")
    private String descripcion;

    @OneToMany(mappedBy = "objMarca")
    @JsonIgnore
    Set<Carro> carro;

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Carro> getCarro() {
        return carro;
    }

    public void setCarro(Set<Carro> carro) {
        this.carro = carro;
    }
}
