package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>(); // 자식들을 보관하는 리스트; Entry: 부모 타입(Directory와 File 모두 담을 수 있음)

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
            size += entry.getSize(); //getSize안에서 getSize를 호출 = "재귀적 호출"
        }
        return size;
    }

    @Override
    protected void printList(String prefix) { // 이 디렉터리의 이전 경로
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name); // 이 폴더까지 포함한 경롤를 자식에 전달
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) { // 부모타입으로 선언되어 있으므로 Entry를 매개변수로 담을 수 있다(?)
        directory.add(entry);
        return this;
    }
}
