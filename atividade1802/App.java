public class App {
    public static void main(String[] args) {
        Banco BB = new Banco("Julio", new ContaCorrente(), "Mariana", new ContaCorrente(), "Jenifer", new ContaCorrente());
        BB.creditar("Mariana", 1000);
        BB.debitar("Julio", 500);
        BB.creditar("Jenifer", 2000);
        BB.transferir("Mariana", "Jenifer", 500);
        BB.transferir("Jenifer", "Julio", 1000);
        System.out.println("Saldo de Mariana: " + BB.getSaldo("Mariana"));
        System.out.println("Saldo de Julio: " + BB.getSaldo("Julio"));
        System.out.println("Saldo de Jenifer: " + BB.getSaldo("Jenifer"));
    }
}