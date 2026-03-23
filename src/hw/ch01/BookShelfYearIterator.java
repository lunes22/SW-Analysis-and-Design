// L#1s2-2 : 출판연도 역순 Iterator 
package hw.ch01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BookShelfYearIterator implements Iterator<Book> {
    private List<Book> sortedBooks; // 정렬된 데이터를 담을 리스트
    private int index;

    public BookShelfYearIterator(BookShelf bookShelf) {
        // 책장의 모든 책을 리스트에 복사(원본 데이터 변경 방지)
        this.sortedBooks = new ArrayList<>();
        for (int i = 0; i < bookShelf.getLength(); i++) {
            this.sortedBooks.add(bookShelf.getBookAt(i));
        }

        // 출판연도 기준 내림차순 정렬(=최신순 정렬)
        Collections.sort(this.sortedBooks, (b1, b2) -> b2.getYear() - b1.getYear());
        
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        // 정렬된 리스트를 순차적으로 읽기
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = sortedBooks.get(index);
        index++;
        return book;
    }
}
// L#1s2-2