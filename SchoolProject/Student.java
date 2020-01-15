public class Student
{
	String name;
	int regNo,physics,chemistry,maths,totalMark;
	float percentage;
	
void setTotal (int i,int j,int k)
  {
	totalMark = (i+j+k);
	percentage = (totalMark*100/300f);
  }
  void getTotal()
  {
  System.out.println("Total Mark  : "+totalMark);
  System.out.println("Percentage  : "+percentage+" %");
  }
}