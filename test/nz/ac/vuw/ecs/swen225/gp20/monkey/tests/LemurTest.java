package nz.ac.vuw.ecs.swen225.gp20.monkey.tests;

import nz.ac.vuw.ecs.swen225.gp20.application.Main;
import nz.ac.vuw.ecs.swen225.gp20.commons.Direction;
import nz.ac.vuw.ecs.swen225.gp20.monkey.models.Lemur;
import nz.ac.vuw.ecs.swen225.gp20.monkey.models.MonkeyAI;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Testing suite for the Lemur model AI, which avoids treasures and tries to move through the exit lock.
 *
 * @author Matthew Hill 300507607
 */
public class LemurTest {

    private static MonkeyAI monkeyAI;
    private Main main;

    @BeforeAll
    static void beforeAll() {
        monkeyAI = new Lemur();
    }

    @BeforeEach
    void setUp() {
        main = new Main();
        main.setDebugMode(true);
    }

    @Test
    void exitLockTest() {
        for (int i = 0; i < 1_000_000; i++) {
            Direction direction = monkeyAI.selectMove(main.getMaze());
            main.movePlayer(direction);
        }
    }
}

