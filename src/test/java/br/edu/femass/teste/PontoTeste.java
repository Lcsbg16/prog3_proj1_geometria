package br.edu.femass.teste;

import br.edu.femass.model.Ponto;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class PontoTeste {

    @Test
    void testConstrutorVazio(){
        Ponto p = new Ponto();
        String esperado = "(0.0,0.0)";

        Assertions.assertEquals(esperado, p.toString());

    }

    @Test
    void testConstrutorComParametros(){
        Ponto p = new Ponto (1.2,3.5);
        String esperado = "(1.2,3.5)";

        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testPrimeiroQuadrante(){
        Ponto p = new Ponto (7.2,4.5);
        String esperado = "(7.2,4.5)";

        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testSegundoQuadrante(){
        Ponto p = new Ponto (-7.2,4.5);
        String esperado = "(-7.2,4.5)";

        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testTerceiroQuadrante(){
        Ponto p = new Ponto (-7.2,-4.5);
        String esperado = "(-7.2,-4.5)";

        Assertions.assertEquals(esperado, p.toString());
    }
    @Test
    void testQuartoQuadrante(){
        Ponto p = new Ponto (7.2,-4.5);
        String esperado = "(7.2,-4.5)";

        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testEixoX(){
        Ponto p = new Ponto (7.2,0.0);
        String esperado = "(7.2,0.0)";

        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testEixoY(){
        Ponto p = new Ponto (0.0,4.5);
        String esperado = "(0.0,4.5)";

        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testOrigem(){
        Ponto p = new Ponto (0.0,0.0);
        String esperado = "(0.0,0.0)";

        Assertions.assertEquals(esperado, p.toString());
    }

    @Test
    void testDistanciaDoisPontos(){
        Ponto p1 = new Ponto(2.0,3.0);
        Ponto p2 = new Ponto(4.0,3.0);
        String esperado = "2.0";

        Assertions.assertEquals(esperado, p1.get_distancia(p2).toString());
    }

    @Test
    void testEquals() {
        Ponto p1 = new Ponto(1.0, 1.0);
        Ponto p2 = new Ponto(1.0, 1.0);
        Assertions.assertTrue(p1.equals(p2));
    }

}
