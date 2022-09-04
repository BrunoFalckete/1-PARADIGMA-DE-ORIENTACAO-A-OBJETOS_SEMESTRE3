package ex_heranca;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int matricula;
    private LocalDate dataAdmissao;
    private String cargo;

    public String toString() {
        return (super.toString() +
                "\nMatricula: " + this.matricula +
                "\nData de admissao: " + this.dataAdmissao +
                "\nCargo: " + this.cargo);
    }

    public Funcionario() {
        super();

        Scanner inString = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);

        System.out.print("Digite o numero da matricula: ");
        this.matricula = inInt.nextInt();

        System.out.print("Digite o cargo: ");
        this.cargo = inString.nextLine();

        System.out.print("Digite a data de admissao(dd/mm/yyyy): ");
        String data = inString.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataAdmissao = LocalDate.parse(data, formatter);
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
