package hw.ch02;

// 제공된 코드 1 : Adaptee
// 수정이 불가한 라이브러리(어댑티)
public class KoreanOutlet {
    // 한국 표준 전원: 220V AC
    public int provide() { 
        System.out.println("한국 콘센트에서 220V AC 전원을 제공합니다.");
        return 220;  // 220V
    }   
}
