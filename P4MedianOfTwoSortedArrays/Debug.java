package P4MedianOfTwoSortedArrays;

public class Debug {
    public static void main (String[] args) {
        Solution1 solution = new Solution1();

        double median1 = solution.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3 });
        System.out.print("The median of [1,2] and [3] should be 2 and is: ");
        System.out.print(median1);
        System.out.println("");

        double median2 = solution.findMedianSortedArrays(new int[] {1,2}, new int[] {3, 4});
        System.out.print("The median of [1,2] and [3,4] should be 2.5 and is: ");
        System.out.print(median2);
        System.out.println("");
    }
}