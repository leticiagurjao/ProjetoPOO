public class ProjetoPraia {
    public static void main (String args []){
        Crianca c1 = new Crianca();
        c1.altura = 1.6;
        c1.corCabelo = "Loiro";
        c1.corPele = "Branca";
        c1.idade = 10;
        c1.brincar();
        c1.correr(100);
        String sorriso = c1.sorrir();
        System.out.println(sorriso);

        Crianca c2 = new Crianca();
        c2.altura = 1.4;
        c2.corCabelo = "Ruivo";
        c2.corPele = "Branca";
        c2.idade = 5;
        c2.brincar();
        c2.nadar(50);
        System.out.println(c2.sorrir());

        Adulto a1 = new Adulto();
        a1.corCabelo = "Ruivo";
        a1.idade = 30;
        a1.atividade = "Aproveitando o sol";
        System.out.println(a1.corCabelo);
        System.out.println(a1.idade);
        System.out.println(a1.atividade);
        a1.relaxar();


    }
}
