//import nombrePaquete.Nombreclase
import controler.GestorUsuarios; //importas las funciones dentro de la carpeta controler la hoja GestorUsuarios
//import controller.*  --> importas todos los archivos que hay dentro de la carpeta controler para utilizar todas las operaciones de todos los documentos

public class Main {
    //Public = todo el mundo lo puede ver
    //static = no necesita ningun intermediario para poder ejecutarse , se ejucta directamente

    public static void main(String[] args){  //solo hay un metodo main , siempre es publico , estatic y no retorna nada = avoid y se llama main siempre
        System.out.println("Este es mi primer programa en Java"); //out = fuera , print = imprimir , ln = salto de linea
        saludar(" Dani");
        Operaciones operacionesMatematicas = new Operaciones(); // importamos las funciones de el archivo operaciones
        //Operaciones = como se llama la carpeta , operacionesMatematicas = nombre variable , new Operaciones() = le das el poder de all lo que hay dentro de la carpeta
        operacionesMatematicas.sumar(3,2); //utilizamos sus funciones sumar
        operacionesMatematicas.restar(3,2); //Restar


        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.validarUsuario("Hola" ,  21); //


        //AutoBoxing
       Integer numero = 20; //pasas de un tipo menor a uno mayor de inter a Intenger
        //ahora numero es envolvente y puedes acceder a todas las funciona


        //Unboxing (lo contrario a Autoboxing)
        Integer numero1 = 20;  //tienes un tipo mayor
        int numeroBase = numero1; //y lo pasas a uno menor






    }
    public static void saludar (String name ){ //crear funcion
        System.out.println("Hola" +name);
        System.out.println("Buenos dias");
        System.out.println("Que tal estas");
    }


//static = que es accesible directamente no necesitas ningun intermediario


















    }

//TODO comentario especial que resalta
