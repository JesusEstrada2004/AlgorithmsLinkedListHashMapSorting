package ejemplo02;
/*Ejercicio 2 – Registro móvil de entregas de vales
Contexto: Un equipo en terreno registra entregas de ayuda a beneficiarios. El orden cambia constantemente por
prioridades o cambios logísticos. Simula este proceso con LinkedList.
Operaciones:
- Agregar entrega
- Eliminar por índice (por error o cambio)
- Mostrar todas las entregas
 */
import java.util.*;

public class RegistroEntrega {
    public static void main(String[] args) {
        LinkedList<String> entregas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("\n1.Agregar Entrega\n2.Eliminar Entrega\n3.Mostrar Entregas\n4.Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("¿Cual es el nombre del beneficiario? ");
                    entregas.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Indice del beneficiario: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < entregas.size()){
                        entregas.remove(index);
                    }else {
                        System.out.println("EL INDICE ES INVALIDO");
                    }
                    break;
                case 3:
                    System.out.println("Lista de Entregas: ");
                    for (int i = 0; i < entregas.size(); i++){
                        System.out.println("-" + entregas.get(i));
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida (1, 2, 3, 4)");
            }
        }
    }
}
