package mingeso.backendplanesservice.service;

import mingeso.backendplanesservice.entity.PlanEntity;
import mingeso.backendplanesservice.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {
    @Autowired
    private PlanRepository planRepository;


}
