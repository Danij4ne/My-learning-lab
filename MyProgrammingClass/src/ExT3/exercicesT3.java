import java.util.Scanner;


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
    

        public void  PasswordValidator() {
    
        Scanner showme = new Scanner(System.in);

        System.out.print("Introduce una contraseña: ");
        String myPassword = showme.nextLine();

        // 1️⃣ Longitud mínima de 8 caracteres
        boolean longitud = myPassword.length() >= 8;
        System.out.printf("¿Tiene al menos 8 caracteres?: %b%n", longitud);

        // 2️⃣ Contiene al menos un número
        boolean numbers = myPassword.matches(".*\\d.*");
        System.out.printf("¿Contiene al menos un número?: %b%n", numbers);

        // 3️⃣ No puede ser una contraseña prohibida
        boolean prohibido = myPassword.equals("12345678") || myPassword.equalsIgnoreCase("password");
        System.out.printf("¿Es una contraseña prohibida?: %b%n", prohibido);

        // 4️⃣ Evaluar si es válida
        boolean valido = longitud && numbers && !prohibido;
        System.out.printf("¿Es válida? (cumple todos los requisitos): %b%n", valido);

        // 5️⃣ Mostrar resultado final
        if (!valido) {
            System.out.println("❌ Contraseña NO válida. Debe cumplir los siguientes requisitos:");
            if (!longitud) System.out.println("- Tener al menos 8 caracteres.");
            if (!numbers) System.out.println("- Contener al menos un número.");
            if (prohibido) System.out.println("- No usar contraseñas prohibidas como '12345678' o 'password'.");
        } else {
            System.out.println("✅ Contraseña válida. ¡Bien hecho!");
        }

        showme.close();
    
}







}










