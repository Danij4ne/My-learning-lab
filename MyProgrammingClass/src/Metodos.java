import java.util.Scanner;

public class Metodos {
    public static void main(String[] args){ //como el main es static (siempre sera static main y estara asi escrito) todos los metodos que hagamos tendran que ser static sino nos dara error como por ejemplo saludar
        //si pones main se te crea solo lo de arriba
        System.out.println("Main para probar metodos y variables");
        saludar("Dani"); // si el saludar es estatico definido en la clase con poner saludar (+el nombre es suficiente)
        despedir();
    }

    public static void saludar(String name ){ //Saludar , en ( mencionas que tiene que ser un String y name es algo general puedes poner cualquier cosa)
        System.out.println("Enhorabuena " + name + "has llamado a tu primer metodo");
    }

    public static void despedir(){ //Saludar , en ( mencionas que tiene que ser un String y name es algo general puedes poner cualquier cosa)
        System.out.println("Hasta luego , hemos terminado ");
    }


    public static void evaluarCandidato() {                // método que no devuelve nada y puede llamarse sin crear un objeto
        Scanner lectorTeclado = new Scanner(System.in);    // creo un lector para leer del teclado

        System.out.println("Dime tu nombre y apellido");   // pido el nombre al usuario
        String nombreApellido = lectorTeclado.nextLine();  // leo una línea completa (incluye espacios)

        System.out.println("Dime tu edad");                // pido la edad
        int edad = lectorTeclado.nextInt();                // leo un número entero

        System.out.println("Que salario quieres cobrar");  // pido el salario deseado
        double salario = lectorTeclado.nextDouble();       // leo un número con decimales

        System.out.println("Tienes experiencia");          // pregunto si tiene experiencia
        boolean experiencia = lectorTeclado.nextBoolean(); // leo true/false (verdadero/falso)

        // calculo si pasa la evaluación: mayor de 30, salario > 20000 y tiene experiencia
        boolean resultadoEvaluacion = (edad > 30) && (salario > 20000) && (experiencia == true);

        lectorTeclado.close();                             // cierro el lector (libero el recurso)
    }
    


}
