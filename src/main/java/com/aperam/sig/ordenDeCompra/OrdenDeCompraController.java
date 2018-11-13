package com.aperam.sig.ordenDeCompra;

import com.aperam.sig.bobina.Bobina;
import com.aperam.sig.bobina.BobinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class OrdenDeCompraController {

    @Autowired
    OrdenDeCompraRepository ordenDeCompraRepository;

    @Autowired
    BobinaRepository bobinaRepository;

    @PostMapping(value = "/api/orden/compra")
    public ResponseEntity saveOrdenDeCompra(@RequestBody OrdenDeCompra ordenDeCompra)
    {
        ordenDeCompraRepository.save(ordenDeCompra);
        return ResponseEntity.ok(bobinaRepository.save(new Bobina(ordenDeCompra)));
    }

    @GetMapping("/api/orden/compra/id/{id}")
    public ResponseEntity<OrdenDeCompra> findById(@PathVariable("id") Long id) {
        return ordenDeCompraRepository.findById(id).map(ordenDeCompra -> ResponseEntity.ok(ordenDeCompra)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/api/orden/compra")
    public ResponseEntity<List<OrdenDeCompra>> findAll() {
        return ResponseEntity.ok(ordenDeCompraRepository.findAll());
    }
}
