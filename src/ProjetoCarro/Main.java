package ProjetoCarro;

public class Main {
    public static void main (String args []){
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Katherine";
        proprietario.cpf = "13942027386";
        proprietario.rg = "7145842";
        proprietario.dataNascimento = "17/05/1998";
        proprietario.rua = "Av. Alcindo Cacela";
        proprietario.bairro = "Umarizal";
        proprietario.cidade = "Belém";
        proprietario.estado = "Pará";
        proprietario.cep = "66186-531";
        proprietario.complemento = "Apartamento";

        Carro carro = new Carro();
        carro.modelo = "Palio";
        carro.cor = "Prata";
        carro.marca = "Fiat";
        carro.chassi = "0293EAY836290";
        carro.ano = 2007;
        carro.nPortas = 4;
        carro.nMarchas = 5;
        carro.marchaAtual = 1;
        carro.velocidadeMaxima = 100;
        carro.velocidadeAtual = 10;
        carro.volumeCombustivel = 50;

        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        System.out.println(carro.velocidadeAtual);
        System.out.println(carro.marchaAtual);
        carro.trocaMarcha(3);
        System.out.println(carro.marchaAtual);

    }
}
