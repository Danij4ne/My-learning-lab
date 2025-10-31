package ExT4SwitchFor;

public class exFor {


 // 🧩 Método que muestra cómo funciona un bucle for
    public void estructuraFor() {
        // 🔹 Queremos mostrar los números del 1 al 5 en pantalla

        // 🌀 FOR = se usa para repetir un bloque de código un número conocido de veces
        // 🔸 Estructura general:
        // for (inicio; condición; incremento) { ... }

        for (int i = 1; i <= 5; i++) {  
            // int i = 1      → inicializa la variable i con valor 1 (solo al inicio)
            // i <= 5         → condición: mientras i sea menor o igual a 5, se repite el bucle
            // i++            → incremento: después de cada vuelta, suma 1 a i (i = i + 1)

            System.out.println("Número: " + i);
            // Esto se ejecuta en cada vuelta del bucle
        }

        // Cuando i pasa de 5, la condición i <= 5 deja de cumplirse y el bucle termina
    }



    
}
