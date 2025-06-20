package ejemplo04;
import java.util.* ;

public class RankingProduccion {
    public static void main(String[] args) {
        List<Proyecto>proyectos = new ArrayList<>();
        proyectos.add(new Proyecto("solar Norte",78.4));
        proyectos.add(new Proyecto("BioRural",75.2));
        proyectos.add(new Proyecto("HidroVerde",89.5));

        bubbleSort(proyectos);

        System.out.println("Ranking de efeiciencia de proyectos: ");
        for(Proyecto p: proyectos){
            System.out.println(p.nombre + " : " + p.eficiencia + "%");
        }
    }

    static void bubbleSort(List<Proyecto> lista) {
        //declarar un tamaño del arraylist
        int n = lista.size();
        //se trabja com dos for uno para comparar y el otro para el recorrido del ordenamiento
        for (int i = 0; i < n - i; i++){
            for (int j = 0; j < n - i-1; j++){
                if (lista.get(j).eficiencia < lista.get(j+1).eficiencia){
                    Collections.swap(lista, j, j+1);
                }
            }
        }
    }
}
