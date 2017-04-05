/*
* Solution
* Module 3, Task 3.1
* Lukin Ivan
 */

package HomeWork.module3.Task_3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        Date data = new Date();
        Course[] course = new Course[0];

        Course course_1 = new Course(data, "Ivan");
        Course course_2 = new Course(data,"Oleg");
        Course course_3 = new Course("Oleg",50);
        Course course_4 = new Course("Grisha",527);
        Course course_5 = new Course("Misha",100);

        Student student_1 = new Student("Ivan","Lukin",9);
        Student student_2 = new Student("Lukin",course);

        CollegeStudent collegeStudent_1 = new CollegeStudent("Ivan","Lukin",9,"GoIT",98,555432);
        CollegeStudent collegeStudent_2 = new CollegeStudent("Lukin",course);
        CollegeStudent collegeStudent_3 = new CollegeStudent("Ivan","Lukin",9);

        SpecialStudent specialStudent = new SpecialStudent("Ivan","Lukin",9,"GoIT",56,333846);
        SpecialStudent specialStudent1 = new SpecialStudent("Lukin",course);
        SpecialStudent specialStudent2 = new SpecialStudent("Ivan","Lukin",9,7856);
    }
}
