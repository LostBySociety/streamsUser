import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IncorrectRoleException{
        List<User> users = new ArrayList<>(Arrays.asList(
                new User(23456789, "wfqwehwqjkeqke", "Alina", Role.ADMIN),
                new User(12312312, "112", "1Test", Role.USER),
                new User(23432425, "wfqwehwqjkeqke", "13", Role.USER),
                new User(54546456, "1", "Alexandr", Role.USER),
                new User(67678688, "@@@@@@@@@@@@@@@@@@@", "Dmitriy", Role.ADMIN),
                new User(78789789, "wfqwehwqjkeqke", "@@@@@@@@@@@@@@@@@Test", Role.USER),
                new User(36546367, "wfqwehwqjkeqke", "Test@@@@@@@@@@@@@@", Role.ADMIN),
                new User(74587785, "1sadasd", "Test", Role.USER),
                new User(23454124, "bnjbnkfgbmlfbmg", "John", Role.ADMIN),
                new User(65758567, "test", "William", Role.USER)));
        Users usersUtility = new Users();
        usersUtility.saveUsers(users);
    }

}