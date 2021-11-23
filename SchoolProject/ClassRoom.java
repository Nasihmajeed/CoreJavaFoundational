public class ClassRoom  {
	Teacher[] teacher = new Teacher[3];
	String name;
	int seats;
	
	public void inputDetails() {
			this.name = "CLASSROOM";
			this.seats = 35;
		/*for (int i = 0; i < teacher.length; i++) {
				this.teacher[i].inputDetails();
			}*/
			
	}
	public void printDetails() {
	 	int[] x= {1,2,3} ;
		if (x[0]==1) {
			
			System.out.println(name + x + "\n");
		}
		else if (x[1]==2) {
		
		System.out.println(name + x + "\n");
		}
		else if (x[2]==3) {
		System.out.println(name + x + "\n");
		}	
		System.out.println("NUMBER OF SEATS : " + seats + "\n");
		/*for (int i = 0; i < teacher.length; i++) {
				this.teacher[i].printDetails();
			}*/
		}
	