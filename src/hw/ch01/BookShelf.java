package hw.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
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
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    //L#1s3 Step 2에서 구현한 2 종류의 iterator를 얻어 오는 메소드 2가지
    public Iterator<Book> iteratorByGenre(String genre) {
        return new BookShelfGenreIterator(this, genre);
    }

    public Iterator<Book> iteratorByYear() {
        return new BookShelfYearIterator(this);
    //L#1s3
    }
}
