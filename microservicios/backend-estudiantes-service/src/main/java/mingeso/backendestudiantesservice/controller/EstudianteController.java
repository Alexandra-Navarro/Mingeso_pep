package mingeso.backendestudiantesservice.controller;

import mingeso.backendestudiantesservice.entity.EstudianteEntity;
import mingeso.backendestudiantesservice.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @PostMapping()
    public ResponseEntity<EstudianteEntity> newEstudiante(@RequestBody EstudianteEntity estudiante) {
        estudianteService.save(estudiante);
        return ResponseEntity.ok(estudiante);
    }


    // Listar estudiantes de la base de datos
    @GetMapping()
    public ResponseEntity<List<EstudianteEntity>> listar(@RequestParam(name = "palabraClave", required = false) String palabraClave) {
        List<EstudianteEntity> estudianteEntities = estudianteService.findAll(palabraClave);
        return ResponseEntity.ok(estudianteEntities);
    }

    // Opción para eliminar un estudiante
    @GetMapping("/{rut}")
    public ResponseEntity<EstudianteEntity> findByRut(@PathVariable("rut") String rut) {
        EstudianteEntity estudianteEntity = estudianteService.findByRut(rut);
        System.out.println(estudianteEntity);
        return ResponseEntity.ok(estudianteEntity);
    }

}
