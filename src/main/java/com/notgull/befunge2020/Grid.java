package com.notgull.befunge2020;

public class Grid {
    protected long x;
    protected long y;
    public Grid(String fileName, int x, int y){

        this.x = x;
        this.y = y;
    }
    protected void resetX(long x){
        this.x = x;
    }
    protected void resetY(long y){
        this.y = y;
    }
    public long getX(){
        return this.x;
    }
    public long getY(){
        return this.y;
    }
}
