package practice.ch19;

public interface Context {
    public abstract void setClock(int hour);			// 시간 설정 

    public abstract void changeState(State state);		// 상태 변화(업캐스팅 방법을 활용하여 하위 state객체를 모두 받음)

    public abstract void callSecurityCenter(String msg);	// 경비 센터 경비원 호출
    public abstract void recordLog(String msg);		// 경비 센터 기록 
}
