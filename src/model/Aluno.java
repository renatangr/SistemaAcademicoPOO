
package model;

public class Aluno extends Pessoa {
    private String ra;
    private double nota1;
    private double nota2;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
   
    @Override
    public String toString() {
        return super.toString() +
                "\nRA: " + ra +
                "\nNota 1: " + nota1 +
                "\nNota 2: " + nota2;
    }
}
