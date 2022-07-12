
public class Main {
     public static void main(String[] args) {
         Conta cc = new Contacorrente();
         Conta poupanca = new Contapoupanca();
         cc.depositar(100);
         cc.transferir(100, poupanca);
         cc.imprimirExtrato();
         poupanca.imprimirExtrato();
    }
}
