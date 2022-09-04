package ex_heranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Estudante extends Pessoa {
    private String ra;
    private String curso;
    private LocalDate dataInicio;

    public String toString() {
        return (super.toString() +
                "\nRA do estudante: " + this.ra +
                "\nCurso: " + this.curso +
                "\nData de ingresso: " + this.dataInicio);
    }

    public Estudante() {
        super();

        Scanner inString = new Scanner(System.in);

        System.out.print("Digite o RA: ");
        this.ra = inString.nextLine();

        System.out.print("Digite o curso do estudante: ");
        this.curso = inString.nextLine();

        System.out.print("Digite a data de ingresso do estudante (dd/mm/yyyy): ");
        String dataAdmissao = inString.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataInicio = LocalDate.parse(dataAdmissao, formatter);
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}