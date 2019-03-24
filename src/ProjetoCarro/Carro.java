package ProjetoCarro;

class Carro {
    String modelo, cor, marca, chassi;
    int ano, nPortas, nMarchas, marchaAtual;
    double velocidadeMaxima, velocidadeAtual,volumeCombustivel;
    boolean tetoSolar, cambioAutomatico;
    Proprietario proprietario;

    void acelera(){
        velocidadeAtual +=1; }
    void freia(){
        velocidadeAtual = 0; }
    void trocaMarcha (int marchaDesejada){
        if (marchaDesejada > nMarchas){
            System.out.println("Erro!");
        }else{
            marchaAtual = marchaDesejada; } }
    void reduzMarcha(){
        marchaAtual -= 1; }
}
