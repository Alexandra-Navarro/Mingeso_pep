package mingeso.backendestudiantesservice.service;

import mingeso.backendestudiantesservice.entity.EstudianteEntity;
import mingeso.backendestudiantesservice.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;


    public void save(EstudianteEntity estudianteEntity){
        estudianteRepository.save(estudianteEntity);
    }

    public List<EstudianteEntity> findAll(String palabraClave){
        if(palabraClave != null) {
            return estudianteRepository.findAll(palabraClave);
        }
        return estudianteRepository.findAll();
    }

    public EstudianteEntity findByRut(String rut){
        return estudianteRepository.findByRut(rut);
    }


}