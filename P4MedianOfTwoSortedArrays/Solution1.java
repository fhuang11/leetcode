package P4MedianOfTwoSortedArrays;

class Solution1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int iMedian2 = length / 2;
        int iMedian1 = (length % 2 == 1) ? iMedian2 : iMedian2 - 1;
        int i1 = 0;
        int i2 = 0;
        int median1 = 0;
        int median2 = 0;
        for (int i = 0; i <= iMedian2; i++) {
            if (i2 > nums2.length - 1 || (i1 < nums1.length && nums1[i1] <= nums2[i2])) {
                if(i==iMedian1) median1 = nums1[i1];
                if(i==iMedian2) median2 = nums1[i1];
                i1++;
            } else {
                if(i==iMedian1) median1 = nums2[i2];
                if(i==iMedian2) median2 = nums2[i2];
                i2++;
            }
        }
        return (double) (median1 + median2) / 2;
    }
}