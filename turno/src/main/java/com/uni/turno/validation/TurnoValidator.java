package com.uni.turno.validation;

import com.uni.turno.dto.TurnoDTO;
import com.uni.turno.exception.TurnoNotFoundException;

public class TurnoValidator {
    public static void validateTurnoDTO(TurnoDTO turno) {
        if (turno.getNombre() == null || turno.getNombre().isEmpty()) {
            throw new TurnoNotFoundException("El nombre del turno es obligatorio.");
        }


        if (turno.getDocumento() == null) {
            throw new TurnoNotFoundException("el documento del turno es obligatorio.");
        }

        if (turno.getApellido() == null || turno.getApellido().isEmpty()) {
            throw new TurnoNotFoundException("El apellido del turno es obligatorio.");
        }


        if (turno.getEdad() <= 0) {
            throw new TurnoNotFoundException("La edad del paciente es obligatoria y debe ser mayor que cero.");
        }
        if (turno.getDocumento() == null || turno.getDocumento().isEmpty()) {
            throw new IllegalArgumentException("El documento no puede estar vacío.");
        }
        if (turno.getDocumento().length() > 8) {
            throw new IllegalArgumentException("El documento no puede tener más de 8 caracteres.");
        }

    }
}
