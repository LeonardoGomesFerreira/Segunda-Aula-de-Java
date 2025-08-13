public class ContaBancaria {

    String numeroConta;

    double saldo;

    String agencia;

    Pessoa titular;

    Cartao[] cartoes;

    ContaBancaria(String numeroConta, double saldo, String agencia, String nomePessoa,
                  String cpfPessoa, String dataNascimentoPessoa){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
        titular = new Pessoa(nomePessoa, cpfPessoa, dataNascimentoPessoa);
    }

}
