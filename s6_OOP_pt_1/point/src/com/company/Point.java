package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt(
                (((double) x - (double) this.x) * ((double) x - (double) this.x))
                + (((double) y - (double) this.y) * ((double) y - (double) this.y))
        );
    }

    public double distance(Point point) {
        return distance(point.x, point.y);
    }
}
