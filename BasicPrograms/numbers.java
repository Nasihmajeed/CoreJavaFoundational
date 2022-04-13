public class numbers {

       public static void main(String[] args) {
          int arr[] ={0,1,2,3,4,5,6,7,8,9}; 
          int even = 0;
          int odd = 0;
          for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
              System.out.println("the number is Even : " +i);
            } else {
              System.out.println("the number is Odd : " +i);
            }
          }
        }
      }
  