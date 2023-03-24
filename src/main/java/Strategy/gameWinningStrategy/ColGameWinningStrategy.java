package Strategy.gameWinningStrategy;

import Model.Board;
import Model.Cell;
import Model.CellState;
import Model.Player;

public class ColGameWinningStrategy implements GameWinningStrategy{

    public boolean checkWinner(Board board, Player player, Cell cell) {
        for(int j=0;j<board.getBoard().size();j++){
            char symbol=board.getBoard().get(0).get(j).getPlayer().getSymbol();
            for(int i=0;i<board.getBoard().size();i++){
                if(board.getBoard().get(i).get(j).equals(CellState.OCCUPIED)){
                    if(symbol!=board.getBoard().get(i).get(j).getPlayer().getSymbol())
                        return false;
                }
            }
        }
        return true;
    }
}
