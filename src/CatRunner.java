import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<Cat> ();
        Cat cat1 = new Cat("oreo");
        Cat cat2 = new Cat("orange");
        Cat cat3 = new Cat("choco");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("tangy");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(cat2);

        cat4.setName(cat4.getName() + " meow");
        System.out.println(cat4);
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i ++) {
            String update = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(update);
        }
        System.out.println(cats);
        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
