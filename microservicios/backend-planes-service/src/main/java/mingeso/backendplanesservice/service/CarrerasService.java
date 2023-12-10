package mingeso.backendplanesservice.service;

import mingeso.backendplanesservice.entity.CarrerasEntity;
import mingeso.backendplanesservice.entity.PlanEntity;
import mingeso.backendplanesservice.repository.CarrerasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarrerasService {
    @Autowired
    private CarrerasRepository carrerasRepository;

    public List<CarrerasEntity> findAll(){
        return carrerasRepository.findAll();
    }

}
