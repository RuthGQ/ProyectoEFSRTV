package com.example.proyectoefsrt.tipoEmpleado.entity;

import com.example.proyectoefsrt.empleado.entity.Empleado;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "tb_tipo_empleado")
@AllArgsConstructor
@NoArgsConstructor
public class TipoEmpleado {
    @Id
    @Column(name = "id_tipo")
    private int idTipo;

    @Column(name = "descripcion")
    private String descrip;

    @OneToMany(mappedBy = "objTipo")
    @JsonIgnore
    Set<Empleado> empleado;

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Set<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Set<Empleado> empleado) {
        this.empleado = empleado;
    }
}
