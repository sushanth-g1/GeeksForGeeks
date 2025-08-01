import com.dsa.foundation.MathUtilities;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        //System.out.println("\n" +MathUtilities.gcdIterative(46,18));

        int[] arr = {7,1,5,3,6,4};

        int[] prices = {100, 180, 260, 310, 40, 535, 695};

//        MathUtilities.reverseArray(arr);
     //   System.out.println("\n *** : "+ MathUtilities.missingArray(arr));

        System.out.println("\n "+MathUtilities.maxProfitTwo(prices));
        }
    }