import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação de um herói
        Heroi miranha = new Heroi("Homem Aranha", 24, "Escala parede", 10, 100);
        System.out.println("Nome: " + miranha.nome);
        System.out.println("Idade: " + miranha.idade);
        System.out.println("Qual poder? " + miranha.poder);
        System.out.println("Força: " + miranha.forca);
        System.out.println("ID: " + miranha.id);


        // Criação de um vilão

        Vilao thanos = new Vilao("Thanos", 1500, "Destruir planeta", 15, 9999999, 9999, true);
        System.out.println("Nome: " + thanos.nome);
        System.out.println("Idade: " + thanos.idade);
        System.out.println("Poder: " + thanos.poder);
        System.out.println("ID: " + thanos.id);
        System.out.println("Força: " + thanos.forca);
        System.out.println("Nível maldade: " + thanos.nivelMaldade);
        System.out.println("Armadura: " + thanos.armadura);
    }
}