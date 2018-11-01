package com.aperam.sig.bobina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("bobinaRepository")
public interface BobinaRepository extends JpaRepository<Bobina, Long> {
    Optional<Bobina> findById(@Param("id") Long id);
}