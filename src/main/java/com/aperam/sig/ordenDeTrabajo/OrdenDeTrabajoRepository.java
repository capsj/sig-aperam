package com.aperam.sig.ordenDeTrabajo;

import com.aperam.sig.ordenDeTrabajo.OrdenDeTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("ordenDeTrabajoRepository")
public interface OrdenDeTrabajoRepository extends JpaRepository<OrdenDeTrabajo, Long> {
    Optional<OrdenDeTrabajo> findById(@Param("id") Long id);
    List<OrdenDeTrabajo> findByProductoAndEstado(Producto producto, Estado estado);
    List<OrdenDeTrabajo> findByEstado(Estado estado);
}