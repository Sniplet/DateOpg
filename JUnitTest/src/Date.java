public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) //constructor
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() // today
    {
        Date d = new Date(2022, 2,16);
    }

    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    public void addDays(int daysToAdd)   // advances by days
    {
        int days = getDay() + daysToAdd;

        if (days > daysInMonth(this.month))
        {
            this.month++;
        }
    }

    public int daysInMonth(int month) {
        if (month <= 12 && month > 0)
        {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
            }

            if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
            }

            if (month == 2 && this.year % 4 == 0) {
            return 29;

            } else {
            return 28;
            }
        }
        return month;
    }
/*
    public String dayOfWeek()       // e.g. "Sunday"
    {
        return
    }

    public boolean equals(Object o)
    public boolean isLeapYear()
    public void nextDay()           // advances by 1 day
    {

    }

    public String toString()
*/
}
