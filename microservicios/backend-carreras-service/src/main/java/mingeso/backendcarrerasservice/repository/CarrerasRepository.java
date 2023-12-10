package mingeso.backendcarrerasservice.repository;

import mingeso.backendcarrerasservice.entity.CarrerasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrerasRepository extends JpaRepository<CarrerasEntity, Long> {
}
