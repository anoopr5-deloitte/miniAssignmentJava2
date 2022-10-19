public class Time {

    public int hours;
    public int minutes;
    public int seconds;

    // This parameterized constructor is used to set values of the variables
    public  Time ()
    {
        hours=15;
        minutes=30;
        seconds=45;
    }
    public Time(int hour , int minute, int second)
    {
        this();
        if (second > 0 && second < 60) {
            this.seconds = second;
        }
        if (minute < 60 && minute >0) {
            this.minutes = minute;
        }
        if (hour < 24 && hour>0) {
            this.hours = hour;
        }

        put_time();

    }


    void put_time() {
        System.out.println("The current time is \t" + hours + ":" + minutes
                + ":" + seconds);
    }


    public static void main(String[] args) {

        Time t1 = new Time(100, 20, 0);
    }

}