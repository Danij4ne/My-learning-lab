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
    

// 🔹 Método que devuelve un número según el estado del servidor
    public int codigoAceptar(String estado) {

        // Si el texto que recibe es exactamente "levantado"
        if (estado.equals("levantado")) {
            return 200;  // Devuelve el código 200 → Todo funciona bien

        // Si el texto es "levantado problemas"
        } else if (estado.equals("levantado problemas")) {
            return 400;  // Devuelve el código 400 → Error del cliente

        // Si no coincide con ninguno de los anteriores
        } else {
            return 500;  // Devuelve el código 500 → Error del servidor
        }
    }

    // 🔹 Método que evalúa el código recibido y muestra un mensaje
    public void evaluarCodigo(String estado) {

        // Llama al método codigoAceptar() y usa su resultado dentro del switch
        switch (codigoAceptar(estado)) {

            // Si el código devuelto es 200
            case 200 -> {
                System.out.println("✅ Código 200: El servicio respondió correctamente");
            }

            // Si el código devuelto es 400
            case 400 -> {
                System.out.println("⚠️ Código 400: El servicio respondió con error del cliente");
            }

            // Si el código devuelto es 500
            case 500 -> {
                System.out.println("❌ Código 500: El servidor no pudo procesar la solicitud");
            }
        }
    }

}
