package exercicios.cap03;

/*
Neste exercício, você deve completar 4 tarefas: 
1. Imprima todos os números inteiros de 10 a 25 utilizando uma estrutura de repetição. 
2. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 
3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já 
impressos for menor que 100. 
4. Imprima a tabuada do 9 (até o décimo valor). 
*/

class Ex02_0{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 1;
        int num3 = 1;
        int soma = 0;

        System.out.println("Exercicio parte 1");
        while (num1 <= 25){
            
            System.out.println(num1);
            num1++;
        }
        
        System.out.println("Exercicio parte 2");
        while (num2 <=100){
            if (num2 % 2 !=0){
            soma = soma + num2;
            System.out.println(soma + "-" + num3);
            num3++; // indice do numero
            }
            num2++;
            
        }
        
        int num4 = 0;
        int soma2 = 0;
        while (soma2 < 100){
            System.out.println("Numero " + num4 + "->" + "Soma - " + soma2);
            soma2 = soma2 + num4;
            num4++;
        }
        
    }
}