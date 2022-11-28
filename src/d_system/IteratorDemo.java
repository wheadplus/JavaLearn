package src.d_system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        String book1 = "Java";
        String book2 = "C++";
        String book3 = "Python";

        Collection<String> collection = new ArrayList<>();
        ArrayList<String> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book1);
        System.out.println("*** bookList ***");
        Iterator<String> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            System.out.println(book);
        }

        System.out.println("*** bookSet ***");
        Collection<String> collectionSet = new HashSet<>();
        HashSet<String> bookSet = new HashSet<>();

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book1);

        Iterator<String> iteratorSet = bookSet.iterator();
        while(iteratorSet.hasNext()) {
            String book = iteratorSet.next();
            System.out.println(book);
        }
    }
}
