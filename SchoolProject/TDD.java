public class TDD{
       public static void main(String[] ar){
              System.out.println("Welcome To M.H.S school");
              School S = new School();
              S.Name = "Moulana Heigh School palakkad";
              S.Address = "malampuzha(p.o) palakkad  678001";
              S.PhNo = "9876501234";
              S.printDetails();
              Student s1 = new Student();
              s1.Name = "Gokul";
              s1.Regno = "sslc0001";
              s1.Address = "kuzhivetil house";
              s1.Batch = "A";
              s1.Class = "10";
              s1.printDetails();
       }         
       
}
