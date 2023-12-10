package mingeso.backendcarrerasservice.service;

import mingeso.backendcarrerasservice.entity.CarrerasEntity;
import mingeso.backendcarrerasservice.repository.CarrerasRepository;
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
