package edu.co.cedesistemas.reactiva.modulo2.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    private Integer Id;
    private String nombre;

    @Override
    public String toString() {
        return "Curso{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
