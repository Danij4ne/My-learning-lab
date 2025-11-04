
package ExT4SwitchFor;

import java.util.Scanner;

public class exswitch {
    

    public void estructuraSwitchTradicional(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota : ");
        int nota = scanner.nextInt();
        switch (nota) {
            case 1:
                System.out.println("La nota vale 1, has suspendido");
                break;

            case 5: 
                System.out.println("Has aprobado raspado");
                break;

            case 8:
                System.out.println("Has aprobado con buena nota");
                break;
            
            default:
                System.out.println("La nota no es analizable");

        }        
        System.out.println("notas analizadas");
        scanner = null;
    }



    public void estructuraLambda() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicame tu nombre : ");
        String nombre = scanner.next();
            String apellido = "";        
        switch (nombre.toLowerCase()){ //se transformara el nombre que pongan en el nput a minuscula para que no haya errores 
            case "borja" -> {
                System.out.println("El nombre introducido es Borja");
                apellido = "Fernandez";
            }
            case "maria" -> {
                System.out.println("El nombre introducido es Maria");
                apellido = "Perez";

            }
            default -> {
                System.out.println("Nombre introducido no contemplado");
            }

        }
        scanner.close();

    }

    //Ex1
    public void DiaSemana(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Indicame un numero : ");
         int numbero = scanner.nextInt();
         switch (numbero) {
            case 1:
                System.out.println("El dia 1 es : Lunes  ");
                break;
            case 2:
                System.out.println("El dia 2 es : Martes  ");
                break;
            case 3:
                System.out.println("El dia 3 es : Miercoles ");
                break;
            case 4:
                System.out.println("El dia 4 es : Jueves ");
                break;
            case 5:
                System.out.println("El dia 5 es : Viernes ");
                break;
            case 6:
                System.out.println("El dia 6 es : Sabado ");
                break;
            case 7:
                System.out.println("El dia 7 es : Domingo ");
                break;
            default:
                System.out.println("ERROR numero no valido ");

         }
        
    }


    //ex2

    public void CalificacionSwitch(){

        Scanner showme = new Scanner(System.in);
        System.out.println("Di la letra A ");
        System.out.println("Di la letra B ");
        System.out.println("Di la letra C ");
        System.out.println("Di la letra D ");
        System.out.println("Di la letra F ");
        System.out.println("Dime una letra de calificación de la A hasta la F :");
        String myLetra = showme.nextLine() ;
        

        switch (myLetra.toUpperCase()) {
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Muy bien");
                break;
            case "C":
                System.out.println("Bien");
                break;
            case "D":
                System.out.println("Suficiente");
                break;
            case "F":
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Error , vuelve a intentarlo");

            showme.close();
        }

    }


    //ex3

    public void CalculadoraSwitch(){
        Scanner showme = new Scanner(System.in);
        System.out.println("Introduce el primer numero :");
        int myOne = showme.nextInt() ;
        System.out.println("Introduce el segundo numero:");
        int myTwo = showme.nextInt() ;
        System.out.println("Introduce la operación : ");
        String myVar = showme.next();

        switch (myVar) {
            case "+":
                int result = myOne + myTwo;
                System.out.println("Resultado : " + result);
                break;
            case "-":
                int resulter = myOne + myTwo;
                System.out.println("Resultado : " + resulter);
                break;
            case "/":
                int resulto = myOne + myTwo;
                System.out.println("Resultado : " + resulto);
                break;
            case "*":
                int resulters = myOne + myTwo;
                System.out.println("Resultado : " + resulters);
                break;
            default:
                System.out.println("Error , vuelve a intentarlo");


        }

        
        //ex4
        













       }



















}

























