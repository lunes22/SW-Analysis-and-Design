package practice.ch10;

public class Main {
    public static void main(String[] args) {
        /* 1. 전략없이 플레이어 없이(손 객체를 만들어) 게임 */
        // // 손을 2개 얻기
        // Hand h1 = Hand.ROCK;
        // Hand h2 = Hand.SCISSORS;

        // // 얻은 2개의 손을 대결시킴
        // if (h1.isStrongerThan(h2)){
        //     System.out.println("h1이 이겼습니다.");
        // } else if (h1.isWeakerThan(h2)) {
        //     System.out.println("h2가 이겼습니다.");
        // } else {
        //     System.out.println("비겼습니다.");
        // }

        /* 2. 플레이어 객체와 전략을 사용하여 게임 */
        // 플레이어 2명 만들기 게임 시키기
        Player player1 = new Player("Luna", new WinningStrategy(314));
        Player player2 = new Player("Bini", new WinningStrategy(154));

        // 게임 시키기
        for(int i = 0; i<10; i++){
            // 플레이어 2명에서 각각 손을 얻음
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            // 손을 대결시킴
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

    }
}
