package practice.ch17;

// 관찰자를 나타내는 인터페이스
public interface Observer {
    public abstract void update(NumberGenerator generator); // 통지받을 때 호출되는 메소드
}
