package br.edu.femass.teste;

import br.edu.femass.model.SegmentoReta;
import br.edu.femass.model.Ponto;

public class SegmentoRetaTeste {
    public static void main(String[] args) {
        SegmentoReta r1 = new SegmentoReta(0.0,0.0,1.0,2.0);

        SegmentoReta r2 = new SegmentoReta(new Ponto(), new Ponto(1.0,2.0));


        System.out.println(r1.equals(r2));
    }
}
