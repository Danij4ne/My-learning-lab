import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        //ex1
        Scanner doubt = new Scanner(System.in);
        System.out.println("Introduce el primer número : ");
        int numeroEntero1 = doubt.nextInt();
        System.out.println("Introduce el segundo número : ");
        int numeroEntero2 = doubt.nextInt();
        //sum
        int totalSum = numeroEntero1 + numeroEntero2;
        System.out.println("El resultado es: " + totalSum);

        //rest
        int totalRest = numeroEntero1 - numeroEntero2;
        System.out.println("El resultado es: " + totalRest);

        //x
        double totalMult = numeroEntero1 * numeroEntero2;
        System.out.println("El resultado es: " + totalMult);

        // /
        double totalDiv = numeroEntero1 / numeroEntero2;
        System.out.println("El resultado es: " + totalDiv);

        // %
        double div = numeroEntero1 / numeroEntero2;
        System.out.println("El resultado es: " + div);


        //ex2
        System.out.println("Introduce el primer numero : ");
        int numero1 = doubt.nextInt();
        System.out.println("Introduce el segundo numero : ");
        int numero2 = doubt.nextInt();
        boolean numero3 = numero1 == numero2 ;
        System.out.printf("¿Es %d  igual a %d ? : %b \n" , numero1 , numero2, numero3);
        boolean numero4 = numero1 > numero2 ;
        System.out.printf("¿Es %d  mayor a %d ? : %b \n" , numero1 , numero2, numero4);
        boolean numero5 = numero1 < numero2 ;
        System.out.printf("¿Es %d  menor a %d ? : %b \n" , numero1 , numero2, numero5);
        boolean numero6 = numero1 != numero2 ;
        System.out.printf("¿Es %d  diferente a %d ? : %b \n" , numero1 , numero2, numero6);
        boolean numero7 = numero1 >= numero2 ;
        System.out.printf("¿Es %d  mayor o igual a %d ? : %b \n" , numero1 , numero2, numero7);
        boolean numero8 = numero1 <= numero2 ;
        System.out.printf("¿Es %d  menor o igual a %d ? : %b \n" , numero1 , numero2, numero8);

        //ex3
        int inicial1 = 100;
        System.out.println("El valor inicial es :" + inicial1);
        inicial1+=50;
        System.out.println("Despues de sumar 50:" + inicial1);
        inicial1-=30;
        System.out.println("Despues de restar 30 :" + inicial1);
        inicial1*=2;
        System.out.println("Despues de multilicar 2 :" + inicial1);
        inicial1/=4;
        System.out.println("Despues de dividir entre 4 :" + inicial1);

        //ex4

        System.out.println("Introduce un numero :" );
        int modulo1 = doubt.nextInt();
        if (modulo1 % 2 == 0){
            System.out.printf("El numero %d es par : " , modulo1);
        } else if (modulo1 % 2 != 0){
            System.out.printf("El numero %d es impar : " , modulo1);
        }

        //ex5

        





    }

}
