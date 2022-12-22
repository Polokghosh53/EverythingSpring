package com.polokspring.learnspringframework;

import com.polokspring.learnspringframework.game.GameRunner;
import com.polokspring.learnspringframework.game.MarioGame;
import com.polokspring.learnspringframework.game.PacmanGame;
import com.polokspring.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
