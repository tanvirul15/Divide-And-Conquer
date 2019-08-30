package divideandconqure;

public class MssDivideAndConquar {

    public static void main(String args[]) {
        int ar[]={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(max_sub_array(ar,0,ar.length-1));

    }

    static int find_max(int num1, int num2, int num3) {
        int n = num1 > num2 ? num1 : num2;
        n = num3 > n ? num3 : n;
        return n;
    }

    static int max_sub_array(int[] ar, int low, int high) {
        if(high==-1)return 0;
        if (low == high) {
            return ar[low];
        }
        int mid = (low + high) / 2;
        int L_mss = max_sub_array(ar, low, mid);
        int R_mss = max_sub_array(ar, mid + 1, high);
        int C_mss = cross_max(ar, low, high, mid);
        return find_max(L_mss, R_mss, C_mss);
    }

    static int cross_max(int ar[], int low, int high, int mid) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += ar[i];
            max1 = sum > max1 ? sum : max1;
        }
        sum = 0;
        for (int j = mid + 1; j <= high; j++) {
            sum += ar[j];
            max2 = sum > max2 ? sum : max2;

        }
        return max1 + max2;
    }

}
