import java.util.*;
import java.util.stream.Collectors;

public class Users {
    private Map<Long, User> idUserMap;
    private Map<Long, User> idAdminMap;
    public  void saveUsers(List<User> users){
        idUserMap = users.stream()
                .filter(user -> user.getName().matches("^[a-zA-Z].*$") && user.getPassword().matches(".{8,}"))
                .collect(Collectors.toMap(User::getID, v->v));
        //idUserMap.forEach((k,v) -> System.out.println(k + " " + v))
        Set<Map.Entry<Long,User>> entryUsers = idUserMap.entrySet();
        idAdminMap = entryUsers.stream()
                .filter(k -> Objects.equals(k.getValue().getRole(), "ADMIN"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        idAdminMap.forEach((k,v) -> System.out.println(k + " " + v));

    }

    public Map<Long, User> getIdUserMap() {
        return idUserMap;
    }
}
