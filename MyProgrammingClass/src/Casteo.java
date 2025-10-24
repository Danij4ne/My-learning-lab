

    public class Casteo {

        public static void Infocasteo() {

            /* ----------------------------------------------------
             * 1️⃣ CASTEO IMPLÍCITO (AUTOMÁTICO)
             * ----------------------------------------------------
             * Ocurre cuando Java convierte un tipo más pequeño en
             * otro más grande automáticamente (sin pérdida de datos).
             * ---------------------------------------------------- */
            int numeroEntero = 10;
            double numeroDecimal = numeroEntero; // int → double (automático)
            System.out.println("Casteo implícito (int → double): " + numeroDecimal); // 10.0


            /* ----------------------------------------------------
             * 2️⃣ CASTEO EXPLÍCITO (MANUAL)
             * ----------------------------------------------------
             * Se hace colocando el tipo entre paréntesis antes
             * del valor. Puede haber pérdida de datos.
             * ---------------------------------------------------- */
            double valorDecimal = 9.75;
            int valorEntero = (int) valorDecimal; // double → int (manual)
            System.out.println("Casteo explícito (double → int): " + valorEntero); // 9


            /* ----------------------------------------------------
             * 3️⃣ CASTEO ENTRE CHAR Y NÚMEROS
             * ---------------------------------------------------- */
            char letra = 'A';
            int codigoAscii = letra; // char → int (implícito)
            System.out.println("Char → int: " + codigoAscii); // 65

            int numeroLetra = 66;
            char letraConvertida = (char) numeroLetra; // int → char (explícito)
            System.out.println("Int → char: " + letraConvertida); // 'B'


            /* ----------------------------------------------------
             * 4️⃣ CASTEO ENTRE STRING Y NÚMEROS
             * ---------------------------------------------------- */
            String textoNumero = "123";
            int numeroConvertido = Integer.parseInt(textoNumero); // String → int
            System.out.println("String → int: " + (numeroConvertido + 1)); // 124

            double numeroDouble = Double.parseDouble("3.14"); // String → double
            System.out.println("String → double: " + (numeroDouble + 1)); // 4.14

            // Números → String (al revés)
            int n = 99;
            String texto = String.valueOf(n); // int → String
            System.out.println("int → String: " + texto + 1); // "991"


            /* ----------------------------------------------------
             * 5️⃣ CASTEO ENTRE BOOLEAN Y STRING
             * ---------------------------------------------------- */
            boolean valor = true;
            String textoBool = String.valueOf(valor); // boolean → String
            System.out.println("boolean → String: " + textoBool); // "true"

            String palabraTrue = "true";
            boolean boolConvertido = Boolean.parseBoolean(palabraTrue); // String → boolean
            System.out.println("String → boolean: " + boolConvertido); // true

        }
    }

















