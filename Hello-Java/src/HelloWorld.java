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











    }
}
