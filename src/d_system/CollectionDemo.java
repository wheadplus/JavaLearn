package src.d_system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo {
    public static void main(String[] args) {
        String book1 = "Java";
        String book2 = "C++";
        String book3 = "Python";

        Collection<String> collection = new ArrayList<>();
        ArrayList<String> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        /*
        * 和数组的区别
        *   数组长度固定
        *   集合长度可变
        * */
        String [] bookArray = new String[2];
        bookArray[0] = book1;
        bookArray[1] = book2;

        Collection<String> collectionSet = new HashSet<>();
        HashSet<String> bookSet = new HashSet<>();

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book1);

        /*
        * set 和 list 的区别
        *  set: 无序，不可重复
        *  list: 有序，可重复
        * */
    }
}
