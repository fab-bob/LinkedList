import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata*/
public class Main {
    public static void main (String[] args) {
        List<Fruit> macedonia = new LinkedList<>();
        macedonia.add(new Fruit ("Mela"));
        macedonia.add(new Fruit ("Pera"));
        macedonia.add(new Fruit ("Banana"));
        macedonia.add(new Fruit ("Pesca"));
        macedonia.add(new Fruit ("Albicocca"));
        macedonia.add(new Fruit ("Anguria"));
        System.out.println(macedonia);
        macedonia.addFirst(new Fruit ("Percoco"));
        macedonia.addLast(new Fruit ("Uva"));
        System.out.println(macedonia);
        /*macedonia.sort(Comparator.comparing(Fruit :: getName));
        System.out.println(macedonia);
         */
    }
}
