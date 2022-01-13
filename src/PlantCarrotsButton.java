//////////////// FILE HEADER ///////////////////////////////////////////////////
//
// Title:    Add Rabbit Button
// Course:   CS 300 Spring 2021
//
// Author:   Rago Senthilkumar
// Email:    rsenthilkuma@wisc.edu
//////////////// FILE HEADER ///////////////////////////////////////////////////
/**
 * This class creates a button for planting carrots.
 */
public class PlantCarrotsButton extends Button {
  /**
   * Places the button in the specific button.
   *
   * @param x x - position of button
   * @param y y - position of button
   */
  public PlantCarrotsButton(float x, float y) {
    super("Plant Carrots", x, y);
  }

  /**
   * This method places the carrots when the button is pressed.
   */
  @Override
  public void mousePressed() {
    if (isMouseOver()) {
      Carrots.plant();
    }
  }
}
