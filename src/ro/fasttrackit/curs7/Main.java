package ro.fasttrackit.curs7;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(3,2 );
        Clock ceasuLuGeorgiana = new Clock(22, 2);


        System.out.println(clock.getTime());
        System.out.println(ceasuLuGeorgiana.getTime());


//        System.out.println(clock.hour);
//        clock.hour = 69
//        System.out.println(clock.getTime());
    }
}


