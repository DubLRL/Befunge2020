/*
 * Parser.java - Parser for the Befunge2020 language
 * Befunge2020 - Stack-based execution for the future.
 *
 * Copyright (c) 2020 John Nunley and Thomas Jeffery
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.notgull.befunge2020;

import java.util.Stack;

public class Parser {
  private Character[][] grid;
  private int x;
  private int y;
  private Direction direction;
  private Stack<Object> stack;

  public Parser(Character[][] grid) {
    this.grid = grid;
    this.x = 0;
    this.y = 0;
    this.direction = Direction.Right;
    this.stack = new Stack<>();
  }

  public Character[][] getGrid() {
    return grid;
  }

  public long getX() {
    return x;
  }

  public long getY() {
    return y;
  }

  // move in a certain direction
  private void moveDirection() {
    switch (this.direction) {
      case Up:
        this.y -= 1;
        break;
      case Down:
        this.y += 1;
        break;
      case Left:
        this.x -= 1;
        break;
      case Right:
        this.x += 1;
        break;
    }
  }

  public boolean readInstruction() throws Exception {
    if (y >= grid.length) {
      throw new Exception("Out of bounds");
    }

    if (x >= grid[y].length) {
      throw new Exception("Out of bounds");
    }

    // read at current x and y
    char instruction = grid[y][x];
    switch (instruction) {
      case '@':
        return false;
      case '>':
        this.direction = Direction.Right;
        break;
      case 'v':
        this.direction = Direction.Down;
        break;
      case '<':
        this.direction = Direction.Left;
        break;
      case '^':
        this.direction = Direction.Up;
        break;
      case ' ':
        break;
      case '0':
        stack.add(0);
        break;
      case '1':
        stack.add(1);
        break;
      case '2':
        stack.add(2);
        break;
      case '3':
        stack.add(3);
        break;
      case '4':
        stack.add(4);
        break;
      case '5':
        stack.add(5);
        break;
      case '6':
        stack.add(6);
        break;
      case '7':
        stack.add(7);
        break;
      case '8':
        stack.add(8);
        break;
      case '9':
        stack.add(9);
        break;
      default:
        throw new Exception("Invalid");
    }

    moveDirection();

    return true;
  }
}
