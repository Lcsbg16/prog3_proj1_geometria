package br.edu.femass.teste;

import br.edu.femass.model.Quadrado;
import br.edu.femass.model.SegmentoReta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    void testArea() {
        Quadrado q1 = new Quadrado(
                new SegmentoReta(
                    0.0,
                    0.0,
                    0.0,
                    5.0
                )
        );

        Double esperado = 25.0;
        Assertions.assertEquals(esperado,q1.getArea());
    }

    @Test
    void testPerimetro() {
        Quadrado q1 = new Quadrado(
                new SegmentoReta(
                        0.0,
                        0.0,
                        0.0,
                        5.0
                )
        );

        Double esperado = 20.0;
        Assertions.assertEquals(esperado, q1.getPerimetro());

    }
}