package Model;

import Factory.playingStrategyFactory;
import Strategy.playingStrategy.PlayingStrategy;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;
    PlayingStrategy botPlayingStrategy;

    public Bot(String name, char symbol,  BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        botPlayingStrategy= playingStrategyFactory.getStrategy(botDifficultyLevel);
    }

    @Override
    public Move decidetoMove(Board board) {
        return botPlayingStrategy.decidetoMove(this, board);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public PlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(PlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }
}
