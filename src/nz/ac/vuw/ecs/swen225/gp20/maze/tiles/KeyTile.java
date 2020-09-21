package nz.ac.vuw.ecs.swen225.gp20.maze.tiles;

import nz.ac.vuw.ecs.swen225.gp20.maze.Maze;
import nz.ac.vuw.ecs.swen225.gp20.maze.tiles.AccessibleTile;

public class KeyTile extends AccessibleTile {
  private Maze.Colours keyColour;

  @Override
  public boolean isItem() {
    return true;
  }
}
