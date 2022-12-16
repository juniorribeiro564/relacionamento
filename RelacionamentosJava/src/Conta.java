import java.util.ArrayList;

public class Conta {

    private String numero;

    private Double valor;

    private ArrayList<Credito> listaCredito = new ArrayList<Credito>();

    private ArrayList<Debito> listaDebito = new ArrayList<Debito>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void addCredito(Credito credito) {
        this.listaCredito.add(credito);
    }

    public void addDebito(Debito debito) {
        this.listaDebito.add(debito);
    }

    public void depositar(Double valor) {
        Credito credito = new Credito();
        credito.setValor(valor);
        this.addCredito(credito);
    }

    public void sacar(Double valor) {
        Debito debito = new Debito();
        debito.setValor(valor);
        this.addDebito(debito);
    }
}
