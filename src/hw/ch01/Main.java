package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220913 이름: 박수빈"); 
        // 깃허브에서 ch01쪽으로 접근하여 주소 복사
        // 설명은 변경한 부분만, 짧고 간결하게 시연하면서 설명할것.
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // L#1s4-1 새로운 책 데이터
        BookShelf newBookShelf = new BookShelf(10);
        newBookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        newBookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설" , 1997, 15000));
        newBookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        newBookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        newBookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        newBookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        newBookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        newBookShelf.appendBook(new Book("리펙터링", "기술", 2018, 34000));
        newBookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000)); 
        newBookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));
        // L#1s4-1

        // // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법 
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

        // L#1s4-2 장르가 "소설"인 책만 출력하는 방법
        for (Book book: newBookShelf) {
            if (book.getGenre().equals("소설")) {
                System.out.println(book.getName());
            }
        }
        System.out.println();
        // L#1s4-2

        // L#1s4-3 출판연도(year) 기준으로 최신 책부터 차례대로 꺼내와서 출력
        Iterator<Book> yearIt = newBookShelf.iteratorByYear();
        System.out.println("책 이름" + " | " + "장르" + " | " + "출판연도" + " | " + "가격");
        while (yearIt.hasNext()) {
            Book book = yearIt.next();
            System.out.println(book.getName() + " | " + book.getGenre() + " | " + book.getYear() + " | " + book.getPrice());   
        }
        System.out.println();
        // L#1s4-3
    }
}
