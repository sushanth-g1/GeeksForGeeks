import com.dsa.arrays.PrefixSum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//        System.out.println("\n" +MathUtilities.gcdIterative(46,18));

//        int[] arr = {1, 2, 0, 3};

//        int[] prices = {100, 180, 260, 310, 40, 535, 695};

//        MathUtilities.reverseArray(arr);
//        System.out.println("\n *** : "+ MathUtilities.missingArray(arr));

//        System.out.println("\n "+MathUtilities.maxProfitTwo(prices));
//        Arrays.maxSumSubArray(arr);
//        Arrays.prefixSum(arr);
//        PrefixSum.equi(arr);
        int n = 4; int[] arr = {1, 2, 3, 4}; int q = 2; int[] queries = {1, 4, 2, 3};
        System.out.println(PrefixSum.querySum2(n,arr,q,queries).toString());
        }
    }