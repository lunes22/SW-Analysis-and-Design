package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열(실행한 명령들을 저장)
    private Deque<Command> commands = new ArrayDeque<>();
    // 삭제된 명령을 저장하는 배열(step1)
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    @Override
    public void execute() {
    // 수정
    Iterator<Command> it = commands.descendingIterator(); // 꼬리부터
    while (it.hasNext()) {
        it.next().execute();
    }
}

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() { 
        if (!commands.isEmpty()) { // commands가 비어있지 않은 경우에만
            Command cmd = commands.pop(); // undo한 명령어를 임시로 담아서(step2)
            commandsForRedo.push(cmd); // redo할 때 사용할 수 있도록 commandsForRedo에 보관(step2)
        }
    }

    // commandsForRedo에서 최근 명령을 꺼내서 commands에 다시 추가(step3)
    public void redo(){
        if (!commandsForRedo.isEmpty()) { // commands가 비어있지 않은 경우에만
            Command cmd = commandsForRedo.pop(); // commandsForRedo의 명령어를 꺼내서
            commands.push(cmd); // 복원한다
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
        commandsForRedo.clear(); // step5
    }
}
