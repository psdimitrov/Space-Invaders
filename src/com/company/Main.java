package com.company;

import com.company.game.Game;
import com.company.helperClasses.RandomGenerator;
import com.company.screeStates.MainMenuState;
import com.company.screeStates.State;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        game.start();
    }
}
