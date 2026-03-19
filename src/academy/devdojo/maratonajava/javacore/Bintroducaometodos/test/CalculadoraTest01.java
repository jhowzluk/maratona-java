package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args){
        Calculadora cal = new Calculadora();

        cal.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        cal.subtraiDoisNumeros();
    }
}
