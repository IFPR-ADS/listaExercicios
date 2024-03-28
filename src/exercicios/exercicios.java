
package exercicios;

import java.util.Scanner;

public class exercicios {
 
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        cadernoExercicios lista = new cadernoExercicios();
        
        System.out.println("Selecione um Exercicios de 1 a 13 para ver seu enunciado e sua solução");
        int option = read.nextInt();
        switch (option) {
            case 1:
                lista.ex1();
                break;
            case 2:
                lista.ex2();
                break;
            case 3:
                lista.ex3();
                break;
            case 4:
                lista.ex4();
                break;
            case 5:
                lista.ex5();
                break;
            case 6:
                lista.ex6();
                break;
            case 7:
                lista.ex7();
                break;
            case 8:
                lista.ex8();
                break;
            case 9:
                lista.ex9();
                break;
            case 10:
                lista.ex10();
                break;
            case 11:
                lista.ex11();
                break;
            case 12:
                lista.ex12();
                break;
            case 13:
                lista.ex13();
                break;
            default:
                System.out.println("Selecione um Exercicio valido");
        }
    
  
        
    }
    
}
