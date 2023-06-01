package com.ecommerce.proyectomuebles.model;

public class usuario {

    // Variable declaration

    private Integer numeroIdentificacion;
    private String tipoIdentificacion;
    private String nombre;
    private String apellidp;
    private String pais;
    private String ciudad;
    private String departamento;
    private String localidad;
    private String direccionP;
    private String direccionSe;
    private Integer telefono;
    private String correoElectronico;
    private String contrasena;
    private String rol;


    // Getter
    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidp() {
        return apellidp;
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

    public String getDireccionP() {
        return direccionP;
    }

    public String getDireccionSe() {
        return direccionSe;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

    // Setter


    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidp(String apellidp) {
        this.apellidp = apellidp;
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

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public void setDireccionSe(String direccionSe) {
        this.direccionSe = direccionSe;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // CONSTRUCTOR

    public usuario(Integer numeroIdentificacion, String tipoIdentificacion, String nombre, String apellidp, String pais, String ciudad, String departamento, String localidad, String direccionP, String direccionSe, Integer telefono, String correoElectronico, String contrasena, String rol) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombre = nombre;
        this.apellidp = apellidp;
        this.pais = pais;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.localidad = localidad;
        this.direccionP = direccionP;
        this.direccionSe = direccionSe;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public usuario(){

    }

    @Override
    public String toString() {
        return "usuario{" +
                "numeroIdentificacion=" + numeroIdentificacion +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidp='" + apellidp + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", localidad='" + localidad + '\'' +
                ", direccionP='" + direccionP + '\'' +
                ", direccionSe='" + direccionSe + '\'' +
                ", telefono=" + telefono +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
