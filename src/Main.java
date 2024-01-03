import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IncorrectRoleException{
        List<User> users = new ArrayList<>(Arrays.asList(
                new User(23456789, "wfqwehwqjkeqke", "Alina", "USER"),
                new User(12312312, "112", "1Test", "ADMIN"),
                new User(23432425, "wfqwehwqjkeqke", "13", "USER"),
                new User(54546456, "1", "Alexandr", "USER"),
                new User(67678688, "@@@@@@@@@@@@@@@@@@@", "Dmitriy", "ADMIN"),
                new User(78789789, "wfqwehwqjkeqke", "@@@@@@@@@@@@@@@@@Test", "USER"),
                new User(36546367, "wfqwehwqjkeqke", "Test@@@@@@@@@@@@@@", "ADMIN"),
                new User(74587785, "1sadasd", "Test", "USER"),
                new User(23454124, "bnjbnkfgbmlfbmg", "John", "ADMIN"),
                new User(65758567, "test", "William", "USER")));
        Users usersUtility = new Users();
        usersUtility.saveUsers(users);
    }

}