package com.aperam.sig.bobina;

import com.aperam.sig.ordenDeTrabajo.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class BobinaController {

    @Autowired
    BobinaRepository bobinaRepository;

    @PostMapping(value = "/api/bobina")
    public ResponseEntity saveBobina(@RequestBody CrearBobina bobina)
    {
        return ResponseEntity.ok(bobinaRepository.save(new Bobina(bobina)));
    }

    @GetMapping("/api/bobina/id/{id}")
    public ResponseEntity<Bobina> findById(@PathVariable("id") Long id) {
        return bobinaRepository.findById(id).map(bobina -> ResponseEntity.ok(bobina)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/api/bobina/compra/{id}")
    public ResponseEntity<List<Bobina>> findByOrdenDeComporaId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(bobinaRepository.findByOrdenDeCompraId(id));
    }

    @GetMapping("/api/bobina/correct")
    public ResponseEntity<List<Bobina>> findCorrect() {
        return ResponseEntity.ok(bobinaRepository.findCorrectByEstadoProductivo(new ArrayList<EstadoProductivo>(Arrays.asList(
                EstadoProductivo.PENDIENTE_CONTROL,
                EstadoProductivo.RETRABAJO
        ))));
    }

    @PutMapping(value = "/api/bobina")
    public ResponseEntity updateBobina(@RequestBody Bobina bobina)
    {
        return ResponseEntity.ok(bobinaRepository.save(bobina));
    }


}
