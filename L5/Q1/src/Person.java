public class Person {
    public String Username;

    public Person() {

    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String Name;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String Password;
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public int Age;
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String Address;
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String PhoneNumber;
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public String Degree;
    public String getDegree() {
        return Degree;
    }
    public void setDegree(String degree) {
        Degree = degree;
    }
    public Person(String Username , String Name , String PassWord , int Age , String Address , String PhoneNumber , String Degree ){
        this.Username = Username;
        this.Name = Name;
        this.Password = PassWord;
        this.Age = Age;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Degree = Degree;
    }
}
