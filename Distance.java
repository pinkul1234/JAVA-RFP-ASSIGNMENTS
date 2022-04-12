public class Distance {
    public static void main(String arg[]) {
        int x = Integer.parseInt(arg[0]);
        int y = Integer.parseInt(arg[1]);

        double distance = Math.sqrt(x*x + y*y);
 
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
    }   
}