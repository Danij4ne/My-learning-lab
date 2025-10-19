import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Ex 1
        Scanner lector = new Scanner(System.in);
        System.out.print("¿Cuantos bocadillos a comprado?");
        int numBocadillos = lector.nextInt();
        System.out.println("¿Que precio tenia cada bocadillo?");
        double precioBocadillo = lector.nextDouble();
        System.out.println("¿Cuantas bebidas a comprado?");
        int numBebidas = lector.nextInt();
        System.out.println("¿Que precio tenia cada bebida?");
        double precioBebida = lector.nextDouble();
        System.out.println("¿Cuantos alumnos realizaron la compra?");
        int numAlumnos = lector.nextInt();

        //subtotales
        double totalBocadillo = numBocadillos * precioBocadillo;
        double totalBebida = numBebidas * precioBebida;
        //Total
        double totalCompra = totalBocadillo + totalBebida ;
        //Cantidad x Alumno
        double cantidadAlumno = totalCompra / numAlumnos;

        System.out.printf("Subtotal Bebidas : %.2f $ \n" ,  totalBebida );
        System.out.printf("Subtotal Bocadillos : %.2f $ \n" ,  totalBocadillo );
        System.out.printf("Total Compra : %.2f $ \n" ,  totalCompra );
        System.out.printf("Cantidad por Alumno: %.2f $ \n" , cantidadAlumno  );



        //Ex2


        System.out.println("Introduzca el valor de compra del producto");
        double valorCompra = lector.nextDouble();
        System.out.println("Introduzca el valor del IVA del producto");
        int valorIva = lector.nextInt();

        double valorSinIva = 0;
        double totalIva = 0;

        if(valorCompra >500 || valorCompra < 0 ){
            System.out.println("ERROR valor de compra no valido");
        } else if(valorIva > 25 || valorIva < 0){
            System.out.println("ERROR valor de IVA no valido");
        }  else {
            totalIva = (valorCompra * valorIva) / 100;
            valorSinIva = valorCompra - totalIva;
        }

        System.out.printf("Compra sin IVA : %.2f $\n", valorSinIva);
        System.out.printf("Valor IVA : %.2f $\n", totalIva);


        //ex3

        System.out.println("Decenas de mil: ");
        int decenasMil = lector.nextInt();
        System.out.println("Unidades de mil: ");
        int unidadesMil = lector.nextInt();
        System.out.println("Centenas: ");
        int centenas = lector.nextInt();
        System.out.println("Decenas: ");
        int decenas = lector.nextInt();
        System.out.println("Unidades de mil: ");
        int unidades = lector.nextInt();

        int numeroIntroducido = (decenasMil * 10000)
                + (unidadesMil * 1000)
                + (centenas * 100)
                + (decenas * 10)
                + unidades;

        System.out.printf("Numero Introducido: %d " , numeroIntroducido);

        //ex4

        System.out.print("Número de segundos: ");
        int segundosTotales = lector.nextInt();

        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = (segundosTotales % 3600) % 60;

        System.out.printf("Horas: %d%n", horas);
        System.out.printf("Minutos: %d%n", minutos);
        System.out.printf("Segundos: %d%n", segundos);

        lector.close();

        



    }



}
