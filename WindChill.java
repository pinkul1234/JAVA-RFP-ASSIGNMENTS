public class WindChill {
    public static void main(String arg[]) {
        double t = Double.parseDouble(arg[0]);
        double v = Double.parseDouble(arg[1]);
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }

}