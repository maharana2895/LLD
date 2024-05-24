package TicTacToe;

import TicTacToe.Module.PieceType;
//import java.lang.*;


public class Main {
	public static void main(String args[]) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
//        PieceType p=PieceType.X;
//        System.out.println(p);
        System.out.println("game winner is: " + game.startGame());
    }

}
