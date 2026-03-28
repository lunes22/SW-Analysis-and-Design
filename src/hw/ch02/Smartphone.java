package hw.ch02;

public class Smartphone {
    private Charger charger; // 스마트폰은 충전기를 필요로 함

    public Smartphone(Charger charger) {
        this.charger = charger;
    }

    public void charge() {
        int voltage = charger.charge(); // 충전기에서 전압을 요청
        System.out.println("스마트폰이 " + voltage + "V 에서 충전합니다.");
    }
}
