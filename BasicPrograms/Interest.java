public class Interest {

	public static void main(String[] args) {
		double p = 1000000, r = 0.125, n = 4, t = 10;
		  double simpleInterest = p * r * t;
		  double cTotal = p * Math.pow((1 + r / n), n * t);
		  double compoundInterest = cTotal - p;
		  double sTotal = p + simpleInterest;
		  System.out.println("Principal\tInterest\t\t\tTotal\t\t\tInterest Type");
		  System.out.println("----------------------------------------------------------------------------------------");
		  System.out.println(p + "\t" + simpleInterest + "\t\t\t" + sTotal + "\t\t" + "Simple Interest");
		  System.out.println(p + "\t" + compoundInterest + "\t\t" + cTotal + "\t" + "Compound Interest");
		}

	}