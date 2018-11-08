package com.aperam.sig.empleado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    Optional<Empleado> findById(@Param("id") Long id);
}