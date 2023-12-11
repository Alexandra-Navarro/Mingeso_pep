package mingeso.backendplanesservice.controller;


import mingeso.backendplanesservice.entity.PlanEntity;
import mingeso.backendplanesservice.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/planes")
public class PlanController {
    @Autowired
    PlanService planService;
    // Listar carreras de la base de datos
    @GetMapping()
    public ResponseEntity<List<PlanEntity>> listar() {
        List<PlanEntity> planEntities = planService.findAll();
        return ResponseEntity.ok(planEntities);
    }

}
