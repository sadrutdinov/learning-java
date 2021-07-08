//package pro.chapter23;
//
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import start.cource.Person;
//
//import java.io.*;
//
//public class JsonSerialization {
//    public static void main(String[] args) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//
////        String s = objectMapper.writeValueAsString(new Person("aydar", "sadr", 12));
////        System.out.println(s);
////
////        FileOutputStream fout = new FileOutputStream("person.json");
////
////        objectMapper.writeValue(fout, new Person("aydar", "sadr", 12));
//
//
//        Person person = objectMapper.readValue(new File("person.json"), Person.class);
//
//        System.out.println(person);
//
//
//    }
//}
