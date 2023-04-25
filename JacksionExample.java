package java2Json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksionExample {
    public static void main(String args[]) throws Exception {
        Student std = new Student();
        std.setId(001);
        std.setName("Krishna");
        std.setAge(30);
        std.setPhone(9848022338L);
        std.setMobilenumber(1234556789);

        System.out.println("Id" +std.getId());
        System.out.println("Id" +std.getName());
        System.out.println("MObile " + std.getMobilenumber());


        ObjectMapper mapper1= new ObjectMapper();
        String JsonStr = mapper1.writeValueAsString(std);

        System.out.println("JsonStr NEW "+JsonStr);
        System.out.println("................... \n Done\n");

        //Creating the ObjectMapper object
        ObjectMapper mapper = new ObjectMapper();
        //Converting the Object to JSONString
        String jsonString = mapper.writeValueAsString(std);
        System.out.println(jsonString);
    }
}