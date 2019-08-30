package divideandconqure;

public class Quickshort {
    
    
    public static void quickshort(int ar[],int l,int h){
        if(l>=h)return;
        int piv=partition(ar,l,h);
        quickshort(ar,l,piv-1);
        quickshort(ar,piv+1,h);
    
    
    
    }

    static int partition(int ar[], int l, int h) {
        int piv = ar[h];
        int i = l;
        int j = h;

        while (i < j) {
            if (ar[i] < piv) {
                i++;
            } else {
                ar[j] = ar[i];

                while (j > i && ar[j] > piv) {
                    j--;
                }
                if (j != i) {
                    ar[i] = ar[j];
                    i++;
                }
            }
        }
        ar[i] = piv;
        return i;

    }

    public static void main(String args[]) {
        int ar[] = {6, 3, 400, 1, 333, 45, 2, 34, 60, 33, 54, 23, 454, 44, 32, 3, 56, 25};
        quickshort(ar, 0, ar.length - 1);
        for (int i : ar) {
            System.out.print(i + " ");
        }

    }

}
