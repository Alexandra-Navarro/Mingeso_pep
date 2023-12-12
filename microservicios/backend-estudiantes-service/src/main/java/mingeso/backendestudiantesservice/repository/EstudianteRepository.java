package mingeso.backendestudiantesservice.repository;

import mingeso.backendestudiantesservice.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Long> {
    EstudianteEntity findByRut(String rut);

    @Query("SELECT estudiante FROM EstudianteEntity estudiante WHERE CAST(estudiante.cod_carr AS string)  LIKE %?1% OR estudiante.rut LIKE %?1%")
    List<EstudianteEntity> findAll(String palabraClave);


}