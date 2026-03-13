package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.marca = "Nissan";
        carro.modelo = "Silvia S15";
        carro.ano = 1995;

        carro2.marca = "Honda";
        carro2.modelo = "Civic EX Coupe";
        carro2.ano = 1998;

        carro2 = carro;

        System.out.println("\nMarca: " + carro.marca
                + "\nModelo: " + carro.modelo
                + "\nAno: " + carro.ano);
        System.out.println("\n---------------");
        System.out.println("\nMarca: " + carro2.marca
                + "\nModelo: " + carro2.modelo
                + "\nAno: " + carro2.ano);
    }
}
