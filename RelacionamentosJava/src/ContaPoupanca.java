public class ContaPoupanca extends Conta{

    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
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
