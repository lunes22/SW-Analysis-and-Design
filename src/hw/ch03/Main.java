package hw.ch03;

public class Main {
    public static void main(String[] args) {
        // L03S3_기존 코드 호환성 확인
        AbstractDisplay d1 = new CharDisplay('H');          
        AbstractDisplay d2 = new StringDisplay("Hello");    
        d1.display(); 
        d2.display(); 
        
        // L03S3_[3-2]step1 테스트: 반복 횟수 제어
        AbstractDisplay e1 = new CharDisplay('X', 3);      
        AbstractDisplay e2 = new StringDisplay("Test", 7); 
        e1.display(); 
        e2.display(); 
        
        // L03S3_[3-3]step 2 테스트: 새로운 Display - NumberDisplay 테스트 
        AbstractDisplay num = new NumberDisplay(42, 4); 
        num.display();

    }
}
