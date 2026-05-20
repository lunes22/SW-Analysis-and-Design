package hw.ch17;

public class RangeObserver implements Observer { 
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        if (number >= 0 && number < 10) {
            System.out.println("RangeObserver: [Low] "+ generator.getNumber());
        }
        else if (number >=10 && number < 20) {
            System.out.println("RangeObserver: [Mid] "+ generator.getNumber());
        }
        else {
            System.out.println("RangeObserver: [High] "+ generator.getNumber());
        }
    }
    
}
