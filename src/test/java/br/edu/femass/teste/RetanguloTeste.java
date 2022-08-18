package br.edu.femass.teste;

import br.edu.femass.model.Retangulo;
import br.edu.femass.model.SegmentoReta;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RetanguloTeste {


    @Test
    void testArea(){
        Retangulo retangulo = new Retangulo(
                new SegmentoReta(
                        0.0,
                        0.0,
                        0.0,
                        5.0
                ),
                new SegmentoReta(
                        0.0,
                        0.0,
                        8.0,
                        0.0
                )
        );
        Double esperado = 40.0;
        Assertions.assertEquals(esperado, retangulo.getArea());

    }

    @Test
    void testPerimetro(){
        Retangulo retangulo = new Retangulo(
                new SegmentoReta(
                        0.0,
                        0.0,
                        0.0,
                        5.0
                ),
                new SegmentoReta(
                        0.0,
                        0.0,
                        8.0,
                        0.0
                )
        );
        Double esperado = 26.0;
        Assertions.assertEquals(esperado, retangulo.getPerimetro());
    }
}
