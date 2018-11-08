package com.aperam.sig.averia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("averiaRepository")
public interface AveriaRepository extends JpaRepository<Averia, Long> {
    Optional<Averia> findById(@Param("id") Long id);
}