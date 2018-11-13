package com.aperam.sig.ordenDeTrabajo;

import com.aperam.sig.bobina.BobinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class OrdenDeTrabajoController {

    @Autowired
    OrdenDeTrabajoRepository ordenDeTrabajoRepository;

    @Autowired
    BobinaRepository bobinaRepository;

    @PostMapping(value = "/api/orden/trabajo")
    public ResponseEntity saveOrdenDeTrabajo(@RequestBody CrearOrdenDeTrabajo crearOrdenDeTrabajo)
    {
        return ResponseEntity.ok(ordenDeTrabajoRepository.save(new OrdenDeTrabajo(crearOrdenDeTrabajo)));
    }
//        Optional<ResponseEntity> response = bobinaRepository.findById(crearOrdenDeTrabajo.getBobinaId()).map(bobina -> {
//        });
//        return response.orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Bobina not found"));

    @GetMapping("/api/orden/trabajo/id/{id}")
    public ResponseEntity<OrdenDeTrabajo> findById(@PathVariable("id") Long id) {
        return ordenDeTrabajoRepository.findById(id).map(ordenDeTrabajo -> ResponseEntity.ok(ordenDeTrabajo)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/api/orden/trabajo")
    public ResponseEntity<List<OrdenDeTrabajo>> findAll() {
        return ResponseEntity.ok(ordenDeTrabajoRepository.findAll());
    }

    @GetMapping("/api/orden/trabajo/{producto}")
    public ResponseEntity<List<OrdenDeTrabajo>> findByProducto(@PathVariable("producto") Producto producto) {
        return ResponseEntity.ok(ordenDeTrabajoRepository.findByProducto(producto));
    }

    @GetMapping("/api/orden/trabajo/{estado}")
    public ResponseEntity<List<OrdenDeTrabajo>> findByEstado(@PathVariable("estado") Estado estado) {
        return ResponseEntity.ok(ordenDeTrabajoRepository.findByEstado(estado));
    }

    @PutMapping(value = "/api/orden/trabajo")
    public ResponseEntity updateOrdenDeTrabajo(@RequestBody OrdenDeTrabajo ordenDeTrabajo)
    {
        return ResponseEntity.ok(ordenDeTrabajoRepository.save(ordenDeTrabajo));
    }

}
