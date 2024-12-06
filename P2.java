package main.java;

import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.InsertContentAction;

public class App {


    public static void fila(Scanner scanner) {
        //IMPLEMENTE AQUI A LÓGICA PARA A FILA
    }

    public static void lista(Scanner scanner) {
        List<int> numeros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                numeros.add(numero);
            }
        }
        scanner.close();
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(" ");
            }
        }
    }
    }

        public static void main(String[] args) throws Exception{
        Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (fila.size() < 100) {
            System.out.println("Digite o nome de uma pesso ");
            String nome = scanner.nextLine();
            }
            fila.add(nome);
        }
        
        scanner.close();
        
        System.out.println("Fila de Espera:");
        for (String nome : fila) {
            System.out.println(nome);
        }
            Scanner scanner = new Scanner(System.in);
            fila(scanner);
            lista(scanner);
            scanner.close();
