package model;

import java.util.ArrayList;

public class Professor extends Funcionario { 
    private String urlLattes;
    private ArrayList<Disciplina> disciplinas;

   
    public Professor(){
        
    }
    
    public Professor(String nome, String cpf, int numeroCracha, double salario, String urlLattes) {
        super(nome, cpf, numeroCracha, salario);
        this.urlLattes = urlLattes;
        this.disciplinas = new ArrayList<>(); // Inicialize a lista de disciplinas
    
    }

    public String getUrlLattes() {
        return urlLattes;
    }

    public void setUrlLattes(String urlLattes) {
        this.urlLattes = urlLattes;
    }
    
    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    // Método para remover uma disciplina do ArrayList de disciplinas
    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public void bonificacao(double valor){
        super.bonificacao(valor);
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nURL Lattes: " + urlLattes +
                "\nDisciplinas: " + disciplinas;
    }
    
    
}
