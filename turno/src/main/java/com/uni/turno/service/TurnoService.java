package com.uni.turno.service;

import com.uni.turno.dto.TurnoDTO;
import com.uni.turno.exception.TurnoNotFoundException;
import com.uni.turno.model.Turno;
import com.uni.turno.repository.TurnoRepository;
import com.uni.turno.validation.TurnoValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class TurnoService {

    private final TurnoRepository turnoRepository;

    @Autowired
    public TurnoService(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    public Turno createTurno(TurnoDTO turnoDTO) {

        TurnoValidator.validateTurnoDTO(turnoDTO);
        Turno turno = new Turno();
        turno.setNombre(turnoDTO.getNombre());
        turno.setEdad(turnoDTO.getEdad());
        turno.setApellido(turnoDTO.getApellido());
        turno.setDocumento(turnoDTO.getDocumento());

        return turnoRepository.save(turno);
    }

    public Turno getTurno(Long id) {
        return turnoRepository.findById(id).orElseThrow(() -> new TurnoNotFoundException("Turno no encontrado"));
    }

    public Turno updateTurno(Long id, TurnoDTO turnoDTO) {
        TurnoValidator.validateTurnoDTO(turnoDTO);
        Turno turno = getTurno(id);
        turno.setNombre(turnoDTO.getNombre());
        turno.setEdad(turnoDTO.getEdad());
        turno.setApellido(turnoDTO.getApellido());
        turno.setDocumento(turnoDTO.getDocumento());
        turno.setFecha(turnoDTO.getFecha());
        return turnoRepository.save(turno);
    }
    public List<Turno> getAllTurnos() {
        return turnoRepository.findAll();
    }
    public void deleteTurno(Long id) {
        Turno turno = getTurno(id);
        turnoRepository.delete(turno);
    }


}