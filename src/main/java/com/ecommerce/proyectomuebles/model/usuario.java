package com.ecommerce.proyectomuebles.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class usuario {

    // Variable declaration
    @Id
    private Integer numero_identificacion;
    private String tipo_identificacion;
    private String nombre;
    private String apellido;
    private String pais;
    private String ciudad;
    private String departamento;
    private String localidad;
    private String direccion_principal;
    private String dirección_secundaria;
    private Integer telefono;
    private String correo_electronico;
    private String contrasena;
    private String rol;


    public usuario(){

    }

    @Override
    public String toString() {
        return "usuario{" +
                "numero_identificacion=" + numero_identificacion +
                ", tipo_identificacion='" + tipo_identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", localidad='" + localidad + '\'' +
                ", direccion_principal='" + direccion_principal + '\'' +
                ", dirección_secundaria='" + dirección_secundaria + '\'' +
                ", telefono=" + telefono +
                ", correo_electronico='" + correo_electronico + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }

    // Getter

    public Integer getNumero_identificacion() {
        return numero_identificacion;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getDireccion_principal() {
        return direccion_principal;
    }

    public String getDirección_secundaria() {
        return dirección_secundaria;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }


    // Setter

    public void setNumero_identificacion(Integer numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setDireccion_principal(String direccion_principal) {
        this.direccion_principal = direccion_principal;
    }

    public void setDirección_secundaria(String dirección_secundaria) {
        this.dirección_secundaria = dirección_secundaria;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    // CONSTRUCTOR


    public usuario(Integer numero_identificacion, String tipo_identificacion, String nombre, String apellido, String pais, String ciudad, String departamento, String localidad, String direccion_principal, String dirección_secundaria, Integer telefono, String correo_electronico, String contrasena, String rol) {
        this.numero_identificacion = numero_identificacion;
        this.tipo_identificacion = tipo_identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.localidad = localidad;
        this.direccion_principal = direccion_principal;
        this.dirección_secundaria = dirección_secundaria;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.contrasena = contrasena;
        this.rol = rol;
    }
}
