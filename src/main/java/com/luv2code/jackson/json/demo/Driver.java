package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {

            // create object mapper
            ObjectMapper objectMapper = new ObjectMapper();

            // read json file and map it to java pojo   :data/sample-lite.json (file we will use)
            // source of data is our file and we want to populate student.class
            // reading data from file
            Student theStudent = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);

            // print out first name and last name for the student that we map to our pojo from json
            System.out.println("First Name: " + theStudent.getFirstName());
            System.out.println("Last Name: " + theStudent.getLastName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
