package mingeso.backendplanesservice.repository;

import mingeso.backendplanesservice.entity.PlanEntity;
import mingeso.backendplanesservice.entity.PrerrequisitosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PrerrequisitosRepository extends JpaRepository<PrerrequisitosEntity,Long>  {
    List<PrerrequisitosEntity> findByCodasig(String codasig);
}
