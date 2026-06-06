package practice.ch20;

public class Main {
    public static void main(String[] args) {
        // 1) Factory 없이
        System.out.println("1) Factory 없이");
        BigChar char1 = new BigChar('1');
        char1.print();

        BigChar char2 = new BigChar('2');
        char2.print();

        // 2) Factory를 이용하여 생성
        System.out.println("2) Factory를 이용하여 생성");
        BigCharFactory factory = BigCharFactory.getInstance();

        BigChar char3 = factory.getBigChar('1');
        char3.print();

        BigChar char4 = factory.getBigChar('1');
        char4.print();
        
        if (char3 == char4){ // 두 객체가 진짜로 같은 인스턴스인지 확인
            System.out.println("char3과 char4는 같은 BigChar 인스턴스 입니다.");
        }
        else{
            System.out.println("char3과 char4는 다른 BigChar 인스턴스 입니다.");
        }

        // 3) BigString 이용
        System.out.println("3) BigString 이용");
        BigString bigString = new BigString("1212123");
        bigString.print();

    }
}
