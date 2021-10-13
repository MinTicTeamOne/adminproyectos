package co.com.proyectos.adminproyectos.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Project {

    @Id
    private String projectId;

    private String nombre;
    private String estado;
    private String userId;
    private Date fechaInicio;
    private Date fechaFin;

    public Project(String projectId, String nombre, String estado, String userId, Date fechaInicio, Date fechaFin) {
        this.projectId = projectId;
        this.nombre = nombre;
        this.estado = estado;
        this.userId = userId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) { this.estado = estado; }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
