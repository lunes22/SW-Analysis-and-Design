package hw.ch10;

public class Main {
    public static void main(String[] args) {
    /* CyclicStrategy 구현 후 주석 풀고 확인하기! */

        Player player1 = new Player("Taro", new RandomStrategy(0));

        Player player2 = new Player("Bob", new CyclicStrategy());

        // 게임 진행 코드...
        // player1과 player2를 10번 게임을 진행시킴
        System.out.println("===== CyclicStrategy의 손가락 순환 =====");
        for(int i = 0; i<10; i++){
            // 플레이어 2명에서 각각 손을 얻음
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            // 손을 대결시킴
            if (nextHand1.isStrongerThan(nextHand2)) {
                player1.win();
                player2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                player1.lose();
                player2.win();
            } else {
                player1.even();
                player2.even();
            }

            if(i==9){
                System.out.println("===== 게임 진행 결과 =====");
                System.out.println(player1);
                System.out.println(player2);
            }
            else{
                System.out.println((i+1) + "번째: " + nextHand2);
            }
        }
    }
}
