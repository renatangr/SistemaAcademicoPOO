package main;
import model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaAcademico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Disciplina");
            System.out.println("2 - Inserir Professor");
            System.out.println("3 - Inserir Atendente");
            System.out.println("4 - Inserir Aluno");
            System.out.println("5 - Adicionar Disciplina ao Professor");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Informe o código da disciplina: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o nome da disciplina: ");
                    String nomeDisciplina = scanner.nextLine();

                    Disciplina disciplina = new Disciplina(codigo, nomeDisciplina);
                    disciplinas.add(disciplina);
                    System.out.println("Disciplina adicionada com sucesso!");
                    break;
                case 2:
                    System.out.print("Informe o nome do professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("Informe o CPF do professor: ");
                    String cpfProfessor = scanner.nextLine();
                    System.out.print("Informe o número do crachá do professor: ");
                    int numeroCracha = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o salário do professor: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Informe a URL do Lattes do professor: ");
                    String urlLattes = scanner.nextLine();

                    Professor professor = new Professor(nomeProfessor, cpfProfessor, numeroCracha, salario, urlLattes);
                    pessoas.add(professor);
                    System.out.println("Professor adicionado com sucesso!");
                    break;
                case 3:
                    System.out.print("Informe o nome do atendente: ");
                    String nomeAtendente = scanner.nextLine();
                    System.out.print("Informe o CPF do atendente: ");
                    String cpfAtendente = scanner.nextLine();
                    System.out.print("Informe o número do crachá do atendente: ");
                    int numeroCrachaAtendente = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o salário do atendente: ");
                    double salarioAtendente = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Informe o setor do atendente: ");
                    String setorAtendente = scanner.nextLine();
                    System.out.print("Informe a função do atendente: ");
                    String funcaoAtendente = scanner.nextLine();

                    Atendente atendente = new Atendente(nomeAtendente, cpfAtendente, numeroCrachaAtendente, salarioAtendente, setorAtendente, funcaoAtendente);
                    pessoas.add(atendente);
                    System.out.println("Atendente adicionado com sucesso!");
                    break;
                case 4:
                    System.out.print("Informe o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Informe o CPF do aluno: ");
                    String cpfAluno = scanner.nextLine();
                    System.out.print("Informe o RA (Registro Acadêmico) do aluno: ");
                    String raAluno = scanner.nextLine();

                    // Pergunta o código da disciplina à qual o aluno está matriculado
                    System.out.print("Informe o código da disciplina à qual o aluno está matriculado: ");
                    int codigoDisciplina = scanner.nextInt();
                    scanner.nextLine();

                    // Encontra a disciplina correspondente ao código
                    Disciplina disciplinaAluno = null;
                    for (Disciplina d : disciplinas) {
                        if (d.getCodigo() == codigoDisciplina) {
                            disciplinaAluno = d;
                            break;
                        }
                    }

                    if (disciplinaAluno != null) {
                        Aluno aluno = new Aluno(nomeAluno, cpfAluno, raAluno, disciplinaAluno);
                        pessoas.add(aluno);
                        System.out.println("Aluno adicionado com sucesso!");
                    } else {
                        System.out.println("Disciplina com código " + codigoDisciplina + " não encontrada.");
                    }
                    break;
                case 5:
                    System.out.print("Informe o número do crachá do professor: ");
                    int crachaProfessor = scanner.nextInt();
                    scanner.nextLine();

                    // Encontra o professor correspondente ao número do crachá
                    Professor professorParaAdicionarDisciplina = null;
                    for (Pessoa pessoa : pessoas) {
                        if (pessoa instanceof Professor && ((Professor) pessoa).getNumeroCracha() == crachaProfessor) {
                            professorParaAdicionarDisciplina = (Professor) pessoa;
                            break;
                        }
                    }

                    if (professorParaAdicionarDisciplina != null) {
                        System.out.print("Informe o código da disciplina a ser adicionada ao professor: ");
                        int codigoDisciplinaParaAdicionar = scanner.nextInt();
                        scanner.nextLine();

                        // Encontra a disciplina correspondente ao código
                        Disciplina disciplinaParaAdicionar = null;
                        for (Disciplina d : disciplinas) {
                            if (d.getCodigo() == codigoDisciplinaParaAdicionar) {
                                disciplinaParaAdicionar = d;
                                break;
                            }
                        }

                        if (disciplinaParaAdicionar != null) {
                            professorParaAdicionarDisciplina.getDisciplinas().add(disciplinaParaAdicionar);
                            System.out.println("Disciplina adicionada ao professor com sucesso!");
                        } else {
                            System.out.println("Disciplina com código " + codigoDisciplinaParaAdicionar + " não encontrada.");
                        }
                    } else {
                        System.out.println("Professor com número de crachá " + crachaProfessor + " não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa. Até logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
