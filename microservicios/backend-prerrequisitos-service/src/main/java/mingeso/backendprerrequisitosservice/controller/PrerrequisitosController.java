package mingeso.backendprerrequisitosservice.controller;

import mingeso.backendprerrequisitosservice.entity.PrerrequisitosEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class PrerrequisitosController {

    @GetMapping("/prerrequisitos/{codasig}")
    public ResponseEntity<List<PrerrequisitosEntity>> getPrerrequisitos(@PathVariable String codasig) {
        List<PrerrequisitosEntity> prerrequisitos = prerrequisitosService.findByCodasig(codasig);
        return ResponseEntity.ok(prerrequisitos);
    }
}
