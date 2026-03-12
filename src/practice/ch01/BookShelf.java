package practice.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
// public class BookShalf
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() { // 자기 자신(현재 책꽂이)
        return new BookShelfIterator(this);
    }
}
