package mingeso.backendplanesservice.controller;
import mingeso.backendplanesservice.entity.CarrerasEntity;

import mingeso.backendplanesservice.service.CarrerasService;
import mingeso.backendplanesservice.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carreras")
public class CarrerasController {
    @Autowired
    private CarrerasService carrerasService;

    @Autowired
    private PlanService planService;

    // Listar carreras de la base de datos
    @GetMapping()
    public ResponseEntity<List<CarrerasEntity>> listar() {
        List<CarrerasEntity> estudianteEntities = carrerasService.findAll();
        return ResponseEntity.ok(estudianteEntities);
    }


}
