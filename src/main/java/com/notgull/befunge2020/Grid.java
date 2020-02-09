package com.notgull.befunge2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Grid {
    protected int x, x1;
    protected int y, y1;
    protected char[][] grid;
    public Grid(String fileName, int x, int y){
        //get size of the array fileName and pass into grid
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) break;

                for (int i = 0; i < line.length(); i++) {
                    x1 += 1;
                }
                y1 += 1;
            }
        } catch (IOException ex) {
            System.err.println("An error occurred with the file you passed in.");
        }
        grid = new char[x1/y1][y1];
        this.x = x;
        this.y = y;
    }
    protected void setX(int x){
        this.x = x;
    }
    protected void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public String toString(){
        String g = "";
        for (int x = 0; x < grid.length; x++){
            for (int y = 0; y < grid[x].length; y++){
                g += grid[x][y];
            }
            g += "\n";
        }
        return g;
    }
}
