public class Principal {

    public static void main(String[] args) {

        Conta cont = new Conta();
        cont.depositar(123.3);

        Cliente c = new Cliente();
        c.setVip(true);

        Pessoa p = new Pessoa();
        p.setNome("Junior");
        p.setCpf("485.244.008-55");
        p.setTelefone("(11) 96548-1457");

        Endereco e = new Endereco();
        e.setCep("09571-310");
        e.setCidade("São Caetano do Sul");
        e.setNumero("925");
        e.setLogradouro("Rua Cavalheiro Giuliano");
        e.setUf("SP");
        e.setComplemento("casa");
        e.setCliente(c);

        Funcionario f = new Funcionario();
        f.setSalario(10.000);-

        ContaCorrente cc = new ContaCorrente(123.123);
        cc.setLimite(123.123);
        cc.setCliente(c);

    }

}
