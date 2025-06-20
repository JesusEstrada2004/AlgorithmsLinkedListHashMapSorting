package ejemplo01;
import java.util.*;

/**
 *Ejercicio 1 – Orden de atención por prioridad social
 * Contexto: En una oficina se atienden solicitudes según su tipo: urgentes, regulares o informativas.
 * Se requiere un sistema que ordene automáticamente las solicitudes según prioridad antes de atenderlas.
 * Entrada:
 * List<String> solicitudes = Arrays.asList("Regular", "Informativa", "Urgente", "Urgente", "Regular");
 * Salida:
 * Atención: Urgente -> Urgente -> Regular -> Regular -> Informativa.
 */
public class AtencionSolicitudes {
    public static void main(String[] args) {
        List<String> solicitudes = Arrays.asList("Regular", "Informativa", "Urgente", "Urgente", "Regular");
        String resultado = ordenarPrioridad(solicitudes);
        System.out.println(resultado);
    }
    //Algoritmo que ordena las solicitudes por prioridad
    private static String ordenarPrioridad(List<String> solicitudes) {
        Map<String, Integer> prioridad = Map.of(
                "Urgente", 1,
                "Regular", 2,
                "Informativa", 3
        );

        //Creamos una copia de solicitudes, la ordenamos por prioridad y no modificamos la original
        List<String> copia = new ArrayList<>(solicitudes);
        copia.sort(Comparator.comparingInt(prioridad::get));
        return "Atencion: " + String.join(" -> ", copia); // Ejemplo de salida: Atención: Urgente -> Urgente -> Regular -> Regular -> Informativa.

    }
}
