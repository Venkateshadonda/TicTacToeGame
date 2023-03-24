package Factory;

import Model.BotDifficultyLevel;
import Strategy.playingStrategy.EasyPlayingStrategy;
import Strategy.playingStrategy.HardPlayingStrategy;
import Strategy.playingStrategy.MediumPlayingStrategy;
import Strategy.playingStrategy.PlayingStrategy;

public class playingStrategyFactory {
    public static PlayingStrategy getStrategy(BotDifficultyLevel botDiffultyLevel) {
        if (botDiffultyLevel.equals(BotDifficultyLevel.EASY))
            return new EasyPlayingStrategy();
        else if (botDiffultyLevel.equals(BotDifficultyLevel.MEDIUM))
            return new MediumPlayingStrategy();
        else
            return new HardPlayingStrategy();
    }
}
