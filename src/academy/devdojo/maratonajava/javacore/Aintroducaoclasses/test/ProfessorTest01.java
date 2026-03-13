package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Perez";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println("Nome professor: " + professor.nome +
                "\nIdade professor: " + professor.idade +
                "\nSexo professor: " + professor.sexo);
    }
}
