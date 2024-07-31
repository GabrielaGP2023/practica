package com.corenetworks.practica.modelo.ejercicio2;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class InformeTrimestre2 implements IInforme{
    @Override
    public String getInforme() {

        return "Informe del Trimestre 2";
    }
}
