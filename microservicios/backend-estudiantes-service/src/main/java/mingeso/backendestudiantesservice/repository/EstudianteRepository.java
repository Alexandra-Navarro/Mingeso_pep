package mingeso.backendestudiantesservice.repository;

import mingeso.backendestudiantesservice.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Long> {
    EstudianteEntity findByRut(String rut);

    List<EstudianteEntity> findByCodCarr(Integer codCarr);

}