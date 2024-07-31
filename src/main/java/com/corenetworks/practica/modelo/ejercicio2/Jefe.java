package com.corenetworks.practica.modelo.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Component
@Data
public class Jefe implements IEmpleado{
    @Autowired
    @Qualifier("informeTrimestre2")
    private IInforme informe;

    @Override
    public String getTarea() {
        return "El jefe se encarga de gestionar a su equipo";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
