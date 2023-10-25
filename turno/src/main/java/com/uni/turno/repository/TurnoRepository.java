package com.uni.turno.repository;

import com.uni.turno.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository extends JpaRepository<Turno, Long> {
}