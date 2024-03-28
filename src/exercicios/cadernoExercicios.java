
package exercicios;

public class cadernoExercicios {
    //1. Crie uma variável para um número inteiro com o valor 10 e imprima;
    public static void ex1(){
      
        int num = 10;
        System.out.println("Crie uma variável para um número inteiro com o valor 10 e imprima;");
        System.out.println(num);
    }
    
    //2. Crie uma variável para um número de ponto flutuante e imprima;   
    public static void ex2(){
        
        double num = 10.0;
        System.out.println("Crie uma variável para um número de ponto flutuante e imprima;   ");
        System.out.println(num);
    }
    
//3. Crie uma variável contendo o texto Linguagem de programação e imprima;    
    public static void ex3(){
        
        String text = "Linguagem de programação";
        System.out.println("3. Crie uma variável contendo o texto Linguagem de programação e imprima;");
        System.out.println(text);
    }
    
 //4. Crie 4 variáveis com números inteiros e realize o cálculo da média;   
    public static void ex4(){
        int num1 = 5, num2 = 2, num3= 10, num4 = 10;
        int result = (num1+num2+num3+num4)/4;
        
        System.out.println("4. Crie 4 variáveis com números inteiros e realize o cálculo da média;");
        System.out.println("A media é " + result);
    }
    
//5. Crie 4 variáveis com números de ponto flutuante e realize o cálculo da média;
    public static void ex5(){
        double num1 = 5.0, num2=3.0, num3=10.0, num4=10.0;
        double result = (num1+num2+num3+num4)/4;
        
        System.out.println("5. Crie 4 variáveis com números de ponto flutuante e realize o cálculo da média;");
        System.out.println("A media é "+ result);
    }
//6. Crie uma variável para o texto “Banco de dados” e imprima o texto “Disciplina” mais o
//valor da variável criada;
    public static void ex6(){
        String texto = "Banco de dados";
        
        System.out.println("//6. Crie uma variável para o texto “Banco de dados” e imprima o texto “Disciplina” mais o\n" +
"//valor da variável criada;");
        System.out.println("Diciplina "+texto);
        
    }
    
//7. Crie um algoritmo que dado um valor inteiro a uma variável imprima se o valor é maior que
//10 ou menor que 10;
    public static void ex7(){
        int num = 10;
        String result;
        
        
        System.out.println("//7. Crie um algoritmo que dado um valor inteiro a uma variável imprima se o valor é maior que\n" +
"//10 ou menor que 10;");
        
        if(num > 10){
           result = "Num é maior que 10";
        }else if(num == 10){
           result = "Num é igual a 10";
        }else{
           result = "Num é menor que 10";
        }
        System.out.println(result);
    }
    
//8. Crie um algoritmo que dado um valor inteiro a uma variável imprima se é par ou ímpar;
    public static void ex8(){
        int num = 2;
        String result;
        if(num%2 == 0){
            result = "é par";
        }else{
            result = "é impar";
        }
        
        System.out.println("8. Crie um algoritmo que dado um valor inteiro a uma variável imprima se é par ou ímpar;");
        System.out.println(result);
    }
    
//9. Crie um algoritmo que conte até 10;
    public static void ex9(){
        
        System.out.println("9. Crie um algoritmo que conte até 10;");
        for(int i=0;i <= 10;i++){
            System.out.println("Valor de I "+i);
        }
    }
    
//10. Crie um algoritmo que conte até 1000 de 100 em 100 números;
    public static void ex10(){
        
        System.out.println("10. Crie um algoritmo que conte até 1000 de 100 em 100 números;");
        for(int i=1000 ; i >= 100 ; i = i -100){
            System.out.println("Valor de I "+i);
        }
    }
    
//11. Crie uma lista que comporte 4 itens de texto e imprima a lista;
    public static void ex11(){
        String[] texto = new String[] {"Java","é","Muito","top"};
        for(int i=0; i < 4 ; i++){
            System.out.println(texto[i]);
        }
    }
    
//12. Crie uma lista que comporte 3 números inteiros e imprima a lista;
    public static void ex12(){
        Integer[] num = new Integer[]{1,2,3};
        
        System.out.println("12. Crie uma lista que comporte 3 números inteiros e imprima a lista;");
        for(int i=0; i < 3 ; i++){
            System.out.println(num[i]);
        }
    }
    
//13. Crie uma lista que comporte 3 números de ponto de flutuante e imprima a lista;
    public static void ex13(){
        Double[] num = new Double[]{1.0,2.3,3.2};
        
        System.out.println("13. Crie uma lista que comporte 3 números de ponto de flutuante e imprima a lista;");
        for(int i=0; i < 3 ; i++){
            System.out.println(num[i]);
        }
    }
}
