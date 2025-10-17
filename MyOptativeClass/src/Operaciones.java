public class Operaciones {
    //aqui no pones el metodo main porque solo quieres crear funciones para operaciones

    public void sumar (int number1 , int number2){
        int resultado = number1 + number2;
        System.out.println("El resultado de la suma es" +resultado );
    }

    public void sumar (double number1 , double number2){ //puedes hacer dos metodos con el mismo nombre y parametros siempre que sea diferente el tipo de dato , double , int ...
        double resultado = number1 + number2;
        System.out.println("El resultado de la suma es" +resultado );
    }



    public void restar (int number1 , int number2){ //los puedes declarar ademas static y utilizarlos en Main importando facil pero no es la mejor opcion
        int resultado = number1 - number2;
        System.out.println("El resultado de la resta es " +resultado );
    }

//Aparte de public hay protected y private, protected
// Protected = solo los documentos que esten en el mismo paquete / carpeta lo podran llamar
// Private = nadie puede llamarlo menos un metodo de la misma clase


    public int multiplicacion( int op1 , int op2){ //quitas el void para poner un return
        int resultado = op1 * op2;
        return resultado; //para que no imprima sino que retorne el resultado
    }

    public boolean validarNumero(int numero){
        return numero > 10;
    }
    


}
