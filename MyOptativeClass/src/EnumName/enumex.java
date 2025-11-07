package EnumName;

public class enumex {

    // enum → valores fijos que no pueden ser alterados ni modificados
    enum DiasSemana { 
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    public  void DiasSemanas() {
        DiasSemana dia = DiasSemana.Lunes; 
        //Crea una variable llamada dia del tipo DiasSemana, y guárdale el valor Lunes (uno de los valores posibles de ese tipo).”

        switch (dia) {
            case Lunes:
                System.out.println("Inicio de semana");
                break;
            case Martes:
                System.out.println("Segundo día");
                break;
            case Miercoles:
                System.out.println("Mitad de semana");
                break;
            case Jueves:
                System.out.println("Casi viernes");
                break;
            case Viernes:
                System.out.println("Por fin viernes");
                break;
            case Sabado:
                System.out.println("Fin de semana");
                break;
            case Domingo:
                System.out.println("Domingo de descanso");
                break;
        }
    }

    




}
