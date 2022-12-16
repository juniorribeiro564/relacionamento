public class Aplicacao3 {
    public static void main(String[] args) {
        ContaCorrente cp = new ContaCorrente(123.123);
        cp.depositar(100.00);
        cp.depositar(100.00);
        cp.depositar(100.00);

        cp.sacar(50.00);

        System.out.println("Valor da conta é" + cp.calcularSaldo());
    }
}
