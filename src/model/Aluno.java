
package model;

public class Aluno extends Pessoa {
    private String ra;
    

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
   
    @Override
    public String toString() {
        return super.toString() +
                "\nRA: " + ra;
    }
}
