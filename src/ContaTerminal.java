import dominio.Person;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person personagem = new Person();

        System.out.println("qual o seu nome: ");
        personagem.nome = scanner.nextLine();

        System.out.print("Digite o número da sua agência (Ex.: 1234): ");
        personagem.agencia = scanner.nextLine();

        System.out.print("Digite o numero da sua conta de 4 digitos: ");
        personagem.conta = Integer.parseInt(scanner.nextLine());

        System.out.print("qual o seu saldo ?");
        personagem.saldo = Double.parseDouble(scanner.nextLine());

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado = formatoMoeda.format(personagem.saldo);



        System.out.println("========Conta Bancaria=========");

        System.out.println(personagem.nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + personagem.agencia +
                ", conta " + personagem.conta + " e o seu saldo " + valorFormatado + " ja esta disponvel.");

        scanner.close();
    }
}
