package ex_heranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected String endereco;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Outros métodos

    public String toString() {
        return ("Nome: " + this.nome +
                "\nData de nascimento: " + this.dataNascimento +
                "\nEndereco: " + this.endereco);
    }

    public Pessoa() {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = in.nextLine();
        this.nome = nome;

        System.out.print("Digite o endereco: ");
        String endereco = in.nextLine();
        this.endereco = endereco;

        System.out.print("Digite a data de nascimento (dd/mm/yyyy): ");
        String dataNascimento = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataNascimento = LocalDate.parse(dataNascimento, formatter);
        this.dataNascimento = novaDataNascimento;
    }
}
