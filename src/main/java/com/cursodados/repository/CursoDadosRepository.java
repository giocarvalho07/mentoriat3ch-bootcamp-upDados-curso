package com.cursodados.repository;

import com.cursodados.domain.CursoDados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoDadosRepository extends JpaRepository< CursoDados, Long> {
}
