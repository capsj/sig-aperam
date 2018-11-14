package com.aperam.sig.bobina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("bobinaRepository")
public interface BobinaRepository extends JpaRepository<Bobina, Long> {

    Optional<Bobina> findById(@Param("id") Long id);

    List<Bobina> findByOrdenDeCompraId(Long id);

    @Query(value = "SELECT b FROM Bobina b WHERE b.aptitudInicial = true and b.estadoProductivo in (:estados)")
    List<Bobina> findCorrectByEstadoProductivo(@Param("estados") List<EstadoProductivo> estadoProductivo);
}