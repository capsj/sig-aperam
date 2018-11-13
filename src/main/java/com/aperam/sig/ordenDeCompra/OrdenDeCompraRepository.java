package com.aperam.sig.ordenDeCompra;

import com.aperam.sig.bobina.Bobina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("ordenDeCompraRepository")
public interface OrdenDeCompraRepository extends JpaRepository<OrdenDeCompra, Long> {
    Optional<OrdenDeCompra> findById(@Param("id") Long id);
}