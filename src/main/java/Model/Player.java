package Model;

import java.util.Scanner;

public class Player {
    String Name;
    char symbol;
    PlayerType playerType;


    public Player(String name, char symbol, PlayerType playerType) {
        Name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move decidetoMove(Board board){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row no you wanted to move: ");
        int row=sc.nextInt();

        System.out.println("Enter the col no you wanted to move: ");
        int col=sc.nextInt();

        Cell cell=new Cell(row, col);

//        if(row>board.getBoard().size() || row<1 || col>board.getBoard().size() || col<1 || cell.getCellState().equals(CellState.BLOCKED) || cell.getCellState().equals(CellState.OCCUPIED)){
//            System.out.println("Please enter another row and col which is available and correct!!");
//            decidetoMove(board);
//        }

        return new Move(this, cell);

    }


    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
