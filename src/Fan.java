public class Fan {
    final int SLOW = 1;
    final int MEDIA = 2;
    final int FAST = 3;

    int speed  = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    int getSpeed(){
        return this.speed;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }

    boolean getOn(){
        return this.on;
    }
    void setOn(boolean on){
        this.on = on;
    }

    double getRadius(){
        return this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }

    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return speed + " " + color + " " + radius + " " + "fan is on";
        } else{
            return color + " " + radius + " fan is off";
        }
    }

}
