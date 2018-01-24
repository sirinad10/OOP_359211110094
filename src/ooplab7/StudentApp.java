package ooplab7;

import java.util.Scanner;

public class StudentApp {
    public static  void  main (String[] args){
        //create object as Student
        //defaylt constructor
        Student s1= new Student();
        s1.setName("001");
        s1.setName("Boy Saiyai");
        s1.setAddress("109 M.2 T.Thamyai A.Thungsong");
        s1.setGender("Male");

        System.out.println(s1.getName());
        System.out.println(s1.getGender());

        System.out.println(s1.toString());

        Student s2 = new Student( id: "002", n:"Girl Saiyai", a:"11/11 T.Thamyai A.Thungsong ", g: "Female");
        System.out.println(s2.toString());

        s2.setName("Girl Shongkla");
        System.out.println(s2.toString());
        //user assign data to object
        Student s3 = new Student();
        s3 = inputData (s3);
        System.out.println(s3.toString());


    }

    private static Object inputData(Student s) {
        System.out.println("Please enter a Student info: ");
        System.out.println("Student ID: ");
        s.setId(Scanner.nextLine());
        System.out.println("Name");
        s.setName(Scanner.nextLine());
        System.out.println("Address");
        s.setAddress(Scanner.nextLine());
        System.out.println("Gender :");
        s.setGender(Scanner.nextLine());
        return s;
    }//inputData
}//class
