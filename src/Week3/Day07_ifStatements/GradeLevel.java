package Week3.Day07_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 15;
        String result = "";

        if (gradeLevel <= 5) {
            result = "Elementary school";
        }else if (gradeLevel <=8){
            result = "Middle school";
        }else if (gradeLevel <=12){
            result = "High school";
        }else if (gradeLevel <=16){
            result = "College";
        }else {
            result = "Grad school";
        }

        System.out.println(result);



    }
}
/*
. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in. (Only if the given number is a valid number, then print the school type.
Otherwise print Invalid) Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are: 1 ~ 5: Elementary school
6 ~ 8: Middle school 9 ~ 12: High school 13 ~ 16: College
17 ~ 18: Grad School
 */