package org.example;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private String contacto;
    private String estadoCivil;
    private String ciudad;

    public Cliente(String nombre, String apellido, String email,
                   String contacto, String estadoCivil, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contacto = contacto;
        this.estadoCivil = estadoCivil;
        this.ciudad = ciudad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getcontacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo electronico='" + email + '\'' +
                ", numero de contacto='" + contacto + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}

