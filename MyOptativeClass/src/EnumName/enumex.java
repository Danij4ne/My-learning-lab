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

    //ex2 
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
            showme.close();
        }


        }

 
    // ex3
        public void Temperature() {
            Scanner showme = new Scanner(System.in);
            System.out.println("¿Qué temperatura hace?");
            int temperatura = showme.nextInt();

            switch (true) {

                case true:
                    if (temperatura < 0) {
                        System.out.println("Helado");

                    } else if (temperatura >= 0 && temperatura <= 15) {
                        System.out.println("Frío");

                    } else if (temperatura >= 16 && temperatura <= 25) {
                        System.out.println("Templado");

                    } else if (temperatura >= 26 && temperatura <= 35) {
                        System.out.println("Calor");

                    } else {
                        System.out.println("Muy Caliente");
                    }
                    break;

                default:
                    break;
            } 
            showme.close();
        }


        public enum CategoriaPlato{
                ENTRADA,
                PRINCIPAL,
                POSTRE,
                BEBIDA
            }


    //ex4 
       
        public void RestaurantMenu() {

            Scanner showme = new Scanner(System.in);
            System.out.println("1. Entrada");
            System.out.println("2. Principal");
            System.out.println("3. Postre");
            System.out.println("4. Bebida");
            System.out.println("Elige una categoría:");
            int opcion = showme.nextInt();

            CategoriaPlato categoria = null;

    
            switch (opcion) {
                case 1 -> categoria = CategoriaPlato.ENTRADA;
                case 2 -> categoria = CategoriaPlato.PRINCIPAL;
                case 3 -> categoria = CategoriaPlato.POSTRE;
                case 4 -> categoria = CategoriaPlato.BEBIDA;
                default -> {
                    System.out.println("Opción no válida");
                    return;
                }
            } 

    
            switch (categoria) {

                case ENTRADA -> {
                    System.out.println("Opciones de ENTRADA:");
                    System.out.println("1. Ensalada César");
                    System.out.println("2. Sopa de Calabaza");
                    System.out.println("3. Nachos con queso");
                }

                case PRINCIPAL -> {
                    System.out.println("Opciones PRINCIPALES:");
                    System.out.println("1. Pollo Asado");
                    System.out.println("2. Pasta Carbonara");
                    System.out.println("3. Hamburguesa Completa");
                }

                case POSTRE -> {
                    System.out.println("POSTRES:");
                    System.out.println("1. Tarta de Chocolate");
                    System.out.println("2. Helado");
                    System.out.println("3. Flan");
                }

                case BEBIDA -> {
                    System.out.println("BEBIDAS:");
                    System.out.println("1. Agua");
                    System.out.println("2. Refresco");
                    System.out.println("3. Café");
                }
            }
            showme.close();
        }

        //ex 5 

        public void BasicOperations() {
            Scanner showme = new Scanner(System.in);

    
            System.out.println("Añade tu primera variable :");
            double num1 = showme.nextDouble();
            System.out.println("Añade tu segunda variable :");
            double num2 = showme.nextDouble();

   
            System.out.println("Declara el operador ('+', '-', '*', '/'): ");
            char operador = showme.next().charAt(0);

            double result;

            switch (operador) {

                case '+':
                    result = num1 + num2;
                    System.out.printf("%.2f %c %.2f = %.2f%n", num1, operador, num2, result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.printf("%.2f %c %.2f = %.2f%n", num1, operador, num2, result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.printf("%.2f %c %.2f = %.2f%n", num1, operador, num2, result);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("❌ ERROR: No se puede dividir entre 0.");
                        return;  // Detiene el método
                    }
                    result = num1 / num2;
                    System.out.printf("%.2f %c %.2f = %.2f%n", num1, operador, num2, result);
                    break;

                default:
                    System.out.println("ERROR: Operador no válido.");
            }
        }






 }







