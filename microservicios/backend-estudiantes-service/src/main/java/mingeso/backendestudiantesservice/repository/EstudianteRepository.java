package mingeso.backendestudiantesservice.repository;

import mingeso.backendestudiantesservice.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Long> {
    EstudianteEntity findByRut(String rut);
}