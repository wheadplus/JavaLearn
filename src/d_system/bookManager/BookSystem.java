package src.d_system.bookManager;

import java.util.ArrayList;
import java.util.Scanner;

public class BookSystem {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        while (true) {
            System.out.println("欢迎使用图书管理系统");
            System.out.println("1. 添加图书");
            System.out.println("2. 删除图书");
            System.out.println("3. 修改图书");
            System.out.println("4. 查看所有图书");
            System.out.println("5. 退出");
            System.out.println("请做出你的选择：");

            // 用scanner接收用户输入
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line);

            switch (line) {
                case "1":
                    // 添加书籍
                    addBook(bookList);
                    break;
                case "2":
                    // 删除书籍
                    deleteBook(bookList);
                    break;
                case "3":
                    // 修改书籍
                    updateBook(bookList);
                    break;
                case "4":
                    // 查询书籍
                    queryBook(bookList);
                    break;
                case "5":
                    // 退出系统
                    System.out.println("拜了个拜");
                    System.exit(0);
                    break;
            }
        }
    }

    /*
    * 判断图书编号是否被占用
    * @param bookList
    * @param id
    * @return 如果返回true，说明编号被占用
    * */

    public static boolean isUsed(ArrayList<Book> bookList, String id) {
        boolean flag = false;
        for( int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if(book.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void addBook(ArrayList<Book> bookList) {
        // 1. 提示并接收用户输入
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("please enter the book id: ");
            id = scanner.nextLine();
            boolean flag = isUsed(bookList, id);
            if(flag) {
                System.out.println("The book id has been used, please re-enter!");
            } else {
                break;
            }
        }
        System.out.println("请输入书名：");
        String name = scanner.nextLine();
        System.out.println("请输入作者：");
        String author = scanner.nextLine();
        System.out.println("请输入价格：");
        String price = scanner.nextLine();

        // 2. 将用户输入的信息封装到Book对象中
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setAuthor(author);
        book.setPrice(price);

        bookList.add(book);

        System.out.println("添加成功！");
    }

    /*
    * 删除书籍
    * @param bookList
    * @return 如果返回true，说明删除成功
    * */
    public static void deleteBook(ArrayList<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书籍编号: ");
        String id = scanner.nextLine();
        int index = -1;
        for(int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if(book.getId().equals(id)) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("书本ID不存在，删除失败！");
        } else {
            bookList.remove(index);
            System.out.println("删除书本成功！");
        }
    }

    /*
    * 修改书籍
    * @param bookList
    * @return 如果返回true，说明修改成功
    * */
    public static void updateBook(ArrayList<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的书籍编号: ");
        String id = scanner.nextLine();
        int index = -1;
        for(int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if(book.getId().equals(id)) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("书本ID不存在，修改失败！");
        } else {
            System.out.println("请输入书名：");
            String name = scanner.nextLine();
            System.out.println("请输入作者：");
            String author = scanner.nextLine();
            System.out.println("请输入价格：");
            String price = scanner.nextLine();

            // 2. 将用户输入的信息封装到Book对象中
            Book book = new Book();
            book.setId(id);
            book.setName(name);
            book.setAuthor(author);
            book.setPrice(price);

            bookList.set(index, book);
            System.out.println("修改书本成功！");
        }
    }
    /*
    * 查看所有书籍
    * @param bookList
    * @return
    * */
    public static void queryBook(ArrayList<Book> bookList) {
        if(bookList.size() == 0) {
            System.out.println("没有任何书籍，请先添加书籍！");
            return;
        }
        System.out.println("书籍编号\t书籍名称\t书籍作者\t书籍价格");
        for(int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
        }
    }
}
