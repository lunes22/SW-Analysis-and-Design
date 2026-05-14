package practice.ch19;

// 상태를 나타내는 인터페이스
public interface State {
    public abstract void doClock(Context context, int hour);	// 시간 설정

    // 특정 상태에서 해야하는 행동 
    // -> 전부 Context를 받아 메소드를 돌린다.
    public abstract void doUse(Context context);		// 금고 사용 
    public abstract void doAlarm(Context context);		// 비상벨 
    public abstract void doPhone(Context context);		// 일반 통화 
}
