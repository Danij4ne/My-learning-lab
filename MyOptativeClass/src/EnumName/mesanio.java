package EnumName;

public class mesanio {
    

// ✅ Declaramos un enum llamado MesesAño
// Un enum sirve para representar un conjunto fijo de constantes (meses, días, etc.)
public enum MesesAño {

    // 🔹 Definimos los 12 meses del año.
    // Cada mes tiene dos valores: la estación y el número del mes.
    Enero("Invierno", 1),
    Febrero("Invierno", 2),
    Marzo("Primavera", 3),
    Abril("Primavera", 4),
    Mayo("Primavera", 5),
    Junio("Verano", 6),
    Julio("Verano", 7),
    Agosto("Verano", 8),
    Septiembre("Otoño", 9),
    Octubre("Otoño", 10),
    Noviembre("Otoño", 11),
    Diciembre("Invierno", 12);

    // 🧩 Variables (atributos) del enum
    // Cada mes tendrá una estación y un número
    private String estacion;
    private int numero;

    // 🧠 Constructor del enum
    // Se ejecuta una vez por cada valor (mes) definido arriba
    MesesAño(String estacionP, int numeroP) {
        estacion = estacionP;  // Guarda la estación del mes
        numero = numeroP;      // Guarda el número del mes
    }

    // 📦 Getter para obtener la estación de un mes
    public String getEstacion() {
        return estacion;
    }

    // 📦 Getter para obtener el número del mes
    public int getNumero() {
        return numero;
    }
}



}
