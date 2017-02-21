package HW3.HW33;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Date DateC=new Date();

        Course Course1=new Course(DateC,"CourseOne");
        Course Course2=new Course(DateC,"CourseTwo");
        Course Course3=new Course(DateC,"CourseThree");
        Course Course4=new Course(DateC,"CourseFour");
        Course Course5=new Course(DateC,"CourseFive");
        Course[] courseTaken =new Course[5];
        courseTaken[0]=Course1;
        courseTaken[1]=Course2;
        courseTaken[2]=Course3;
        courseTaken[3]=Course4;
        courseTaken[4]=Course5;

        CollegeStudent collegePetrov=new CollegeStudent("Andriy","Petrov",3);
        collegePetrov.setAge(19);
        collegePetrov.setId(23);
        collegePetrov.setRating(5);

        CollegeStudent Ivanov=new CollegeStudent(Course1.getName(),5,13);
        Ivanov.setCollegeName("GoIT");
        String collegenameIvanov=Ivanov.getCollegeName();
        Ivanov.setRating(5);
        int ratingIvanov=Ivanov.getRating();
        Ivanov.setId(1544);
        long idIvanov=Ivanov.getId();

        CollegeStudent Antonov=new CollegeStudent("Antonov",courseTaken);
        Antonov.setCollegeName("GoIT");
        Antonov.setAge(19);
        Antonov.setCoursesTaken(courseTaken);
        Antonov.setLastName("Antonov");
        Antonov.setGroup(2);
        Antonov.setId(555);
        Antonov.setRating(3);
        Antonov.setFirstName("Anton");
        long idAntonov=Antonov.getId();


        SpecialStudent Spec=new SpecialStudent(548455,"IvanIvanov@gmail.com");
        String email=Spec.getEmail();
        long secretKey=Spec.getSecretKey();

        SpecialStudent specStudent=new SpecialStudent(5522554,"spec@goit.com");
        specStudent.setRating(15);
        int ratingSpec=specStudent.getRating();
        String emailSpec=specStudent.getEmail();

        SpecialStudent superStudent=new SpecialStudent("Einstein",Course1.getName());
        superStudent.setId(100);
        String lastName=superStudent.getLastName();
        Course course[]=superStudent.getCoursesTaken();

        Student Petrov=new Student("Stepan","Petrov",2);
        Petrov.setCoursesTaken(courseTaken);
        Petrov.setAge(18);
        Petrov.setFirstName("Stepan");
        Petrov.setGroup(2);
        Petrov.setLastName("Petrov");
        int studentAge=Petrov.getAge();
        Course[] coursesTaken = Petrov.getCoursesTaken();
        String studentName=Petrov.getFirstName();
        String studentLastname=Petrov.getLastName();
        int studentGroup=Petrov.getGroup();

        Student Good=new Student("Good",courseTaken);
        Good.setAge(19);
        String lastNameStudent=Good.getLastName();
    }
}
