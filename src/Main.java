import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws BannedRoleException {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User(23456789, "wfqwehwqjkeqke", "Alina", Role.BANNED),
                new User(12312312, "112123123123", "Test", Role.BANNED),
                new User(23432425, "wfqwehwqjkeqke", "13", Role.USER),
                new User(54546456, "1", "Alexandr", Role.USER),
                new User(67678688, "@@@@@@@@@@@@@@@@@@@", "Dmitriy", Role.ADMIN),
                new User(78789789, "wfqwehwqjkeqke", "Test", Role.USER),
                new User(36546367, "wfqwehwqjkeqke", "Test@@@@@@@@@@@@@@", Role.ADMIN),
                new User(74587785, "1sadasd", "Test", Role.USER),
                new User(23454124, "bnjbnkfgbmlfbmg", "John", Role.ADMIN),
                new User(65758567, "test", "William", Role.USER)));
        Users.saveUsers(users);
        User user = new User(67678688, "1111111111111111111", "Dmitriy", Role.ADMIN);
        User user1 = new User(67678688, "74647568585", "Alexandr", Role.USER);
        User user2 = new User(67678688, "@@@@@@@@@@@@@@@@@@@", "Yuriy", Role.ADMIN);
        user2.changeUser(user, user2);

        List<? extends String> strings1 = new ArrayList<>(Arrays.asList("str1", "str2")); // из этого можно только брать
        List<? super String> strings2 = new ArrayList<>(Arrays.asList("str1", "str2")); // в этот можно только класть
    }


}