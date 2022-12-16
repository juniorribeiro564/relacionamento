public class ContaCorrente extends Conta{

    private Double limite;
    private Cliente cliente;

    public ContaCorrente(Double limite) {
        this.setLimite(limite);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir(Double Valor) {

    }

    public void sacar(Double valor) {
        if(calcularSaldo() < valor) {
            System.out.println("Saldo Insuficiente");
        }
        else {
            super.sacar(valor);
        }
    }

    public Double calcularSaldo() {
        // fazer a conta do saldo, soma os creditos e deminui os debitos
        return 100.00;
    }
}
