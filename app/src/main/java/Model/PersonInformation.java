package Model;

public class PersonInformation {
    String Name, Age, Gender, PhoneNum;

    public PersonInformation() {

    }

    public PersonInformation(String name, String age, String gender, String phoneNum) {
        Name = name;
        Age = age;
        Gender = gender;
        PhoneNum = phoneNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }
}


