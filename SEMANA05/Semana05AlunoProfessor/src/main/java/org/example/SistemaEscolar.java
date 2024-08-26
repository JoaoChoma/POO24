package org.example;

public class SistemaEscolar {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Professor João");
        Professor prof2 = new Professor("Professora Maria");

        Aluno aluno1 = new Aluno("Aluno Pedro");
        Aluno aluno2 = new Aluno("Aluna Ana");

        // Associando alunos aos professores
        prof1.adicionarAluno(aluno1);
        prof1.adicionarAluno(aluno2);

        prof2.adicionarAluno(aluno1);

        // Associando professores aos alunos
        aluno1.adicionarProfessor(prof1);
        aluno1.adicionarProfessor(prof2);

        aluno2.adicionarProfessor(prof1);

        // Exibindo a associação
        System.out.println("Alunos do " + prof1.getNome() + ":");
        for (Aluno aluno : prof1.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }

        System.out.println("\nProfessores do " + aluno1.getNome() + ":");
        for (Professor professor : aluno1.getProfessores()) {
            System.out.println("- " + professor.getNome());
        }
    }
}