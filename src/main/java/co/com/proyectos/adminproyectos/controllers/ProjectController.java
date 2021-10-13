package co.com.proyectos.adminproyectos.controllers;

import co.com.proyectos.adminproyectos.models.Project;
import co.com.proyectos.adminproyectos.models.User;
import co.com.proyectos.adminproyectos.repositories.ProjectRepository;
import co.com.proyectos.adminproyectos.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ProjectController {
    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;

    public ProjectController(UserRepository userRepository, ProjectRepository projectRepository) {
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
    }

    @PostMapping("/proyecto")
    Project newProject(@RequestBody Project project){
        User userId = userRepository.findById(project.getUserId()).orElse(null);
        userId.setRol(userId.getRol());
        userId.setEstado(userId.getEstado());
        userId.setEdad(userId.getEdad());
        userRepository.save(userId);

        project.setFechaInicio(new Date());
        return projectRepository.save(project);
    }

    @GetMapping("/proyectos/{userId}")
    List<Project> userProject(@PathVariable String userId){
        return projectRepository.findByUserId(userId);
    }

    @GetMapping("/proyectos")
    List<Project> getProjects(){
        return projectRepository.findAll();
    }

    @PutMapping("/proyectos/{projectId}")
    Project updateProject(@RequestBody Project newProject, @PathVariable String projectId) {

        return projectRepository.findById(projectId)
                .map(project -> {
                    project.setNombre(newProject.getNombre());
                    project.setEstado(newProject.getEstado());
                    project.setUserId(newProject.getUserId());
                    project.setFechaFin(newProject.getFechaFin());
                    project.setFechaInicio(newProject.getFechaInicio());
                    return projectRepository.save(project);
                })
                .orElseGet(() -> {
                    newProject.setProjectId(projectId);
                    return projectRepository.save(newProject);
                });
    }
}
