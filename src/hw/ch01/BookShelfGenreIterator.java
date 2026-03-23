// L#1s2-1 : 장르 필터 Iterator 
package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfGenreIterator implements Iterator<Book>{
    private BookShelf bookShelf;
    private String targetGenre;
    private int index;

    public BookShelfGenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.targetGenre = genre;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < bookShelf.getLength()) { // 책장 전체 순회
            Book book = bookShelf.getBookAt(index);
            if (book.getGenre().equals(targetGenre)) { //원하는 장르이면 
                return true; 
            }
            index++; //원하는 장르가 아니면 다음으로 이동
        }
        // 순회가 끝난경우
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
    
}
// L#1s2-1
