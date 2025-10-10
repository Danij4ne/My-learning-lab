public class HelloWorld { //Obligatorio public = publico , class = tipo clase ,
    public static void main(String[] args){ //Obligatorio , sino no se ejecuta el programa, void = no retorna nada , main = nombre de la operación que tiene que tener el punto de entrada
    //String[] args = argumentos , se le va a pasar un array de strings y que tiene el nombre args
        System.out.println("Hola , Java !"); // out = salida , system = sistema , println = print con salto de linea

       //Variables

        String name = "Dani";
        System.out.println(name);

        name = "Daniel"; //Actualizamos el valor pero no podriamos añadir otro tipo que no sea String

        int age = 37;
        System.out.println(age);

        //Constantes (final)

        final String EMAIL ="dani@gmail.com"; //Una buena practica es poner el nombre de las constantes toda en mayuscula
        System.out.println(EMAIL);

        //Var

        var friend = "Pablo"; //var = toma en cuenta lo que le añadas a la variable y en función de eso dictamina que tipo de variable es (string, int...)

    //tipos de datos primitivos

        int myInt = 37; //enteros
        System.out.println(myInt);

        double myDouble = 1.77; // decimales
        System.out.println(myDouble);
        //otros tipos de datos primitivos para trabajar con numeros = float, long, byte

        char myChar ='a'; //caracteres unicos (solo pueden ir con 'coma simple' )

        boolean myBolean = true;

        //Como saber el tipo de dato de una clase
        String myString = " Hola, Java"; //String S mayuscula porque es clase , datos primitivos van con min

        System.out.println(myString.getClass().getSimpleName()); //imprimes myString le pones .getClass = obtener datos de la clase
        //y dentro de getClass pones getSimpleName = obtener el nombre dentro de los datos de la clase

        //Mini Exercices

        // 1. Declara una variable de tipo String y asígnale tu nombre.

        String myName = "Daniel";

        // 2. Crea una variable de tipo int y asígnale tu edad.

        int myNewAge = 24 ;

        // 3. Crea una variable double con tu altura en metros.

        double myHeight = 1.85 ;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean iLikeCode = true ;

        // 5. Declara una constante con tu email.

        final String MYEMAIL = "danij4ne@gmail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char myNameChar = 'D';

        //7. Declara una variable tipo string con tu localidad, y a continuación cambia su valor y vuelve a imprimirla

        String myPlace = "Barcelona";
        myPlace = "Madrid";
        System.out.println(myPlace);

        //8. Crea una variable int llamada a, otra b y imprime la suma de ambas
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        //10. Imprime el tipo de dos variables creadas anteriormente

       /* | Tipo primitivo | Clase envolvente (objeto) | Ejemplo de conversión (autoboxing)    |
        | -------------- | ------------------------- | ------------------------------------- |
        | `int`          | `Integer`                 | `int a = 5; Integer objA = a;`        |
        | `boolean`      | `Boolean`                 | `boolean b = true; Boolean objB = b;` |
        | `char`         | `Character`               | `char c = 'A'; Character objC = c;`   |
        | `double`       | `Double`                  | `double d = 3.14; Double objD = d;`   | */

        Integer objA = a;
        Character objMyNameChar = myChar;
        Boolean objILikeCode = iLikeCode ;









        //9. Intenta crear una variable sin inicializar y luego asígnale un valor antes de imprimirla














    }
}
