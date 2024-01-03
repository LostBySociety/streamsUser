import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class User {
    private long ID;
    private String password;
    private String name;
    private Role role;


    public User(long ID, String password, String name, Role role) throws IncorrectRoleException {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" +
                "ID=" + ID +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
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

    public Role getRole() {
        return role;
    }
}
