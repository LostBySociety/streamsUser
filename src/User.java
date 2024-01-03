import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class User {
    private long ID;
    private String password;
    private String name;
    private String role;

    public User(long ID, String password, String name, String role) throws IncorrectRoleException {
        this.ID = ID;
        this.password = password;
        this.name = name;
        setRole(role);
    }

    @Override
    public String toString() {
        return "{" +
                "ID=" + ID +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public long getID() {
        return ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) throws IncorrectRoleException {
        if (role.equals("ADMIN") || role.equals("USER") || role.equals("BANNED")){
            this.role = role;
        } else {
            throw new IncorrectRoleException("Указана некорректная роль");
        }
    }
}
