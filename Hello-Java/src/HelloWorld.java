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

        String myNew = null;
        myNew = "hello";

        //Operadores en Java

            //Aritmeticos

            var x = 5; //si uno de los dos es decimal (double) si se divide el resultado acabara siendo decimal
            var y = 3;

            System.out.println( x + y);
            System.out.println( x - y);
            System.out.println( x * y);
            System.out.println( x / y);
            System.out.println( x % y); //modulo % lo que sobre de la division


            //De asignacion

            x = y ; //hemos asignado el valor de y a x
            System.out.println(x);

            x = y * 2 ;
            System.out.println(x); //6

            x += 1 ; // +1 a x = 7
            x -= 1 ;
            x *= 1 ;
            x /= 1 ;
            x %= 1 ;

            //Comparacion (Relacionales) devuleven true / false

            System.out.println( x == y); //x es igual a y ?
            System.out.println( x != y); // x es distinto de y ?
            System.out.println( x > y); // x es mayor que y ?
            System.out.println( x >= y); // x es mayor o igual que y ?
            System.out.println( x < y); // x es menor que y ?
            System.out.println( x <= y); // x es menor o igual que y ?

            //Logicos

                //AND (&&)
            System.out.println( 3 > 2 && 5 == 2);


                //OR (||)
            System.out.println( 3 > 2 || 5 == 2);

                //NO (!) negación , resultado contrario
            System.out.println(!( 3 > 2 || 5 == 2));



            //Unarios

         x = 5; // nota: valor inicial de x es 5

        System.out.println(x++); // imprime 5 y luego aumenta x a 6 (post-incremento)
        System.out.println(x);   //  imprime 6 (ya se incrementó en la línea anterior)
        System.out.println(++x); //  primero incrementa (x pasa de 6 a 7) y luego imprime 7 (pre-incremento)
        System.out.println(x);   //  imprime 7 (x sigue valiendo 7)
        System.out.println(x--); // imprime 7 y luego reduce x a 6 (post-decremento)
        System.out.println(x);   //  imprime 6 (ya se restó 1)
        System.out.println(--x); //  primero reduce (x pasa de 6 a 5) y luego imprime 5 (pre-decremento)
        System.out.println(x);   //  imprime 5 (x ahora vale 5)

        //mini ejercicios

        // 1. Crea una variable con el resultado de cada operación aritmética.
        System.out.println( x + y);
        System.out.println( x - y);
        System.out.println( x * y);
        System.out.println( x / y);
        System.out.println( x % y);


        // 2. Crea una variable para cada tipo de operación de asignación.
        x = 10 ;
        x += 1 ;
        x -= 1 ;
        x *= 1 ;
        x /= 1 ;
        x %= 1 ;


        // Variables base
         a = 10;      // nota: valor de ejemplo
         b = 5;       // nota: valor de ejemplo
        double c = 2.5;  // nota: valor decimal
        boolean p = true;
        boolean q = false;
        String s1 = "Java";
        String s2 = "Java";


        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a > b);          // nota: 10 > 5 → true
        System.out.println(a != b);         // nota: 10 es distinto de 5 → true
        System.out.println(s1.equals(s2));  // nota: las dos cadenas son iguales → true


        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a < b);          // nota: 10 < 5 → false
        System.out.println(a == b);         // nota: 10 no es igual a 5 → false
        System.out.println(s1.equals("Python")); // nota: "Java" no es igual a "Python" → false


        // 5. Utiliza el operador lógico and.
        System.out.println(p && (a > b));   // nota: true && true → true
        System.out.println(p && q);         // nota: true && false → false


        // 6. Utiliza el operador lógico or.
        System.out.println(p || q);         // nota: true || false → true
        System.out.println(q || (a < b));   // nota: false || false → false


        // 7. Combina ambos operadores lógicos.
        System.out.println((a > b) && (p || q));
        // nota: (true) && (true || false) → true


        // 8. Añade alguna negación.
        System.out.println(!p);             // nota: negación de true → false
        System.out.println(!(a == b));      // nota: !(false) → true
        System.out.println(!s1.isEmpty());  // nota: s1 no está vacío → true


        // 9. Imprime 3 ejemplos de uso de operadores unarios
        System.out.println(++a); // nota: pre-incremento → suma 1 antes de imprimir (a pasa de 10 a 11)
        System.out.println(b--); // nota: post-decremento → imprime 5 y luego b pasa a 4
        System.out.println(-c);  // nota: cambia el signo del número → -2.5


        // 10. Combina operadores aritméticos, de comparación y lógicos
        System.out.println(((a + b) * 2 > c) && !q);
        // nota: (11 + 4)*2 = 30 > 2.5 = true && !false = true → resultado final: true


        //Concatenacion

        String name1 = "Daniel";
        String surname1 = "Jane";

        System.out.println(name1 + " " + surname1); //concatenar

        //Lenght (longitud)

        System.out.println(name1.length()); // = 6 , tiene 6 letras

        // charAt (Obtener Caracter)

        System.out.println(name1.charAt(1)); // = a la posicion 1 tenemos a de Daniel

        System.out.println(name1.charAt(name1.length() -1 )) ; // hago el charAt de la longitud -1 y asi digo la ultima letra sin necesidad de saber que longitud exacta tiene la variable

        //Substring (subcadena)

        System.out.println(name1.substring(2)); //imprime del caracter 2 hacia adelante = niel
        System.out.println(name1.substring(1,3)); //imprime del caracter 1 y acaba en el 2 (excluye el valor del indice final

        // Mayusculas y minusculas (toLowerCase, toUpperCase)

        System.out.println(name1.toLowerCase()); //todo en minusculas
        System.out.println(name1.toUpperCase()); //TODO EN MAYUSCULAS

        //Contains (si contiene algo)

        System.out.println("Hola Java".contains("Dani")); //False , no contiene Dani la palabra "Hola Java"
        System.out.println("Hola Java".contains("AVA")); //False porque esta en mayuscula
        System.out.println("Hola Java".toUpperCase().contains("AVA")); //True , hemos convertido a maysucula toda la palabra y despues hemos mirado si contiene AVA

        //Comparar (equals) si es igual

        System.out.println(name1.equals("Daniel")); //true
        System.out.println(name1.equals("daniel")); //False por la d minuscula
        System.out.println(name1.equalsIgnoreCase("daniel")); //equalsIgnoreCase Ignora si son mayusuclas o minuscular

        // == vs equals y porque tenemos que usar equals como buena practica

        var D = "Daniel";
        var DA = "Daniel";
        var DAN = new String ("Daniel");

        System.out.println(D == DA); //true , el signo de igualdad es una comparacion del propio objeto entonces para el D y DA son dos cadenas iguales
        System.out.println(D == DAN); //false , pero DAN tenemos un objeto diferente porque lo hemos creado de = new String
        System.out.println(D.equals(DAN)); // true , porque equals compara contenido


        //trim (eliminar espacios al principio y al final del string)
        System.out.println("Me llamo Daniel");
        System.out.println(" Me llamo Daniel ".trim()); //para limpiar cadenas de texto

        //replace (remplazar)
        System.out.println(" Me llamo Daniel ".replace(" ", "")); // eliminar los espacios que hay entre las letras (" ") , y que no hayan espacios ("")
        System.out.println(" Me llamo Daniel ".replace("Daniel", "Dani")); //Remplazas el nombre Daniel por Dani

        //Format f() formatear /sustituir
            // %s = cadenas de texto , %d = numeros enteros, %f = numeros decimales
        String yourName = "Dani";
        int yourAge = 24;
        System.out.println(String.format("Hola , mi nombre es %s , y mi edad es %d", yourName , yourAge));

        //Mini ejercicios (String exercices)

        // 1. Concatena dos cadenas de texto.

            String cadena1 = "Hola";
            String cadena2 = "Amigos";
            System.out.println( cadena1 + " mis queridos " + cadena2);


        // 2. Muestra la longitud de una cadena de texto.

            System.out.println(cadena1.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println("" + cadena1.charAt(0) + cadena1.charAt(cadena1.length() -1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        String onePerson = "Gustavo";
        System.out.println(onePerson.toUpperCase());
        System.out.println(onePerson.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println(onePerson.contains("ta"));

        // 6. Formatea un string con un entero.

        String elString = "Dani";
        int elInt = 24;

        System.out.println(String.format("Buenos dias %s , tu edad es %d ", elString, elInt));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        System.out.println(" Me llamo  Gustavo".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guion (-).

        System.out.println("Bienvenidos al club de sumo".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        String theSame = "el mismo";
        String theSame1 = "el mismo";

        System.out.println(theSame.equals(theSame1));

        // 10. Comprueba si dos strings tienen la misma longitud.

            if(theSame.length() == theSame1.length() ){
                System.out.println("Tienen la misma longitud");
            } else{
                System.out.println("No tienen la misma longitud");
            }





    }
}
