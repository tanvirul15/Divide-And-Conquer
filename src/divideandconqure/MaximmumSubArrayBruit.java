package divideandconqure;

public class MaximmumSubArrayBruit {

    public static void main(String args[]) {
        int x[] = {-2, -3, 14, -1, -2, 1, 5, -3};
        System.out.println(subarray(x));

    }

    public static int subarray(int ar[]) {
        int max = Integer.MIN_VALUE;
        int len = ar.length;

        int temp = 0;

        for (int size = 1; size <= len; size++) {
            for (int pointer = 0; pointer <= (len - size); pointer++) {
                for (int i = pointer; i < (pointer + size); i++) {
                    temp += ar[i];

                }

                if (temp > max) {
                    max = temp;
                }
                temp = 0;

            }

        }

        return max;
    }

}
