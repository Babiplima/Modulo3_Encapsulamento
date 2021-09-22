package Conta;

public class main {
    public static void main(String[] args) {

        //Instanciando a conta corrente
        Conta conta1 =new Conta("Bárbara Ann",3071,10000);

        //Testando os métodos

        //Depositando
        conta1.demonstrarDados();
        conta1.depositar(5000);
        System.out.println("___________________________");

        //Sacando

        conta1.demonstrarDados();
        conta1.sacar(50);
        System.out.println("____________________________");

        //Sado do usuário
        conta1.demonstrarDados();
        System.out.println("Valor do saldo " + conta1);
    }

    }

