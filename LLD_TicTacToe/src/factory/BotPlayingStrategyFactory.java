package factory;

import model.BotDifficultyLevel;
import strategy.botPlayingStrategy.BotPlayingStrategy;
import strategy.botPlayingStrategy.LinearBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        //TODO: depending on the difficulty level return the bot strategy
        return new LinearBotPlayingStrategy();
    }
}
