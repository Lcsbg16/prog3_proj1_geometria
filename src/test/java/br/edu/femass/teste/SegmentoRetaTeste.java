package br.edu.femass.teste;

import br.edu.femass.model.Ponto;

import br.edu.femass.model.SegmentoReta;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class SegmentoRetaTeste {

    @Test
    void testTamanho() {
        SegmentoReta segmentoReta = new SegmentoReta(0.0,0.0,0.0,5.0);
        Double esperado = 5.0;
        Assertions.assertEquals(esperado, segmentoReta.getTamanho());
    }

    @Test
    void testEquals() {
        SegmentoReta segmentoReta1 = new SegmentoReta(0.0,0.0,0.0,5.0);
        SegmentoReta segmentoReta2 = new SegmentoReta(0.0,0.0,0.0,5.0);
        Assertions.assertTrue(segmentoReta1.equals(segmentoReta2));
    }
}
