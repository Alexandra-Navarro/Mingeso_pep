package mingeso.backendplanesservice.controller;


import mingeso.backendplanesservice.entity.PlanEntity;
import mingeso.backendplanesservice.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlanController {
   @Autowired
   private PlanService planService;

   @GetMapping("/{codCarr}")
   public List<PlanEntity> obtenerPlanPorCodigoCarrera(@PathVariable String codCarr) {
      return planService.obtenerPlanPorCodigoCarrera(codCarr);
   }
}

