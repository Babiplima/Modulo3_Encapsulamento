package Elevador;
public class Elevador {

    int andarAtual = 0;
    int totalAndares = 10;
    double capacidadeElevador = 10;
    int numeroPessoas = 8;

    //Método de construtor
    public Elevador(int andarAtual, int totalAndares, double capacidadeElevador, int numeroPessoas) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.numeroPessoas = numeroPessoas;
   }
   //Instanciando get e set

    public int getandarAtual(){
        return andarAtual;
    }
    public void setNome(int andarAtual){
        this.andarAtual = andarAtual;
    }
    public int getTotalAndares() {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares){
        this.totalAndares = totalAndares;
   }
    public double getCapacidadeElevador(){
        return capacidadeElevador;
    }
    public void setCapacidadeElevador(double capacidadeElevador){
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    //Método Entrar elevador

    public void entra(int qtPessoas) {

        int totalDeViajantes = qtPessoas + numeroPessoas;
        if (totalDeViajantes > capacidadeElevador) {
            System.out.println("O elevador não comporta não comporta o número de pessoas ");
            System.out.println("Quantidade pessoas que excedeu" + (totalDeViajantes - capacidadeElevador));
        } else {
            numeroPessoas = totalDeViajantes;
        }
    }

    public void sai(int qtPessoas) {
        int totalDeViajantes = numeroPessoas - qtPessoas;
        if (totalDeViajantes <= 0) {
            System.out.println("Você não pode tirar pessoas, do que a quantidade de pessoas presentes. ");
        } else {
            numeroPessoas = totalDeViajantes;
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.printf("Você já está no último andar ");
        }
    }

    public void desce() {
        if (andarAtual>0){
            andarAtual--;
        }else{
            System.out.println("Você já está no térreo ");
        }

    }


}

