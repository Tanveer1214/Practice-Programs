package com.jdbc;

import java.util.Scanner;

public class JDBC_Learning {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        boolean con = true;
        while(con) {
            System.out.println("Enter 1 for Add a teacher");
            System.out.println("Enter 2 for Delete a teacher");
            System.out.println("Enter 3 for Display teacher");
            System.out.println("Enter 4 for Update teacher");
            System.out.println("Enter 5 for Exit");
            int choice = sc.nextInt();

            if(choice == 1) {
                // add
                System.out.println("Enter Teacher Id");
                int id = sc.nextInt();
                System.out.println("Enter Teacher Name");
                String name = sc.next();
                System.out.println("Enter Teacher's City Name");
                String city  = sc.next();
                Teachers teachers = new Teachers(id,name,city);
                TeacherDao.insertTeacher(teachers);
                break;
            }
            else if(choice == 2) {
                // Delete
                System.out.println("Enter Teacher Id");
                int id = sc.nextInt();
                TeacherDao.deleteTeacher(id);
                break;
            }
            else if(choice == 3) {
                // Display
                TeacherDao.displayRecords();
                break;
            }
            else if(choice == 4) {
                // Update
                System.out.println("Enter Teacher's Id");
                int id = sc.nextInt();
                System.out.println("Enter Teacher's Name");
                String name = sc.next();
                System.out.println("Enter Teacher's City Name");
                String city = sc.next();
                Teachers teachers = new Teachers(id,city,name);
                String msg = TeacherDao.updateTeacher(teachers);
                System.out.println(msg);
                break;
            }
            else if(choice == 5) {
                // Exit
                break;
            }
            else {
                System.out.println("Invalid Choice..!");
            }

        }

    }

}
