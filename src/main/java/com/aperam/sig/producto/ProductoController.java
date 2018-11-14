package com.aperam.sig.producto;

import com.aperam.sig.ordenDeTrabajo.OrdenDeTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    OrdenDeTrabajoRepository ordenDeTrabajoRepository;

    @PostMapping(value = "/api/producto")
    public ResponseEntity saveProducto(@RequestBody CrearProductoFinal crearProductoFinal)
    {

        Optional<ResponseEntity> response = ordenDeTrabajoRepository.findById(crearProductoFinal.getOrdenDeTrabajoId()).map(ordenDeTrabajo -> {
            return ResponseEntity.ok(productoRepository.save(new ProductoFinal(crearProductoFinal, ordenDeTrabajo)));
        });
        return response.orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Orden de trabajo not found"));
    }

    @GetMapping("/api/producto/id/{id}")
    public ResponseEntity<ProductoFinal> findById(@PathVariable("id") Long id) {
        return productoRepository.findById(id).map(producto -> ResponseEntity.ok(producto)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/api/producto/trabajo/{id}")
    public ResponseEntity<ProductoFinal> findByOrdenDeTrabajoId(@PathVariable("id") Long id) {
        return productoRepository.findByOrdenDeTrabajoId(id).map(producto -> ResponseEntity.ok(producto)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/api/producto/{estado}")
    public ResponseEntity<List<ProductoFinal>> findByEstadoProductivo(@PathVariable("estado") EstadoProductivo estado) {
        return ResponseEntity.ok(productoRepository.findByEstadoProductivo(estado));
    }

    @PutMapping(value = "/api/producto")
    public ResponseEntity updateProductoFinal(@RequestBody ProductoFinal producto)
    {
        return ResponseEntity.ok(productoRepository.save(producto));
    }


}
