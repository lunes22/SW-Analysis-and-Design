package practice.ch01;

import java.util.Iterator; // java.util 패키지의 Iterator 인터페이스를 사용하기 위해 import
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index; //책꽂이에서 현재 위치를 나타내는 변수

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() { // 책꽂이에서 꺼내올 다음 책이 있는지 확인하는 메소드
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() { 
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++; // 교안 20p
        return book;
    }
}
