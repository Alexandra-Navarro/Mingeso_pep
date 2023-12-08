package mingeso.backendplanesservice.service;

import mingeso.backendplanesservice.entity.PlanEntity;
import mingeso.backendplanesservice.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    public List<PlanEntity> obtenerPlanPorCodigoCarrera(String cod_carr) {
        return planRepository.findByCodigoCarrera(cod_carr);
    }
}
