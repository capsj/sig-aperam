package com.aperam.sig.producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("productoRepository")
public interface ProductoRepository extends JpaRepository<ProductoFinal, Long> {
    Optional<ProductoFinal> findById(@Param("id") Long id);
    Optional<ProductoFinal> findByOrdenDeTrabajoId(Long id);
    List<ProductoFinal> findByEstadoProductivo(EstadoProductivo estadoProductivo);
}