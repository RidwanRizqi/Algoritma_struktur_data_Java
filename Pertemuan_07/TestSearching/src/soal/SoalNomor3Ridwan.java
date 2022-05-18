package soal;
import java.util.Arrays;
public class SoalNomor3Ridwan {
    public static void main(String[] args) {
        int[] arr = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        System.out.println("Data sebelum diurutkan");
        System.out.println(Arrays.toString(arr));
        int temp;
        int max = arr[0];
        for (int i =0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Data setelah diurutkan");
        System.out.println(Arrays.toString(arr));
        System.out.print("Nilai terbesar : " + max);
        System.out.println();

        int awal = 0;
        int startindex = -1;
        int count = 0;
        int akhir = arr.length -1;
        int mid;
        while (awal <= akhir) {
            mid = (awal + akhir)/2;
            if (arr[mid] > max) {
                akhir = mid - 1;
            } else if (arr[mid] == max) {
                startindex = mid;
                akhir = mid -1;
            } else {
                awal = mid + 1;
            }
        }
        int endIndex = -1;
        awal = 0;
        akhir = arr.length - 1;
        while (awal <= akhir) {
            mid = (awal + akhir)/2;
            if (arr[mid] > max) {
                akhir = mid - 1;
            } else if (arr[mid] == max) {
                endIndex = mid;
                awal = mid + 1;
                count++;
            } else {
                awal = mid + 1;
            }
        }
        System.out.println("Ada " + count + " nilai terbesar");
        System.out.print("Nilai tersebut ada pada indeks ke ");
        if (startindex != 1 && endIndex != 1) {
            for (int i=0; i + startindex <= endIndex; i++) {
                if (i > 0) {
                    System.out.print(" dan ");
                }
                System.out.print(i+startindex);
            }
        }
    }
}
