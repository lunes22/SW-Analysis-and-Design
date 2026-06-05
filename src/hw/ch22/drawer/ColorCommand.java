package hw.ch22.drawer;

import hw.ch22.command.Command;
import java.awt.Color;

public class ColorCommand implements Command {
    // 그리기 대상 
    protected Drawable drawable;
    // 그리기 색 
    private Color color;

    // 생성자 
    public ColorCommand(Drawable drawable, Color color) { // 도화지, 색깔 정보를 가지고 있음
        this.drawable = drawable;
        this.color = color;
    }

    // 실행 
    @Override
    public void execute() { // 가지고 있는 색깔 정보를 도화지에 전달하여 해당하는 색으로 그리게 한다.
        drawable.setColor(color); 
    }
}

