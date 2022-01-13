//////////////// FILE HEADER ///////////////////////////////////////////////////
//
// Title:    Add Rabbit Button
// Course:   CS 300 Spring 2021
//
// Author:   Rago Senthilkumar
// Email:    rsenthilkuma@wisc.edu
//////////////// FILE HEADER ///////////////////////////////////////////////////
/**
 * This interface represents the abstract data type which models any interactive visible reference
 * type which can be drawn and responds to the mouse actions in a processing graphic interface
 *
 * @author Mouna
 *
 */
public interface GUIListener {
  /**
   * Draws this interactive object to the display window
   */
  public void draw();

  /**
   * Called each time the mouse is Pressed
   */
  public void mousePressed();

  /**
   * called each time the mouse is Pressed
   */
  public void mouseReleased();

  /**
   * checks whether the mouse is over this GUI listener
   *
   * @return true if the mouse is over this interactive object, false otherwise
   */
  public boolean isMouseOver();

}