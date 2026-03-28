package hw.ch02;

// Adapter
// targer: Charger
// Adaptee: KoreanOutlet
public class KoreanOutletAdapter extends Charger{

    private KoreanOutlet koreanOutlet;

    public KoreanOutletAdapter(){
        this.koreanOutlet = new KoreanOutlet();
    }

    @Override
    public int charge() {
        // KoreanOutlet의 provide() 메서드를 호출하여 전압을 얻음
        return koreanOutlet.provide();
    }
}
