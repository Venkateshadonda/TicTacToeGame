package Strategy.playingStrategy;

import Model.*;

public class EasyPlayingStrategy implements PlayingStrategy {

    @Override
    public Move decidetoMove(Player player,Board board) {
        for(int i=0;i<board.getBoard().size();i++){
            for(int j=0;j<board.getBoard().size();j++){
                if(board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY))
                    return new Move(player, new Cell(i, j));
            }
        }
        return null;
    }
}
