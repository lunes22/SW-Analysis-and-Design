package hw.ch16;

import java.awt.Color;
import java.awt.Label;
// import java.awt.TextField;
// import java.awt.event.TextEvent;
// import java.awt.event.TextListener;

public class ColleagueLabel extends Label implements Colleague{
    private Mediator mediator;
    
    public ColleagueLabel(String text, int alignment) {
        super(text, alignment);
    }
    // Mediator를 설정한다 
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);

        // 글자 내용 변경
        setText(enabled ? "● 로그인 가능" : "● 로그인 불가");
        // 활성/비활성에 맞게 글자 색을 변경
        setForeground(enabled ? Color.blue : Color.gray);
    }
}
