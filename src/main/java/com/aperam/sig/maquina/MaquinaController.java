package com.aperam.sig.maquina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class MaquinaController {

    @Autowired
    MaquinaRepository maquinaRepository;

    @PostMapping(value = "/api/maquina")
    public ResponseEntity saveMaquina(@RequestBody Maquina maquina)
    {
        return ResponseEntity.ok(maquinaRepository.save(maquina));
    }

    @GetMapping("/api/maquina/id/{id}")
    public ResponseEntity<Maquina> findById(@PathVariable("id") Long id) {
        return maquinaRepository.findById(id).map(maquina -> ResponseEntity.ok(maquina)).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
