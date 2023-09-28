package week3.ex3;

public class CustomDate {
    private int day, month, year;

    CustomDate(int d, int m, int y) {
        if (d > 31 ||
                m > 12 ||
                (m != 4 && m != 5 && m != 9 && m != 11) && d == 31 ||
                m == 2 && (y % 4 != 0 && d > 28 || y % 4 == 0 && d > 29)) {
            System.out.println("The date doesn't exists");
        } else {
            this.day = d;
            this.month = m;
            this.year = y;
        }
    }

    int getDay() {
        return this.day;
    }

    void setDay(int in) {
        this.day = in;
    }

    int getMonth() {
        return this.month;
    }

    void setMonth(int in) {
        this.month = in;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int in) {
        this.year = in;
    }

    void displayDate() {
        System.out.printf("%d/%d/%d\n", this.day, this.month, this.year);
    }

    void displayFormatted() {
        String monthName = "";

        switch (this.month) {
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "Mar";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "Jul";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
        }

        System.out.printf("%d %s %d\n", this.day, monthName, this.year);
    }

    int difference(CustomDate date) {
        return date.getDay() - this.day + (date.getMonth() - this.month) * 30 + (date.getYear() - this.year) * 365;
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        int diff = date1.difference(date2);
        if (diff == 0)
            return 0;
        if (diff > 0)
            return 1;
        else
            return -1;
    }
}
