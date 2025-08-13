public class Main {

    public static void main(String[] args) {

        ContaBancaria contaPessoalNubank = new ContaBancaria("002589-6",
                1500.00, "104", "Leonardo Gomes Ferreira",
                "12282705971", "26/08/2005");

        System.out.println("=========================");
        System.out.println("Conta Bancaria");
        System.out.printf("Numero conta: %s\n", contaPessoalNubank.numeroConta);
        System.out.printf("Agencia: %s\n", contaPessoalNubank.agencia);
        System.out.printf("Saldo: %f\n", contaPessoalNubank.saldo);
        System.out.println();
        System.out.println("Dados Pessoais");
        System.out.printf("Nome: %s\n", contaPessoalNubank.titular.nome);
        System.out.printf("CPF: %s\n", contaPessoalNubank.titular.cpf);
        System.out.printf("Data de Nascimento: %s\n", contaPessoalNubank.titular.dataNascimento);

        contaPessoalNubank.saldo = 100000000.00;

        Cartao cartaoNubank = new Cartao("654897231", "005", "14/05", contaPessoalNubank);
        System.out.println();
        System.out.println("Dados do Cartão");
        System.out.printf("Codigo: %s\n", cartaoNubank.codigo);
        System.out.printf("CVV: %s\n", cartaoNubank.cvv);
        System.out.printf("Validade: %s\n", cartaoNubank.validade);
    }
}
