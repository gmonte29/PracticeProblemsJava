public class printSquares {

   public static void main(String[] args) {
      printSquares(100);
   }

   //Building Java Programs, 5th Edition exercise 12.24 solution
   //https://practiceit.cs.washington.edu/problem/view/bjp5/chapter12/e24-printSquares
   public static void printSquares(int n){
         if(n==0) return;
         printSquares(n, 1, 0,"");
      }


   public static void printSquares(int n, int counter, int sum, String output) {
      if (sum > n) return;
      if (sum == n) System.out.println(output.substring(0, output.length() - 3));
      else {
         for (int i = counter; i < n + 1; i++) {
            String temp = output;
            output += i + "^2 + ";
            printSquares(n, i + 1, sum + i * i, output);
            output = temp;
         }
      }
   }
}
