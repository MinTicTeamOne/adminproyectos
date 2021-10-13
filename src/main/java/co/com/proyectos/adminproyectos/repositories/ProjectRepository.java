package co.com.proyectos.adminproyectos.repositories;

import co.com.proyectos.adminproyectos.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProjectRepository extends MongoRepository<Project, String> {
    List<Project> findByUserId (String userId);
}
