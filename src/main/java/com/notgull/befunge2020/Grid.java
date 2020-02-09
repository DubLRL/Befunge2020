package com.notgull.befunge2020;

public class Grid {
    protected int x, x1;
    protected int y, y1;
    protected String[][] grid;
    public Grid(String fileName, int x, int y){
        //get size of the array fileName and pass into grid
        
        grid = new String[x1][y1];
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
}
