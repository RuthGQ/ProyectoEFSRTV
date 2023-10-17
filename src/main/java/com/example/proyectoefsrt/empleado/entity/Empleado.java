package com.example.proyectoefsrt.empleado.entity;

import com.example.proyectoefsrt.tipoEmpleado.entity.TipoEmpleado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_empleado")
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int idEmpleado;
    private String dni;
    @Column(name = "nombre")
    private String nom;
    @Column(name = "apellido")
    private String ape;
    @Column(name = "telefono")
    private String tel;
    private String user;
    private String clave;
    @Column(name = "img_empleado")
    private String img;
    @ManyToOne()
    @JoinColumn(name = "id_tipo")
    TipoEmpleado objTipo;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public TipoEmpleado getObjTipo() {
        return objTipo;
    }

    public void setObjTipo(TipoEmpleado objTipo) {
        this.objTipo = objTipo;
    }
}
