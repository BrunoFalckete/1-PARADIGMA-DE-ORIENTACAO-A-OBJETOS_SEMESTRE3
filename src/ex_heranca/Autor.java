package ex_heranca;

import java.time.LocalDate;
import java.util.Scanner;

public class Autor extends Pessoa {
    private String formacao;
    private int quantidadeLivros;

    public String toString() {
        return (super.toString() +
                "\nFormacao do autor: " + this.formacao +
                "\nQuantidade de livros publicados: " + this.quantidadeLivros);
    }

    public Autor() {
        super();

        Scanner inString = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);

        System.out.print("Digite a formacao do autor: ");
        this.formacao = inString.nextLine();

        System.out.print("Digite a quantidade de livros escritos pelo autor: ");
        this.quantidadeLivros = inInt.nextInt();
    }

    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQuantidadeLivros() {
        return this.quantidadeLivros;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }
}
