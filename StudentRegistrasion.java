/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentregistrasion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *

 */
public class StudentRegistrasion {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        java.util.HashSet<Integer> studentIDs = new java.util.HashSet<>();

      
        HashMap<Integer, String> students = new HashMap<>();

      
        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Student ID: ");
            int id = input.nextInt();

            
            if (studentIDs.add(id)) {

                System.out.print("Enter Student Name: ");
                input.nextLine();

                String name = input.nextLine();

                students.put(id, name);

                System.out.println("Student registered successfully!");

            } else {
                System.out.println("Duplicate ID! Entry rejected.");
            }

            System.out.println();
        }

    
        System.out.println("Total Unique Students: "
                + studentIDs.size());

       
        TreeMap<Integer, String> sortedStudents =
                new TreeMap<>(students);

        System.out.println("\nStudent Records (Ascending Order):");

        for (Map.Entry<Integer, String> entry :
                sortedStudents.entrySet()) {

            System.out.println("ID: " + entry.getKey()
                    + " | Name: " + entry.getValue());
        }

        input.close();
    }
}

