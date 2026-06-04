package practice.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;

// 명령어 묶음이면서 하나의 명령어
public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();

    // 실행 
    @Override
    public void execute() {
        for (Command cmd: commands) {
            cmd.execute(); // 리커시브 호출
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            // 자기 자신을 추가하면 무한 루프에 빠짐 -> 따라서 오류발생시켜서 막음
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop(); // 마지막 명령을 pop으로 꺼냄
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }
}
