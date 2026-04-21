package practice.ch11;;

public class Main {
    public static void main(String[] args) {
        /* 파일 구조
        root
        ├── bin
        │   ├── vi (size: 10000)
        │   └── latex (size:20000)
        ├── tmp
        └── usr
         */
        
        // 디렉터리 트리를 만든다
        // Directory root = new Directory("root");
        // entry에 add() 메소드가 없어 add()를 호출하면 에러 발생함, 들어가있는 객체보다 선언된 타입이 우선시 되어 결국에는 root는 Entry타입이 되는 것이다.
         // Entry로 선언함으로서 코드 자체는 유연해짐
        Entry root = new Directory("root"); // 업캐스팅은 자동으로 일어남

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        // 따라서 add()메소드를 사용하려면 다운캐스팅(Entry -> Directory)을 해주어야 한다.(번거롭지만 필요함)
        ((Directory) root).add(bin); // 형변화 연산과 . 중 .이 우선순위가 더 높아 ()을 통해 우선순위를 확보해주어야한다. -> 타입캐스팅 < . < ()
        ((Directory) root).add(tmp);
        ((Directory) root).add(usr);

        // root.add(bin);
        // root.add(tmp);
        // root.add(usr);

        // 파일 생성 및 추가
        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));

        // 디렉토리 리스트 출력
        root.printList();
    }
}
