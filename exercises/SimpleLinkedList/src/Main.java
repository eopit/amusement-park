import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDinamica listaDinamica = new ListaDinamica();
        listaDinamica.add("Pedro");
        listaDinamica.add("Fernando");
        listaDinamica.add("Thiago");
        listaDinamica.add("Fernanda");
        listaDinamica.add("Bernardes");
        
        listaDinamica.imprimeLista();
    }
}
