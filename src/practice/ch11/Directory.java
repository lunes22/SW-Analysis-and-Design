package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    // 자식들을 보관하는 리스트; 
    // Entry로 선언하면 부모 타입이므로 자식인 Directory클래스와 File클래스를 모두 담을 수 있음
    private List<Entry> directory = new ArrayList<>(); 

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() { // 모든 자식의 크기를 더함
        int size = 0; // 초기화 한 뒤 진행해야함!!!
        for (Entry entry: directory) { // 형식(원소 변수: 컬렉션)
            size += entry.getSize(); // getSize안에서 getSize를 다시 호출 = "재귀적 호출"(교안 9p 참조)
        } // 꺼내온 entry가 폴더이면, 다음 자식을 꺼내오고 그 자식이 폴더이면 또 다음 자식을 꺼내오는 식으로 계속해서 호출이 이어짐
        return size;
    }

    @Override
    // 원리를 잘 기억할 것!
    protected void printList(String prefix) { // 이 디렉터리의 이전(아까까지의) 경로
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name); // 이 폴더까지 포함한 경로를 자식에 전달
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) { // 부모타입으로 선언되어 있으므로 Entry를 매개변수로 담을 수 있다(?)
        directory.add(entry);
        return this;
    }
}
