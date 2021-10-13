package co.com.proyectos.adminproyectos.models;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String userId;

    private String rol;
    private String estado;
    private Integer edad;

    public User(String userId, String rol, String estado, Integer edad) {
        this.userId = userId;
        this.rol = rol;
        this.estado = estado;
        this.edad = edad;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
