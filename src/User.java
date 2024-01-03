public class User {
    private long ID;
    private String password;
    private String name;
    private Role role;


    public User(long ID, String password, String name, Role role) throws BannedRoleException {
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
    public void  changeUser (User whoChanged, User change){
        if (!this.getRole().equals(Role.ADMIN)){
            System.out.printf("Пользователь %s не является администратором. Изменения не применены \n", this.getName());
        }else if (whoChanged.role.equals(Role.ADMIN)) {
            System.out.printf("Пользователь %s является администратором. Недостаточно прав \n", whoChanged.getName());
        }else {
            whoChanged.name = change.name;
            whoChanged.password = change.password;
            whoChanged.role = change.role;
        }
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
