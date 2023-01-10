public class Teacher {
    public static void main(String[] args){
     Teachers teacher = new Teachers();
       
     teacher.teacherId = 10;
     teacher.Name = "pam";
     teacher.subject = "maths";

    }
}
 class Teachers{

    int teacherId;
    String Name;
    String subject;

    public void printDetails(){
     
        System.out.println("teacher ID: " + teacherId + " teacher name: " + Name+ " subject: "+ subject);
    }
}