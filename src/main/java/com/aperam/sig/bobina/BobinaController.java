package com.aperam.sig.bobina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class BobinaController {

    @Autowired
    BobinaRepository repository;

    @PostMapping(value = "/bobina")
    public ResponseEntity saveBobina(@RequestBody Bobina bobina)
    {
        return ResponseEntity.ok(repository.save(bobina));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Bobina> findById(@PathVariable("id") Long id) {
        return repository.findById(id).map(bobina -> ResponseEntity.ok(bobina)).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
