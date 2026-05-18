package practice.ch17;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) { // 통지받을 때 호출되는 메소드

        System.out.println("DigitObserver:" + generator.getNumber());
        
        try {
            Thread.sleep(1000); // 1초 대기한다
        } catch (InterruptedException e) {
        }
    }
}
