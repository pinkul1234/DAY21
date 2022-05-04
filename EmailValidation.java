import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
        public static void main(String[] args) {
            ArrayList<String> emails = new ArrayList();
			//Valid Emails
            emails.add("user@domain.com");
            emails.add("user@domain.co.in");
            emails.add("user1@domain.com");
            emails.add("user.name@domain.com");
            emails.add("user_name@domain.co.in");
            emails.add("user-name@domain.co.in");
            emails.add("user@domaincom");

            //Invalid emails
            emails.add("@yahoo.com");

            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

            Pattern pt = Pattern.compile(regex);
            Matcher mt = pt.matcher(emails);

            boolean email_result =mt.matches();
            System.out.print("Email-id :- "+email_result);
        }
    }

