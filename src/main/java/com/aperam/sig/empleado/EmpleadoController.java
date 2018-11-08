package com.aperam.sig.empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class EmpleadoController {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @PostMapping(value = "/api/empleado")
    public ResponseEntity saveProveedor(@RequestBody Empleado empleado)
    {
        return ResponseEntity.ok(empleadoRepository.save(empleado));
    }

    @GetMapping("/api/empleado/id/{id}")
    public ResponseEntity<Empleado> findById(@PathVariable("id") Long id) {
        return empleadoRepository.findById(id).map(empleado -> ResponseEntity.ok(empleado)).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
