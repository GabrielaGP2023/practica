package com.corenetworks.practica.modelo.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Component("d1")
public class Director implements IEmpleado{
    @Autowired
    @Qualifier("informeTrimestre1")
    private IInforme informe;

    @Override
    public String getTarea() {
        return "El director se encarga de ver el rendimiento de su equipo";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
