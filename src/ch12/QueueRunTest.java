package ch12;

public class QueueRunTest {
    public static void main(String[] args) {
        Queue book = new BookShelf();
        book.enQueue("1");
        book.enQueue("2");
        book.enQueue("3");
        book.enQueue("4");

        System.out.println(book.getSize());
        System.out.println(book.deQueue());
    }
}
