
package ArraysOrCollecciones;

import java.util.Scanner;

import ForEach.forEach;

public class myArrays {
   
int numero = 2;
// defino el array segun el numero de elementos 
int [] numeros = new int[6]; //creamos un array de 6 elementos desde el 0 hasta el 5
//en un principio como no hemos definido nada guardara 6 ceros 

boolean [] aciertos = new boolean[4]; 
//guarda un array de 4 booleans todos como no estaran definidos sera False 

String[] palabras = new String[3];
//tamaño de 3 elementos para este array y en cada hueco esta definido como null

Object[] cosas = new Object[5];  //tipo mas generico de java donde guardas huecos genericos de todo numeros , strings , booleans etc ...
//como es complejo O mayuscula todos los huecos al principio seran definidos como null 


// decir elementos que quieres guardar

int[] numerosSecretos = new int[]{5,3,1,10,8}; //creas un array con 5 posiciones y en cada posicion un numero

boolean[] aciertosConcretos = new boolean[]{false,true,false,true};

Object[] cosasConcretas = new Object[] {"hola",3,5,true,"comida"};

Integer[] numerosConcretos2 = new Integer[]{1,2,4,6,45,2,8}; //numero primitivo lo guardas a tipo complejo 

//acciones que puedes realizar con los arrays 
//saber la longitud 
int [] numeros2 = new int[6];
int longi = numeros2.length; // tiene 6 elementos 


    public static void main(String[] args) {

    int numbers[] = new int[] {3,6,4,3,9};

    //acceder a numeros de los elementos
    
    System.out.println("El elemento de la primera posicion es :" + numbers[0]); //numero en la posicion 0 (primera posicion)

    //Modificar elementos
    numbers[0] = 88 ; // cambias el numero de la posicion 0
    numbers[numbers.length-1] = 30; //modificas el ultimo valor y le pones 30
    numbers[numbers.length/1] = 22; //modificas el valor del medio y le pones 22

    //mostrar todos los elementos de un array (con for , for each , )
    //con FOR
    for (int i = 0; i < numbers.length; i++) {
    System.out.printf("elemento %d%n", numbers[i]);
    }

    //con FOR EACH = no hace falta que le digas donde empieza y donde termina , imprime cada elemento automaticamente

    for( int i :numbers){
        System.out.println("El elemento es" +i);
    }


    }


    public void arrayss(){
    Scanner showme = new Scanner(System.in);
    // acciones que puedo realizar con los arrays
    System.out.println("Cuantos numeros vas a querer guardar"); //vamos a preguntarle al usuario que tamaño de array quiere crear 
    int tamanio = showme.nextInt();
    int[] numeros = new int[tamanio];
    
    //Guardar numeros aleatorios en todas las posiciones del array 
    for (int i = 0; i< numeros.length; i++){
        numeros[i] = (int) Math.random() * 50 ; // creas numeros aleatorios entre el (* 50 )=  0 y el 49 (* 50 + 1) = 1 al 50
    
  
    }
    
    //Vamos a hacer una busqueda dentro de un array
    System.out.println("Que numeros quieres buscar");
    int numeroBuscar = showme.nextInt();
    //Podemos hacerlo con un for normal pero en este caso lo haremos con un FOR EACH
    for(int i: numeros) {
        if (i == numeroBuscar){ //si el numero es el que esta buscando el usuario 
            System.out.println(i); //n lo imprime
        }

    }

    //Ahora vamos a ver con un FOR EACH que numeros a generado
    for (int i : numeros){
        System.out.println(i);
    }

    }


 public void WithObjectType() {

    // creamos un tipo Object que puede almacenar cualquier tipo de dato
    Object[] cosasConcretas = new Object[]{1, "adios", false, 6, 0.0, "hola", 'a'};

    // hacemos un for each para recorrer todos los elementos del array
    for (Object item : cosasConcretas) {

        // si es una instancia de Integer (tipo int número)
        if (item instanceof Integer) {

            // entonces se activa esto porque ha encontrado un número
            if ((int) item > 0) {
                // y si es más grande que cero se imprime esto
                System.out.println("El numero es mas grande que 0");
            }

        // si es una instancia de String (palabra)
        } else if (item instanceof String) {
            // imprimimos la longitud de la palabra
            System.out.println("La longitud de la palabra es " + item.toString().length());
        }
    }
}


    
}
