package hw.ch05;

// [2-3] Enum 테스트 
public class Main3 {
    public static void main(String[] args) {
        /* LoggerEnum.java 구현 후 이 주석 제거 및 아래 코드 주석 풀기 */   

        System.out.println("\n========== 방식 3: Enum (권장) =========="); 
        LoggerEnum logger3a = LoggerEnum.INSTANCE; 
        LoggerEnum logger3b = LoggerEnum.INSTANCE; 
 
        logger3a.log("Enum Message 1"); 
        logger3b.log("Enum Message 2"); 
 
        if (logger3a == logger3b) { 
            System.out.println("✓ 동일한 인스턴스"); 
        } else { 
            System.out.println("✗ 다른 인스턴스"); 
        } 
        System.out.println("\n========== 로그 출력 3 =========="); 
        System.out.println("[LoggerEnum 로그]"); 
        System.out.println(logger3a.getLog());
    } 
}
