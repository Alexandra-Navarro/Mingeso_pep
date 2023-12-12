package mingeso.backendplanesservice.service;

import mingeso.backendplanesservice.entity.PrerrequisitosEntity;
import mingeso.backendplanesservice.repository.PrerrequisitosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrerrequisitosService {

    @Autowired
    private PrerrequisitosRepository prerrequisitosRepository;
    public List<PrerrequisitosEntity> findByCodasig(String codasig) {
        return prerrequisitosRepository.findByCodasig(codasig);
    }

}
