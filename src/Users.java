import java.util.*;
import java.util.stream.Collectors;

public class Users {
    private static Map<Long, User> idUserMap;
    private static Map<Long, User> idAdminMap;
    public static void saveUsers(List<User> users) throws BannedRoleException {
        idUserMap = users.stream()
                .filter(user -> user.getName().matches("^[a-zA-Z].*$") && user.getPassword().matches(".{8,}"))
                .collect(Collectors.toMap(User::getID, v->v));
        //idUserMap.forEach((k,v) -> System.out.println(k + " " + v));

        Set<Map.Entry<Long,User>> entryUsers = idUserMap.entrySet();

        idAdminMap = entryUsers.stream()
               /* .peek(item -> {
                            try  {
                                if (item.getValue().getRole().equals(Role.BANNED)){
                                    throw new BannedRoleException("Пользователь заблокирован");
                                }
                            }
                            catch (BannedRoleException e){
                                idUserMap.remove(item.getKey());
                            }
                        }
                )*/ // оставила, чтобы ты мог полюбоваться на мои многочасовые страдания
                .filter(k -> k.getValue().getRole().equals(Role.ADMIN))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        while(!idUserMap.values().stream().allMatch(v -> v.getRole().equals(Role.USER))) {
            Optional<User> userBanned = idUserMap.values().stream().filter((User v) -> v.getRole().equals(Role.BANNED)).findFirst();
            Optional<User> userAdmin = idUserMap.values().stream().filter((User v) -> v.getRole().equals(Role.ADMIN)).findFirst();
            userAdmin.ifPresent(user -> idUserMap.values().remove(user));
            if(userBanned.isPresent()) {
                try {
                    throw new BannedRoleException("Заблокированный пользователь");
                } catch (BannedRoleException e) {
                        System.out.printf("Заблокированный пользователь %s удален \n", userBanned.get().getName()); // как получить заблокированного пользователя, чтобы вывести его логин?
                        idUserMap.values().remove(userBanned.get());
                }
            }
        }
        //idAdminMap.forEach((k,v) -> System.out.println(k + " " + v));
       idUserMap.forEach((k,v) -> System.out.println(k + " " + v));
    }


    public Map<Long, User> getIdUserMap() {
        return idUserMap;
    }
}

