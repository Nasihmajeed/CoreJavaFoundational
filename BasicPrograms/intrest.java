public class intrest {

	public static void main(String[] args) {

 double p = 1000000,R = 12.5,n = 10,siA = 0,ciA = 0,ciQ = 0,siQA = 0,siQ = 0,ciQA = 0;

  double r = R / 100;

  double si = (p * n * R) / 100.0;

  double ci = p * (Math.pow(1 + R / 100, n) - 1);

  ciQ = p *Math.pow((1 + (r / 4) / 100), 4 * n);

  siQ = si / 4;

  System.out.println("Simple intrest  is :" +si);

  System.out.println("Compount intrest is : " +ci);

  siA = p + si;

  ciA = p + ci;

  ciQA = p + ciQ;

  siQA = p + siQ;

  System.out.println("Amount in Simple intrest :" +siA);

  System.out.println("Simple intrest for quaterly is :" +siQ);

  System.out.println("Amount in Simple intrest for quaterly: " +siQA);

  System.out.println("Amount in compount intrest : " +ciA);

  System.out.println ("Compount intrest of $p for quaterly is : " +ciQ);

  System.out.println("Amount in compount intrest for quaterly: " +ciQA);

       }
}