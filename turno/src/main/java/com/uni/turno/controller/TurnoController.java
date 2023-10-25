package com.uni.turno.controller;

import com.uni.turno.dto.TurnoDTO;
import com.uni.turno.exception.TurnoNotFoundException;
import com.uni.turno.model.Turno;
import com.uni.turno.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private final TurnoService turnoService;

    @Autowired
    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @PostMapping
    public Turno createTurno(@RequestBody TurnoDTO turnoDTO) {
        return turnoService.createTurno(turnoDTO);
    }
    @GetMapping
    public List<Turno> getAllTurnos() {
        return turnoService.getAllTurnos();
    }
    @GetMapping("/{id}")
    public Turno getTurno(@PathVariable Long id) {
        return turnoService.getTurno(id);
    }

    @PutMapping("/{id}")
    public Turno updateTurno(@PathVariable Long id, @RequestBody TurnoDTO turnoDTO) {
        return turnoService.updateTurno(id, turnoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTurno(@PathVariable Long id) {
        turnoService.deleteTurno(id);
    }
}