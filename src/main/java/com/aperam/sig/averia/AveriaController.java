package com.aperam.sig.averia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class AveriaController {

    @Autowired
    AveriaRepository averiaRepository;

    @PostMapping(value = "/api/averia")
    public ResponseEntity saveBobina(@RequestBody Averia averia)
    {
        return ResponseEntity.ok(averiaRepository.save(averia));
    }

    @GetMapping("/api/averia/id/{id}")
    public ResponseEntity<Averia> findById(@PathVariable("id") Long id) {
        return averiaRepository.findById(id).map(averia -> ResponseEntity.ok(averia)).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
