package introOfJava;

class Student
{
    String name;
    int rollNo;
}

public class ArraysOfObjects {
    public static void main(String[] args)
    {
        Student students[]=new Student[2];
//        Cannot assign field "rollNo" because "students[0]" is null

//       students[0].rollNo=1;
//       students[1].rollNo=2;
//       students[0].name="Payal";
//       students[1].name="Dolly";

        Student s1 =new Student();
        Student s2=new Student();

        s1.rollNo=1;
        s1.name="Payal";
        s2.rollNo=2;
        s2.name="Dolly";

        students[0]=s1;
        students[1]=s2;
       for(Student s:students)
       {
           System.out.println(s.name + " " + s.rollNo);
       }
    }

}
