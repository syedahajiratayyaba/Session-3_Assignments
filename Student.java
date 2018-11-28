package com.prac.go;

import java.util.Date;
import java.util.Scanner;

class Student {
    public String name, course;
    public int marks[] = new int[5];
    public int roll;
    public String adm_date;
    public static int student_count = 0;;

    public static void student_number()
    {
        System.out.println("Number of students admitted : " + student_count);
    }

    public int ret_roll() {
        return roll;
    }

    public void admission() {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        System.out.println("STUDENT  DETAILS\n");
        System.out.println("\nEnter name: ");
        name = sc.nextLine();
        System.out.println("\nEnter course name: ");
        course = sc.nextLine();
        adm_date = date.toString();
        System.out.println("Admission Date:" + adm_date);
        student_count++;
        roll = student_count;
        System.out.println("Roll: "+ roll);

    }

    void get_marks() {
        Scanner sc = new Scanner(System.in);
        boolean flag;
        for (int i = 0; i < 5;) {
            flag = true;
            do{
                if(!flag){
                    System.out.println("Wrong input.");
                }
                System.out.println("Enter marks in subject " + (i + 1) + ":");
                marks[i] = sc.nextInt();

                flag = false;
            }while((marks[i] > 100) || (marks[i] < 0) );

            i++;

        }


    }

    void marksheet() {
        int j;
        System.out.println("STUDENT DETAILS");
        System.out.println("NAME               : " + name);
        System.out.println("ROLL NUMBER        : " + roll);
        System.out.println("COURSE             : " + course);
        System.out.println("ADMISSION DATE     : " + adm_date);
        for (j = 0; j < 5; j++){
            System.out
                    .println("MARKS IN SUBJECT " + (j + 1) + " : " + marks[j]);
        }
    }

    String get_name() {
        return name;
    }

    String get_admission_date() {
        return adm_date;
    }
};