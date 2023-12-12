package mingeso.backendplanesservice.controller;


import mingeso.backendplanesservice.entity.PlanEntity;
import mingeso.backendplanesservice.entity.PrerrequisitosEntity;
import mingeso.backendplanesservice.service.PlanService;
import mingeso.backendplanesservice.service.PrerrequisitosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/planes")
public class PlanController {
    @Autowired
    PlanService planService;

    @Autowired
    PrerrequisitosService prerrequisitosService;

    // Listar carreras de la base de datos
    @GetMapping()
    public ResponseEntity<List<PlanEntity>> listar() {
        List<PlanEntity> planEntities = planService.findAll();
        return ResponseEntity.ok(planEntities);
    }

    @GetMapping("/byCodcarr/{codcarr}")
    public ResponseEntity<List<PlanEntity>> findByCodcarr(@PathVariable String codcarr) {
        List<PlanEntity> planes = planService.findByCodcarr(codcarr);
        return ResponseEntity.ok(planes);
    }

    // Endpoint para obtener prerrequisitos de una asignatura
    @GetMapping("/prerrequisitos/{codasig}")
    public ResponseEntity<List<PrerrequisitosEntity>> getPrerrequisitos(@PathVariable String codasig) {
        List<PrerrequisitosEntity> prerrequisitos = prerrequisitosService.findByCodasig(codasig);
        return ResponseEntity.ok(prerrequisitos);
    }

}
