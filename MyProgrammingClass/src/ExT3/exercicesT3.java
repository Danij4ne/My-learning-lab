import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class exercicesT3 {
    //ex1
    public void MayorEdad(){
        Scanner showme = new Scanner(System.in);
        System.out.println("Introduce tu edad : ");
        int myAge = showme.nextInt();
        if (myAge >=18) {
            System.out.println("Eres mayor de edad , puedes votar");

        }
        showme = null;

    }
    //ex2
    public void NumberValue(){
        Scanner showme = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int myNumber = showme.nextInt();
        if (myNumber >= 1){
            System.out.println("El número es positivo");
            
        } else if ( myNumber == 0) {
            System.out.println("El número es cero");

        }else {
            System.out.println("El número es negativo");
        }
        showme = null;
    }
    //ex3
    public void AprobadoSuspenso(){
        Scanner showme = new Scanner(System.in);
        System.out.println("Introduce tu nota : ");
        int myNota = showme.nextInt();
        if ( myNota >=5 ){
            System.out.println("Has aprobado");
        } else {
            System.out.println("Has suspendido");
        }
        showme = null;
    }

    //ex11
    public void SistemaDescuentos (){
        Scanner showme = new Scanner(System.in);
        System.out.println(" Introduce el importe de compra : ");
        double importeCompra = showme.nextDouble();
        System.out.println(" ¿Eres Socio? ");
        boolean eresSocio = showme.nextBoolean();
        if (importeCompra >= 200 && eresSocio == true){
           double finallyPrice = importeCompra * 0.80 ; 
            double descuentoAplicado = importeCompra - finallyPrice;
            System.out.printf("Descuento aplicado (20%) : %.2f%n ", descuentoAplicado);
            System.out.printf("Importe final : %.2f%n ", finallyPrice);
            showme = null;
        }

    }
    //ex12
    

       public void validatorCon() {
        Scanner showme = new Scanner(System.in);

        System.out.print("Introduce una contraseña: ");
        String contrasenia = showme.nextLine().trim(); // .trim() quita espacios al inicio/fin

        int longitudContrasenia = contrasenia.length();
        System.out.printf("La longitud de tu contraseña es: %d%n", longitudContrasenia); // %d = entero

        boolean myLongitudOk = contrasenia.length() >= 8; // regla: mínimo 8
        System.out.printf("¿Tiene al menos 8 caracteres? : %b%n", myLongitudOk); // %b = boolean

        boolean tieneNumero = contrasenia.matches(".*\\d.*"); // contiene al menos un dígito
        System.out.printf("¿Contiene un número? : %b%n", tieneNumero);

        // Lista de contraseñas prohibidas (en minúsculas)
        Set<String> prohibidas = new HashSet<>();
        prohibidas.add("password");
        prohibidas.add("12345678");
        prohibidas.add("qwerty");
        prohibidas.add("admin");

        String lower = contrasenia.toLowerCase();
        boolean esProhibido = prohibidas.contains(lower); 
        System.out.printf("¿Es una contraseña prohibida? : %b%n", esProhibido);

        // Válida solo si NO es prohibida Y tiene número Y cumple longitud
        boolean contraseniaValida = !esProhibido && tieneNumero && myLongitudOk;
        System.out.printf("¿Es una contraseña válida (cumple todos los requisitos)? : %b%n", contraseniaValida);
        showme.close();
        
    }


    
     public void ElegiblePrestamo() {
        Scanner showme = new Scanner(System.in);

        System.out.print("Edad: ");
        int myEdad = showme.nextInt();

        System.out.print("Ingresos mensuales (€): ");
        int ingresos = showme.nextInt();

        System.out.print("¿Tienes deudas pendientes? (true/false): ");
        boolean deudas = showme.nextBoolean();

        // 🧠 1️⃣ Verificar edad
        boolean edadValida = myEdad >= 21 && myEdad <= 65;
        System.out.printf("¿Edad entre 21 y 65?: %b%n", edadValida);

        // 🧠 2️⃣ Verificar ingresos
        boolean ingresosSuficientes = ingresos >= 1000;
        System.out.printf("¿Ingresos >= 1000€?: %b%n", ingresosSuficientes);

        // 🧠 3️⃣ Verificar que NO tenga deudas
        boolean sinDeudas = !deudas; // si el usuario puso true = tiene deudas → false aquí
        System.out.printf("¿Sin deudas pendientes?: %b%n", sinDeudas);

        // 🧠 4️⃣ Condición final
        boolean elegiblePrestamo = edadValida && ingresosSuficientes && sinDeudas;
        System.out.printf("¿Elegible para préstamo?: %b%n", elegiblePrestamo);

        showme.close(); 
    }







}










