package week3.ex4;

public class CustomTime {
    private int hour, minute, second;

    CustomTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    CustomTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    CustomTime(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    CustomTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    CustomTime(CustomTime time) {
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }

    int getHour() {
        return this.hour;
    }

    int getMinute() {
        return this.minute;
    }

    int getSecond() {
        return this.second;
    }

    void setHour(int hour) {
        this.hour = hour;
    }

    void setMinute(int minute) {
        this.minute = minute;
    }

    void setSecond(int second){
        this.second = second;
    }

    String toUniversalString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    String toStandardString(){
        String period = (this.hour < 12) ? "AM" : "PM";
        int standardHours = (this.hour == 0 || this.hour == 12) ? 12 : this.hour % 12;
        return String.format("%d:%02d:%02d %s", standardHours, this.minute, this.second, period);
    }
}
