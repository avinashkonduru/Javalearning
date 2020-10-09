package concept;

public class SortingArrayOfNUmbers {

    public static void sortArrNumAsc() {
        System.out.print("Ascending Order ");
        int a[] = {5, 8, 2, 9, 1, 1};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i]);
        }
    }
    public static void sortArrNumDesc() {
        System.out.print("\nDescending Order ");
        int a[] = {5, 8, 2, 9, 1, 1};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i]);
        }
    }


    public static void main(String[] args) {
        sortArrNumAsc();
        sortArrNumDesc();

    }
}
