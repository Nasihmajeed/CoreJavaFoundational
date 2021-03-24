class School{
	int std;
	void SchoolDetails(){
		System.out.println("*********************************");
		System.out.println("SEVA SADAN CENTRAL SCHOOL");
		System.out.println("Athirkad , Pathiripala, PALAKKAD");
		System.out.println("*********************************");
	}
	public void SchoolStd(){
		System.out.print(std+"th STANDARD");
	}
	public void schoolTopper(Marks m[][], Student s[][]){
		String topperClass="";
		int i,j;
		float large;
		large=m[0][0].total;
		for (i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(m[i][j].total>large){
					large=m[i][j].total;
					topperClass=s[i][j].StudentName;
			}
		}
		}
		System.out.println("*********************************************");
		System.out.println("*********************************************");	
		System.out.println("TOPPER IN SCHOOL IS "+ topperClass);
		
	}
}