package model.bean;

public class User_role {
    private Role role_id;
    private User userName;

    public User_role() {
    }

    public User_role(Role role_id, User userName) {
        this.role_id = role_id;
        this.userName = userName;
    }

    public Role getRole_id() {
        return role_id;
    }

    public void setRole_id(Role role_id) {
        this.role_id = role_id;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }
}
