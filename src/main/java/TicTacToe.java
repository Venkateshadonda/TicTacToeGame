import Controller.GameController;
import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GameController gameController=new GameController();

        System.out.println("Enter the dimension of the Board: ");
        int dimension=sc.nextInt();

        System.out.println("Do you want Bot to Play with You: y/n");
        String isBotString=sc.next();

        int iterator=dimension-1;
        if(isBotString.equals("y"))
            iterator=dimension-2;

        List<Player> players=new ArrayList<>();

        for(int i=0;i<iterator;i++){
            System.out.println("Enter the Player name"+i);
            String name=sc.next();
            System.out.println("Enter the Player"+i+" Symbol:");
            String symbol=sc.next();

            players.add(new Player(name, symbol.charAt(0), PlayerType.HUMAN));
        }
        if(isBotString.equals("y")){
            System.out.println("Enter the Bot name :");
            String name=sc.next();
            System.out.println("Enter the Bot Symbol:");
            String symbol=sc.next();

            System.out.println("Enter the Difficulty Level of the Bot(EASY, MEDIUM, HARD):");
            BotDifficultyLevel df= BotDifficultyLevel.valueOf(sc.next());

            players.add(new Bot(name, symbol.charAt(0), df));
        }

        Game game=gameController.createGame(dimension, players);

        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            System.out.println("This is the current Board");

            gameController.displayBoard(game);

            gameController.executeNextMove(game);
        }
        System.out.println("Game has ended. Result was: ");
        if (!game.getGameStatus().equals(GameStatus.DRAW)) {
            System.out.println("Winner is: " + gameController.getWinner(game).getName());
            game.displayBoard();
        }
    }
}
