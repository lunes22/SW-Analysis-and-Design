package practice.ch01;

import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        // 책 테스트
        Book book = new Book("Java Programming");
        System.out.println("Book name: " + book.getName());

        // 책장 테스트
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Design Patterns"));
        bookShelf.appendBook(new Book("Effective Java"));

        // 책장에 있는 책 출력

        // 방법1: 클라이언트가 책꽂이에 직접 접근하여 책을 가져오는 방법
        for (int i = 0; i < bookShelf.getLength(); i++) {
            System.out.println("Book at index " + (i+1) + ": " + bookShelf.getBookAt(i).getName());
        } // 만약 책꽂이가 바뀌면 클라이언트가 영향을 받음(꺼내올 수 없음)

        // 방법2: Iterator를 사용하여 책을 가져오는 방법
        // iterator를 얻어옴
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println("Book: " + it.next().getName());
        }  // 클라이언트는 책꽂이가 바뀌어도 영향이 없음, itorator은 영향을 받음
        // 클라이언트는 여러명이지만 iterator은 하나이기 때문에 방법2가 더 나음(?)
        // -> 코드의 수정이 일어났을 때, 이로인한 수정을 적게 하는 것이 중요하기 때문(OCP 원칙_Open-closed principle)
        
        // (방법3: )확장 for문을이용한 방법
        // 이게 가능한 이유는 BookShelf가 Iterable 인터페이스를 구현했기 때문
        for (Book b : bookShelf) { // 형식:  for (요소타입 변수명 : 컬렉션) { ... }
            System.out.println("Book: " + b.getName());
        }
    }
}