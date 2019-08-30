package divideandconqure;

public class MssHackerrank {

    public static void main(String args[]) {
        int x[] = {3 ,3 ,9 ,9, 5};
        System.out.println(subarray(x));

    }

    public static int subarray(int ar[]) {
        int max = Integer.MIN_VALUE;
        int len = ar.length;

        int sum = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                sum += ar[j];
                if (sum%7 > max) {
                    max = sum;
                }

            }
            sum = 0;

        }

        return max;
    }

}
