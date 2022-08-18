package br.edu.femass.model;

public class Ponto {
    private Double x;
    private Double y;

    public Double getx(){
        return this.x;
    }

    public Double gety(){
        return this.y;
    }

    public Ponto(){
        this.x=0D;
        this.y=0D;
    }
    public Ponto(Double x,Double y){
        this.x=x;
        this.y=y;
    }

    public String get_localizacao(){
        if(x>0 && y>0)
            return "Primeiro Quadrante";

        if(x<0 && y>0)
            return "Segundo Quadrante";

        if(x<0 && y<0)
            return "Terceiro Quadrante";

        if(x>0 && y<0)
            return "Quarto Quadrante";

        if(x==0 && y!=0)
            return "Eixo Y";

        if(x!=0 && y==0)
            return "Eixo X";

        return "Origem";
    }

    public Double get_distancia(Ponto p){
        return Math.sqrt(Math.pow(p.getx()-this.x,2)+Math.pow(p.gety()-this.y,2));
    }

    public String toString(){
        return "("+ this.x.toString() + ","+ this.y.toString() +")";
    }

    public boolean equals(Object object){
        Ponto p = (Ponto) object;

        if(p.getx().equals(this.x) && p.gety().equals(this.y)) return true;
        return false;
    }
}
