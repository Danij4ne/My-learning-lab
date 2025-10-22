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






    }

}
