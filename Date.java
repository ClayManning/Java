
import java.util.Objects;

public class Date {
  private int day;
  private int month;
  private int year;

    public Date(int month,int day, int year) {
        this(day,month);
        this.day = day;
        this.month = month;
        
        
    }

    public Date(int day, int month) {
        this.year=2019;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void print(){
        System.out.printf("%d/%d/%d%n", month, day, year);
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Date other = (Date) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.day, other.day)) {
            return false;
        }
        if (!Objects.equals(this.month, other.month)) {
            return false;
        }
        return true;
    }
    
}

