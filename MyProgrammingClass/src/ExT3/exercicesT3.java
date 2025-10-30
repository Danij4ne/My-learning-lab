import java.util.Scanner;


public class exercicesT3 {
    //ex1
    public void MayorEdad(){
        Scanner showme = new Scanner(System.in);
        System.out.println("Introduce tu edad : ");
        int myAge = showme.nextInt();
        if (myAge >=18) {
            System.out.println("Eres mayor de edad , puedes votar");

        }
        showme = null;

    }
    //ex2
    public void NumberValue(){
        Scanner showme = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int myNumber = showme.nextInt();
        if (myNumber >= 1){
            System.out.println("El número es positivo");
            
        } else if ( myNumber == 0) {
            System.out.println("El número es cero");

        }else {
            System.out.println("El número es negativo");
        }
        showme = null;
    }
    //ex3
    public void AprobadoSuspenso(){
        Scanner showme = new Scanner(System.in);
        System.out.println("Introduce tu nota : ");
        int myNota = showme.nextInt();
        if ( myNota >=5 ){
            System.out.println("Has aprobado");
        } else {
            System.out.println("Has suspendido");
        }
        showme = null;
    }

    //ex11
    public void SistemaDescuentos (){
        Scanner showme = new Scanner(System.in);
        System.out.println(" Introduce el importe de compra : ");
        double importeCompra = showme.nextDouble();
        System.out.println(" ¿Eres Socio? ");
        boolean eresSocio = showme.nextBoolean();
        if (importeCompra >= 200 && eresSocio == true){
           double finallyPrice = importeCompra * 0.80 ; 
            double descuentoAplicado = importeCompra - finallyPrice;
            System.out.printf("Descuento aplicado (20%) : %.2f%n ", descuentoAplicado);
            System.out.printf("Importe final : %.2f%n ", finallyPrice);
        }





    }









}










