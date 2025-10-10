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


}
