package com.polokspring.learnspringframework;

import com.polokspring.learnspringframework.game.GameRunner;
import com.polokspring.learnspringframework.game.MarioGame;
import com.polokspring.learnspringframework.game.PacmanGame;
import com.polokspring.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); // 1: Object Creation
		var gameRunner = new GameRunner(game); 
			// 2: Object Creation + Wiring of Dependencies
			// Game is a dependency of GameRunner
		gameRunner.run();

	}

}
