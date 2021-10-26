package ro.fasttrackit.curs7;

public class Clock {
    //STATE
    private int hour;
    private int minutes;

    public Clock(int hour, int minutes) {
        System.out.println("Construction clock");
        this.hour = hour % 24;
        this.minutes = minutes % 60;
    }

    //BEHAVIOUR
    public int getHour(){
        return hour;
    }

    public  int getMinutes(){
        return minutes;
    }

    public String getTime() {
        return hour + ":" + minutes;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }

}