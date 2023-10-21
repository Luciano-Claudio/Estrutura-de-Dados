package Mika;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNums = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        Contato c = new Contato();
        System.out.println("Digite seu telefone:");
        c.setTelefoneResid(leitor.nextLine());
        System.out.println("Digite seu celular:");
        c.setCelular(leitor.nextLine());
        System.out.println("Digite seu email:");
        c.setEmail(leitor.nextLine());

        Data d = new Data();
        System.out.println("Digite o dia do seu nascimento:");
        d.setDia(leitorNums.nextInt());
        System.out.println("Digite o mes do seu nascimento:");
        d.setMes(leitorNums.nextInt());
        System.out.println("Digite o ano do seu nascimento:");
        d.setAno(leitorNums.nextInt());

        Endereco e = new Endereco();
        System.out.println("Digite seu logradouro");
        e.setLogradouro(leitor.nextLine());
        System.out.println("Digite o número da sua casa:");
        e.setNumero(leitorNums.nextInt());
        System.out.println("Digite seu bairro");
        e.setBairro(leitor.nextLine());
        System.out.println("Digite sua cidade");
        e.setCidade(leitor.nextLine());
        System.out.println("Digite seu estado");
        e.setEstado(leitor.nextLine());
        System.out.println("Digite seu cep");
        e.setCep(leitor.nextLine());

        Pessoa p = new Pessoa(nome, d, e, c);

    }
}
