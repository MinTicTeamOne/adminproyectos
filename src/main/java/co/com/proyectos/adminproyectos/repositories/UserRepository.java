package co.com.proyectos.adminproyectos.repositories;

import co.com.proyectos.adminproyectos.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
