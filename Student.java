//sai
package java2Json;
//import com.google.gson.Gson;

class Student {
    private int id;
    private String name;


    private int age;
    private long phone;
    private long mobilenumber;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }


    public long getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
}