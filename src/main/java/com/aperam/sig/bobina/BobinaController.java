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
    BobinaRepository bobinaRepository;

    @PostMapping(value = "/api/bobina")
    public ResponseEntity saveBobina(@RequestBody Bobina bobina)
    {
        return ResponseEntity.ok(bobinaRepository.save(bobina));
    }

    @GetMapping("/api/bobina/id/{id}")
    public ResponseEntity<Bobina> findById(@PathVariable("id") Long id) {
        return bobinaRepository.findById(id).map(bobina -> ResponseEntity.ok(bobina)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/api/bobina")
    public ResponseEntity updateBobina(@RequestBody Bobina bobina)
    {
        return ResponseEntity.ok(bobinaRepository.save(bobina));
    }


}
