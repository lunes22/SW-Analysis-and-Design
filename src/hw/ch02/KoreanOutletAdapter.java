package hw.ch02;

// Adapter
// targer: Charger
// Adaptee: KoreanOutlet
public class KoreanOutletAdapter implements Charger{

    private KoreanOutlet koreanOutlet; // 위임 대상인 KoreanOutlet 객체를 참조하고 처리를 맡김

    public KoreanOutletAdapter(){
        this.koreanOutlet = new KoreanOutlet();
    }

    public int charge() {
        // KoreanOutlet의 provide() 메서드를 호출하여 전압을 얻음
        return koreanOutlet.provide();
    }
}
