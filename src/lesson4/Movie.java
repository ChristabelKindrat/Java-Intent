package lesson4;

import java.time.Year;

public class Movie {

    public final String title;
    private int year;

    Movie(String title, int year) {
        this.title = title;
        setYear(year);
    }

    public void setYear(int year) {
        validYear(year);
        this.year = year;
        System.out.println("Successfully saved!");
    }

    private int validYear (int year){
           if (year < 1900) {
               throw new InvalidYearException("Please write year since 1900. Your year:" + year);
           }
           if (year > Year.now().getValue()) {
               throw new InvalidYearException("Please write a year smaller than the current one.Your year: " + year);
           }
           return year;
    }

}
