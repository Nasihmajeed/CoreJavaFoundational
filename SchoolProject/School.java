package com.School;

public class School  {
		String name;
		String address;
		String phoneNo;
		ClassRoom c[] = new ClassRoom[3];
		public void inputDetails() {
			this.name = "LXI SCHOOL";
			this.address = "GANDHI SEVA BHAVAN,PATHIRIPALA,PALAKKAD,678507";
			this.phoneNo = "9562001100";
			for (int i = 0; i < c.length; i++) {
				this.c[i].inputDetails();
			}
			
		}
		public void printDetails() {
			System.out.println(name + "\n" + address + "\n" + phoneNo + "\n");
			for (int i = 0; i < c.length; i++) {
				this.c[i].printDetails();
			}
		}
		}







