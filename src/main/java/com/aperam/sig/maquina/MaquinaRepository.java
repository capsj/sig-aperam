package com.aperam.sig.maquina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("maquinaRepository")
public interface MaquinaRepository extends JpaRepository<Maquina, Long> {
    Optional<Maquina> findById(@Param("id") Long id);
}