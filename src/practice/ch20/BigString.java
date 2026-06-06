package practice.ch20;

public class BigString {
    // '큰 문자'의 배열
    private BigChar[] bigchars;

    // 생성자 
    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigchars = new BigChar[string.length()]; // String의 길이만큼의 배열을 생성
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i)); // 공장으로부터 얻어옴
        }
    }

    // 표시
    public void print() {
        for (BigChar bc: bigchars) {
            bc.print();
        }
    }
}
