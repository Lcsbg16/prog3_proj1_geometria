public class Teste {
    public static void main(String[] args) {
        SegmentoReta r1 = new SegmentoReta(0.0,0.0,1.0,2.0);
        //System.out.println(r1.getTamanho());

        SegmentoReta r2 = new SegmentoReta(new Ponto(), new Ponto(1.0,2.0));
        //System.out.println(r2.getTamanho());
        //System.out.println(r2.getP1().get_localizacao());
        //System.out.println(r2.getP2().get_localizacao());
        System.out.println(r1);


        Ponto p1 = new Ponto(1.2 , 2.3);

        Ponto p2 = new Ponto(1.2,2.3);

        if(p1.equals(p2)){
            System.out.println("P1 é igual a P2");
        }else{
            System.out.println("P1 é diferente de P2");
        }


        System.out.println(r1.equals(r2));













    }
}
