package divideandconqure;

public class DivideAndConqure {

    public static void main(String[] args) {
        int ar[] = {6, 2, 1, 5, 55, 52, 56};
        DivideAndConqure dv = new DivideAndConqure();
        int av[] = dv.margeshot(ar, 0, ar.length - 1);
        for (int a : ar) {
            System.out.print(a + "  ");
        }
    }

    
    public int[] margeshot(int[] ar, int l, int r) {
        if (l == r) {
            int temp[] = new int[1];
            temp[0] = ar[l];
            return temp;
        } else {
            int pivot = (l + r) / 2;
            int[] temp1 = margeshot(ar, l, pivot);
            int[] temp2 = margeshot(ar, pivot + 1, r);
            return conqure(temp1, temp2);
        }

    }

    public int[] conqure(int[] a, int[] b) {
        int i = a.length;
        int j = b.length;
        int x = i + j;
        int temp[] = new int[x];
        int p = 0, q = 0, k = 0;

        for (; p < i && q < j; k++) {
            if (a[p] < b[q]) {
                temp[k] = a[p];
                p++;
            } else {
                temp[k] = b[q];
                q++;
            }

        }
        if (p < i) {
            for (; p < i; p++) {
                temp[k] = a[p];
                k++;
            }
        }
        if (q < j) {
            for (; q < j; q++) {
                temp[k] = b[q];
                k++;
            }

        }
        return temp;
    }
}
