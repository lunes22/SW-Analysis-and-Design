package hw.ch05;

public class LoggerSynchronizedLazy {
    private static LoggerSynchronizedLazy LogSync = null;

    private StringBuilder logBuffer; 

    // 1. 생성자
    private LoggerSynchronizedLazy() {
        System.out.println("Singleton 객체가 생성됩니다.");
        logBuffer = new StringBuilder(); 
    }

    // 2. 객체 얻어가는 메소드 정의
    public static synchronized LoggerSynchronizedLazy getInstance() {
        if (LogSync == null) { 
            LogSync = new LoggerSynchronizedLazy(); 
        }
        return LogSync; 
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ").append(message).append("\n"); 
        System.out.println("[LoggerStaticInit] " + message); 
    } 
    public String getLog() { 
        return logBuffer.toString(); 
    } 
}
