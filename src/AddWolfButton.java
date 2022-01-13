//////////////// FILE HEADER ///////////////////////////////////////////////////
//
// Title:    Add Rabbit Button
// Course:   CS 300 Spring 2021
//
// Author:   Rago Senthilkumar
// Email:    rsenthilkuma@wisc.edu
//////////////// FILE HEADER ///////////////////////////////////////////////////
/**
 * This class creates and adds the AddWolf button.
 *
 */
public class AddWolfButton extends Button{
  /**
   * Adds the Button in the specific location on the screen.
   *
   * @param x x-position of button
   * @param y y-position of button
   */
  public AddWolfButton(float x, float y) {
    super("Add Wolf", x, y);
  }


  /**
   * Implements the default behavior of this button when the mouse is pressed.
   */
  @Override
  public void mousePressed() {
    if (isMouseOver()) {
      Button.processing.objects.add(new Wolf());
    }

  }
}