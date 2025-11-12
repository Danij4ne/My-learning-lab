package EnumName;
import java.util.Scanner;

public class enumex {

    // enum → valores fijos que no pueden ser alterados ni modificados
    enum DiasSemana { 
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    public  void DiasSemanas() {
        DiasSemana dia = DiasSemana.Lunes; 
        //Crea una variable llamada dia del tipo DiasSemana, y guárdale el valor Lunes (uno de los valores posibles de ese tipo).”

        switch (dia) {
            case Lunes:
                System.out.println("Inicio de semana");
                break;
            case Martes:
                System.out.println("Segundo día");
                break;
            case Miercoles:
                System.out.println("Mitad de semana");
                break;
            case Jueves:
                System.out.println("Casi viernes");
                break;
            case Viernes:
                System.out.println("Por fin viernes");
                break;
            case Sabado:
                System.out.println("Fin de semana");
                break;
            case Domingo:
                System.out.println("Domingo de descanso");
                break;
        }
    }

    //ej2 
    public void ConversorMonedas(){
    Scanner showme = new Scanner (System.in);
    enum Moneda {
        DOLAR , LIBRA , YEN , PESO
    }
    
    System.out.println("Añade la cantidad de euros : ");
    double euros = showme.nextDouble();

    System.out.println("Elige una moneda para convertir:");
        System.out.println("1. DOLAR");
        System.out.println("2. LIBRA");
        System.out.println("3. YEN");
        System.out.println("4. PESO");
        int opcion = showme.nextInt();

        double convertido = 0;
        Moneda monedaSeleccionada = null;

        switch (opcion) {
            case 1 -> monedaSeleccionada = Moneda.DOLAR;
            case 2 -> monedaSeleccionada = Moneda.LIBRA;
            case 3 -> monedaSeleccionada = Moneda.YEN;
            case 4 -> monedaSeleccionada = Moneda.PESO;
            default -> System.out.println("Opción no válida");
        }

        if (monedaSeleccionada != null) {
            switch (monedaSeleccionada) {
                case DOLAR -> convertido = euros * 1.07;
                case LIBRA -> convertido = euros * 0.86;
                case YEN   -> convertido = euros * 162.50;
                case PESO  -> convertido = euros * 19.80;
            }

            System.out.printf("%.2f euros son %.2f en %s.%n", euros, convertido, monedaSeleccionada);
        }






 }

}
