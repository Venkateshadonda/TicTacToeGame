package Strategy.gameWinningStrategy;

import Model.Board;
import Model.Cell;
import Model.Player;

public interface GameWinningStrategy {
    public boolean checkWinner(Board board, Player player, Cell cell);
}
