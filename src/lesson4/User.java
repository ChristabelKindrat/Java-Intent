package lesson4;
import java.util.regex.*;

public class User {
    public String name;
    @ValidEmail
    private String email;
    private String password;

    User(String name, String password, String email) throws NoSuchFieldException {
        this.name = name;
        this.email = email;
        this.password = password;
        validateEmail(email);
    }

    private void validateEmail( String email) throws NoSuchFieldException {
        ValidEmail annotation = User.class.getDeclaredField("email").getAnnotation(ValidEmail.class);
        Pattern pattern = annotation.pattern;
        Matcher matcher = pattern.matcher(email);

           if (!matcher.matches()) {
               throw new InvalidEmailException("Your email is not valid.", email);
           }
        System.out.println("Your user successfully created!");
    }
}
