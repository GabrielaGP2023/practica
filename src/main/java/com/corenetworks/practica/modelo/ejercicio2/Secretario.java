package com.corenetworks.practica.modelo.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Component
public class Secretario implements IEmpleado{
    @Autowired
    @Qualifier("informeTrimestre2")
    private IInforme informe;
    private String empresa;
    private String email;

    @Override
    public String getTarea() {
        return "El Secretario se encarga de hacer las minutas de las reuniones";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
