package Factory;

import Model.Board;
import Model.WinningStrategy;
import Strategy.gameWinningStrategy.*;

public class GameWinningStrategyFactory {
    public static GameWinningStrategy getGameWinningStrategy(WinningStrategy winningStrategy,int size){
        if(winningStrategy.equals(WinningStrategy.COL))
            return new ColGameWinningStrategy();
        else if(winningStrategy.equals(WinningStrategy.ROW))
            return new RowGameWinningStrategy(size);
        else if(winningStrategy.equals(WinningStrategy.DIAGONAL))
            return new DiagonalGameWinningStrategy();
        else if(winningStrategy.equals(WinningStrategy.CROSSDIAG))
            return new CrossDiaGameWinningStrategy();
        return null;
    }
}
