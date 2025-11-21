package ArraysOrCollecciones;
public class MainBonoloto { 
    public static void main(String[] args){

        Bonoloto bonoloto = new Bonoloto(); //aqui estan los dos int privado y publico que hemos creado en Bonoloto 

        bonoloto.generarNumerosSistema(); //generamos los numeros del sistema (funcion que hemos hecho antes)

        bonoloto.pedirNumerosUsuario();
    }

}