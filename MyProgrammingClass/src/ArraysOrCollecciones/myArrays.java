package ArraysOrCollecciones;

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
int longi = numeros2.length;
//acceder a numeros de los elementos

    
}
