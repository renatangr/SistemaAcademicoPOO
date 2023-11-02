package model;

import java.util.ArrayList;

public class Atendente extends Funcionario { 
    private String urlLattes;
    private ArrayList<Disciplina> disciplinas;
    
    public Atendente(){
        
    }
    
    public Atendente(String nome, String cpf, int numeroCracha, double salario, String urlLattes) {
        super(nome, cpf, numeroCracha, salario);
        this.urlLattes = urlLattes;
    }

    public String getUrlLattes() {
        return urlLattes;
    }

    public void setUrlLattes(String urlLattes) {
        this.urlLattes = urlLattes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    
    @Override
    public String toString() {
        return super.toString() +
                "\nURL Lattes: " + urlLattes +
                "\nDisciplinas: " + disciplinas;
    }
    
    
}
