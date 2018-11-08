package com.aperam.sig.proveedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class ProveedorController {

    @Autowired
    ProveedorRepository proveedorRepository;

    @PostMapping(value = "/api/proveedor")
    public ResponseEntity saveProveedor(@RequestBody Proveedor proveedor)
    {
        return ResponseEntity.ok(proveedorRepository.save(proveedor));
    }

    @GetMapping("/api/proveedor/id/{id}")
    public ResponseEntity<Proveedor> findById(@PathVariable("id") Long id) {
        return proveedorRepository.findById(id).map(proveedor -> ResponseEntity.ok(proveedor)).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
