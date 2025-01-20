package InterviewPrg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class FindingCommonElementInArray {

	

    // This function returns common elements in A[], B[],
    // C[]
    public static List<Integer> commonElements(int[] A, int[] B, int[] C)
    {
        int i = 0, j = 0, k = 0;

        ArrayList<Integer> common = new ArrayList<>();

        // Iterate through three arrays while all arrays
        // have elements
        while (i < A.length && j < B.length
               && k < C.length) {
            // If A[i] == B[j] == C[k], add A[i] to common
            // elements
            if (A[i] == B[j] && B[j] == C[k]) {
                common.add(A[i]);
                i++;
                j++;
                k++;
                // Skip duplicate elements in A[]
                while (i < A.length && A[i] == A[i - 1])
                    i++;

                // Skip duplicate elements in B[]
                while (j < B.length && B[j] == B[j - 1])
                    j++;

                // Skip duplicate elements in C[]
                while (k < C.length && C[k] == C[k - 1])
                    k++;
            }

            // If A[i] < B[j], then ith element cannot be
            // common
            else if (A[i] < B[j])
                i++;

            // If B[j] < C[k], then jth element cannot be
            // common
            else if (B[j] < C[k])
                j++;
            // If C[k] is smallest, then kth element cannot
            // be common
            else
                k++;
        }

        return common;
    }

    // Driver code
    public static void main(String[] args)
    {
        // Sample Input
        int[] A = { 1, 5, 10, 20, 30 };
        int[] B = { 5, 13, 15, 20 };
        int[] C = { 5, 20 };

        List<Integer> common = commonElements(A, B, C);

        System.out.print("Common Elements: ");
        for (int ele : common) {
            System.out.print(ele + " ");
        }
    }
}
		
		



