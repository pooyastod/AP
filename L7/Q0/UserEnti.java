public class UserEnti implements AutoCloseable {
    private String UserName;
    private String Pass;
    private String Name;
    private String Email;
    public String getUserName() {
        return UserName;
    }
    public UserEnti setUserName(String UserName) {
        this.UserName = UserName;
        return this;
    }
    public String getPass() {
        return Pass;
    }
    public UserEnti setPass(String Pass) {
        this.Pass = Pass;
        return this;
    }
    public String getName() {
        return Name;
    }
    public UserEnti setName(String Name) {
        this.Name = Name;
        return this;
    }
    public String getEmail() {
        return Email;
    }
    public UserEnti setEmail(String Email) {
        this.Email = Email;
        return this;
    }
    @Override
    public void close() throws Exception {}
}
