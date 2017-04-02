/*
* Course
* Module 3, Task 3.1
* Lukin Ivan
 */

package HomeWork.Module_3.Task_3;

import java.util.Date;

class Course {
    private Date startDate;
    private String name;
    private String teacherName;
    private int hoursDuration;

    Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    Course(String teacherName, int hoursDuration) {
        this.teacherName = teacherName;
        this.hoursDuration = hoursDuration;
    }

    void intr() {
        Date date = new Date(1000);

    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }
}
