package lesson4;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        //Block 1  Annotation
        ImmutablePerson person = new ImmutablePerson("Leyla", 23);
        person.getName();
        person.getAge();

        //Block 2 Annotation & Exception
        User firstUser = new User("Karina","Karina123","karina123@gmail.com"); //Your user successfully created!
        User secondUser = new User("Illya","Illya321","illya123gmail.com"); //Your email is invalid.
        try {
            User thirdUser = new User("Illya","Illya321","illya123gmail.com"); //Your email is invalid. Please, write correct email.
        }catch (InvalidEmailException e){
            e.getDetails();
        } //Please, write correct email. Your email: illya123gmail.com

        //Block 3 Exception
        Movie firstMovie = new Movie("Mavka", 2023); //Successfully saved!
        Movie secondMovie = new Movie("Hobbit", 1899); //Please write year since 1900. Your year:1899
        firstMovie.setYear(2030); //Please write a year smaller than the current one.Your year: 2030
    }
}
