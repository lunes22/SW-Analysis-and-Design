package hw.ch11;

import java.util.List;

public abstract class Entry {
    private Entry parent;

    // 부모를 설정한다
    protected void setParent(Entry parent) {
        this.parent = parent;
    }

    // 이름을 가져온다 
    public abstract String getName();

    // 크기를 가져온다 
    public abstract int getSize();

    // 목록을 표시한다 
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여 목록을 표시한다
    protected abstract void printList(String prefix);

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    // 전체 경로를 가져온다 **
    public String getFullName() {
        StringBuilder fullname = new StringBuilder(); // 전체 경로를 구성하기 위한 StringBuilder
        Entry entry = this;
        do {
            fullname.insert(0, entry.getName()); // 0번 위치에 현재 이름 작성
            fullname.insert(0, "/"); // 슬래시 추가
            entry = entry.parent; // 중요** 부모로 이동하는 코드, 트리의 윗방향으로 이동 / 부모쪽으로 이동하면서 경로를 얻어간다.
        } while (entry != null); // null이 아닌동안(부모가 있는동안) do 반복
        return fullname.toString();
    }

    // 키워드가 들어간 모든 Entry를 검색하여 반환
    public abstract List<Entry> search(String keyword);
}
