import java.util.Arrays;

class Student{
    int rollno;
    String name;
    int marks;
}


public class Array {
    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1};

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[1]);

        int nums2[] = new int[4];
        nums2[0] = 4;
        nums2[1] = 7;
        nums2[2] = 10;
        nums2[3] = 989;

        for(int i = 0 ; i < nums2.length; i++){
            System.out.println(nums2[i]);
        }
        // for each
        for (int n : nums){
            System.out.println(n);
        }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "lol";
        s1.marks = 88;
        System.out.println(s1.name + " : " + s1.marks);

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "lol2";
        s2.marks = 99;

        Student s3= new Student();
        s3.rollno = 3;
        s3.name = "lol3";
        s3.marks = 100;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i = 0; i < student.length; i++){
            System.out.println(student[i].name + " : " + student[i].marks);
        }
        // for each
        for (Student stud : student){
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}
