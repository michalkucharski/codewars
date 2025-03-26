import java.lang.Math;
public class Elevator {
    public static String call(int left, int right, int call){
        // Code on!
        return (Math.abs(call - left) < Math.abs(call - right)) ? "left" : "right";
    }
}