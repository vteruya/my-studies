
import java.util.ArrayList;

public class PesquisaNumeroTell {
    public static void main(String[] args){
    ArrayList<Long> listaNum = new ArrayList();
    listaNum.add(11992712617L);
    listaNum.add(12992712617L);
    listaNum.add(13992712356L);
    listaNum.add(21992712637L);
    listaNum.add(22992714653L);

    System.out.println(pesquisaBinaria(listaNum, 12));
    }
    public static Integer pesquisaBinaria(ArrayList lista, int item) {
        int min = 0;
        lista = retornaDDD(lista);
        int max = lista.size();

        for(min = 0; min <= max; ++min){
            int meio = (min + max) / 2;
            int chute = (int) lista.get(meio);
            if (chute == item)
                return meio;
            if (chute > item)
                max = meio - 1;
             else
                chute = min + 1;
        }
        return null;
    }

    private static ArrayList retornaDDD(ArrayList<Long> lista) {
        ArrayList<Integer> listDDD = new ArrayList<>();
        for(Long ddd: lista){
          String a = Long.toString(ddd).substring(0,2);
          listDDD.add(Integer.valueOf(a));
        }
        return listDDD;
    }


}
