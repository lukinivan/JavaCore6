/*
* SpecialStudent
* Module 3, Task 3.1
* Lukin Ivan
 */

package HomeWork.Module_3.Task_3;

class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group, collegeName, rating, id);
    }

    SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    SpecialStudent(String firstName, String lastName, int group, long secretKey) {
            super(firstName, lastName, group);
            this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
