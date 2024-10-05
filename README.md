# Java Turtle Graphics: Hexagon Patterns

This project is another installment of the Java Turtle Graphics series, where Tom the Turtle is utilized to draw colorful hexagon patterns using a combination of movements and pen colors. The project is designed to showcase the turtle's ability to draw geometric shapes and change its appearance dynamically.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Setup](#setup)
- [Code Explanation](#code-explanation)
- [Future Enhancements](#future-enhancements)
- [License](#license)

## Overview

This Java program uses turtle graphics to draw multiple hexagon shapes in different sizes and colors on a 500x500 canvas. Tom the Turtle starts by drawing a large hexagon and then rotates to draw additional hexagons, changing the pen color and line width at various stages. The project demonstrates basic Java programming concepts, such as class instantiation, method calls, and the use of loops.

## Features

- Draws multiple hexagon patterns with varying colors and sizes.
- Demonstrates the use of a turtle object to create geometric shapes.
- Utilizes method chaining and pen properties to control the turtle's behavior and drawing.
- Provides a visual representation of loops and object manipulation in Java.

## Setup

To run this project, you need to have Java installed on your system. Follow these steps:

1. Clone the repository to your local machine.
2. Compile the Java files:
   ```bash
   javac src/Main.java
   ```
3. Run the program:
   ```bash
   java src.Main
   ```

The program will open a 500x500 window where Tom the Turtle will draw a sequence of colorful hexagons.

## Code Explanation

Here's a breakdown of the main parts of the code:

- **`World w = new World(500, 500);`**: Initializes a new 500x500 pixel canvas for the turtle to draw on.
- **`Turtle tom = new Turtle(w);`**: Creates a new turtle object named Tom.
- **`tom.hexagon(100);`**: Draws a hexagon with side length 100 pixels.
- **`tom.setPenColor(Color.CYAN);`**: Sets the pen color to cyan.
- **`tom.turnLeft();`**: Rotates the turtle 90 degrees to the left.
- **`tom.setPenWidth(10);`**: Sets the pen width to 10 pixels for thicker lines.

The program repeatedly draws hexagons, rotating Tom at different angles and changing the colors between cyan, blue, black, red, and yellow to create a visually appealing pattern.

## Future Enhancements

Potential future enhancements for this project include:

- Adding user input to control the number of hexagons, colors, and size dynamically.
- Implementing animation to show the turtle's movement in real-time.
- Allowing the turtle to draw different geometric shapes (e.g., triangles, squares) based on user input.

## License

This project is open-source and available under the [MIT License](LICENSE).

## Author

Jai Vang

## Acknowledgements

The original Turtle and World classes were inspired by the work of Georgia Institute of Technology and are used for educational purposes.
# Turtle_Hexagon_Patterns
