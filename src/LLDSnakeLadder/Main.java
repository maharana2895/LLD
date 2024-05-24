package LLDSnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String args[]) {

//        Game obj = new Game();
//        obj.startGame();
    	int j=100;
    	while(j>0) {
    	System.out.println(ThreadLocalRandom.current().nextInt(1,7));
    	j--;
    	}
    }
}

