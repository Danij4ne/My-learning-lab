import java.util.Scanner;
public class Main {
    //Public = todo el mundo lo puede ver
    //static = no necesita ningun intermediario para poder ejecutarse , se ejucta directamente

    int edadGlobal = 12; //declaro aqui edadGlobal en la clase Main que envuelve todoo no dentro de ninguna clase ya que si la declaro en una
    //clase por ejemplo la de debajo luego si pongo this.edadGlobal en otra clase diferente de donde la he creado daria error

    public static void main(String[] args){  //solo hay un metodo main , siempre es publico , estatic y no retorna nada = avoid y se llama main siempre
        System.out.println("Este es mi primer programa en Java"); //out = fuera , print = imprimir , ln = salto de linea
        System.out.print("Esta es la segunda linea del programa\n\n"); // quito ln y pongo 2 saltos de linea manual




//TODO comentario especial que resalta

    String myName = "Daniel";
    myName = "Daniel Jane Garcia";

    char letraDNI = 'a';
    System.out.println("La letra de mi DNI es" + letraDNI);

    int edad = 41;
    edad++; //suma 1
    System.out.println(edad);

    double altura = 1.7143212424 ; // Numero que puede guardar muchos decimales
    float peso = 1.344f ; //numero con decimales pero no soporta tantos decimales como el double y acaba siempre con f
    peso = 1.75f;
    System.out.println("Mi peso es" +peso);

    boolean experiencia = true;

    Object cosa = 'A'; //puede guardar cualquier tipo de valores Object

    //clases envolventes (Las creas complejas para poder utilizar funcionalidades . )
        Character letraCompleja = 'A';
        Integer edadCompleja = 12;
        Double alturaCompleja = 11.82;
        Float pesoCompleja = 21.12f;
        Boolean experienciaCompleja = false;

        Object numero = 123; //clase padre que envuelve todas las clases, las funcionalidades que tambien utilizas con Object no son todas son solo las genericas

        //Variables mutables = pueden cambiar su valor en cualquier momento

        //Variables no mutables = aquellas que no pueden cambiar su valor (van en mayuscula y con 2 pabras se pone _ )

        final String DNI ="1030939"; //final = no se puede cambiar

        System.out.println("El valor maximo de un int es"+Integer.MAX_VALUE); //Valor minimo y max que puede soportar un Integer
        System.out.println("El valor maximo de un int es"+Integer.MIN_VALUE);

        //Variables segun el ambito que tienen -> sitios donde una variable es visible


}
    public static void nombreMetodo(){  //metodo / funcion , void = que el metodo no retorna ningun valor,
        int edadMetodo = 12; //esta varaible solo existe aqui fuera del } no existe
        System.out.println(edadMetodo);
    }

    public void nombreMetodo1(){  //metodo / funcion , void = que el metodo no retorna ningun valor,
        int edadMetodo = 122; //puedes definir la misma variable y no da error porque esta en otra clase
        int edadGlobal = 12; //declaro una variable que es la misma pero en otra clase diferente por eso no da error y con this no coges la variable de esta clase coges la de arriba del todo
        System.out.println(edadMetodo);
        System.out.println(this.edadGlobal); //cojo la variable edadGlobal declarada arriba del todo
    }



}

















