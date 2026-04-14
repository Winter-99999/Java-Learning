public class User {
    private String name;
    private String password;
    private String idcard;
    private String phone;

    public User() {
    }

    public User(String name, String password, String idcard, String phone) {
        this.name = name;
        this.password = password;
        this.idcard = idcard;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
