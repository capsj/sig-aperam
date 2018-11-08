package com.aperam.sig.proveedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("proveedorRepository")
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    Optional<Proveedor> findById(@Param("id") Long id);
}