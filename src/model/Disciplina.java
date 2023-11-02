package model;
import java.util.ArrayList;
/**
 *
 * @author RenataMorinigoLimaNe
 */
public class Disciplina {
    private int codigo;
    private String nome;
    private ArrayList<Aluno> alunos;

    public Disciplina(){
        
    }
    
    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar um aluno ao ArrayList de alunos
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para remover um aluno do ArrayList de alunos
    public void removeAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    @Override
    public String toString() {
        return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", alunos=" + alunos + "]";
    }
    
}
