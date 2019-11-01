public class Student
{
	String name;
	int regNo,physics,chemistry,maths;
	
void totalMark (int i,int j,int k)
  {
	int totalMark;
	float percentage;
	totalMark = (i+j+k);
	System.out.println("Total Mark  : "+totalMark);
	percentage = (totalMark*100/300f);
	System.out.println(percentage+" %");
  }
}