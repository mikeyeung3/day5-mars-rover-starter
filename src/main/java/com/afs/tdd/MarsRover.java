package com.afs.tdd;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void execute(String command) {
        switch (command) {
            case "M" -> move();
            case "L" -> turnLeft();
            case "R" -> turnRight();
            default -> throw new IllegalStateException("Unexpected value: " + command);
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
    }

    private void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
    }

    private void move() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
    }

}
