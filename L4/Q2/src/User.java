public class User <Name,Dateofbirth,Gender> implements Cloneable {
    public Name Name;
    public Dateofbirth Dateofbirth;
    public Gender Gender;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public Name getName() {
        return Name;
    }
    public void setName(Name name) {
        Name = name;
    }
    public Dateofbirth getDateofbirth(String s) {
        return Dateofbirth;
    }
    public void setDateofbirth(Dateofbirth dateofbirth) {
        Dateofbirth = dateofbirth;
    }
    public Gender getGender() {
        return Gender;
    }
    public void setGender(Gender gender) {
        Gender = gender;
    }
}
