package br.edu.femass.model;

public class Retangulo extends Quadrado{
    private SegmentoReta altura;
    public Retangulo(SegmentoReta lado, SegmentoReta segmentoReta){
        super(lado);
        this.altura = altura;
        this.lado = lado;
    }

    public SegmentoReta getAltura(){
        return altura;
    }

    @Override
    public Double getArea(){
        return lado.getTamanho()*this.altura.getTamanho();
    }

    @Override
    public Double getPerimetro(){
        return this.lado.getTamanho()*2 + this.altura.getTamanho()*2;
    }



}
