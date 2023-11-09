import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        Fruit fruit1 = new Fruit("Mela");
        Fruit fruit2 = new Fruit("Banana");
        Fruit fruit3 = new Fruit("Arancia");
        Fruit fruit4 = new Fruit("Pera");
        Fruit fruit5 = new Fruit("Mandarino");
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        System.out.println(fruits);

        fruits.addFirst(fruit4);
        fruits.addLast(fruit5);
        System.out.println(fruits);
    }
}
