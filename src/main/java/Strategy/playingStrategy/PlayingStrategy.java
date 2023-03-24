package Strategy.playingStrategy;

import Model.Board;
import Model.Move;
import Model.Player;

public interface PlayingStrategy {
    public Move decidetoMove(Player player, Board board);
}
