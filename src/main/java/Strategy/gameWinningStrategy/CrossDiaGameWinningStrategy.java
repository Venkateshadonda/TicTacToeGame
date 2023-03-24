package Strategy.gameWinningStrategy;


import Model.Board;
import Model.Cell;
import Model.CellState;
import Model.Player;

public class CrossDiaGameWinningStrategy implements GameWinningStrategy {

    public boolean checkWinner(Board board, Player player, Cell cell) {
        int size=board.getBoard().size();
        char symbol=board.getBoard().get(0).get(size-1).getPlayer().getSymbol();
        for(int i=1;i<board.getBoard().size();i++){
            if(board.getBoard().get(i).get(size-i-1).equals(CellState.OCCUPIED)){
                if(symbol!=board.getBoard().get(i).get(i).getPlayer().getSymbol())
                    return false;
            }
        }
        return true;
    }
}
