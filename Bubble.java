package algo;

import java.util.Scanner;
public class Bubble {
  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
  }

  static void bubbleSort(int[] a, int n) {
    int k = 0; // a[k]より前はソート済み
    while (k < n ‐ 1) {
      int last = n ‐ 1; // 最後に交換した位置
      for (int j = n ‐ 1; j > k; j‐‐) // kまで
        if (a[j ‐ 1] > a[j]) {
          swap(a, j ‐ 1, j);
          last = j;
        }
      k = last;
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("バブルソート");
    System.out.print("要素数：");
    int nx = stdIn.nextInt();
    int[] x = new int[nx];

    for (int i = 0; i < nx; i++) {
System.out.print("x[" + i + "]：");
x[i] = stdIn.nextInt();
}
bubbleSort(x, nx);
System.out.println("ソート結果");
for (int i = 0; i < nx; i++)
System.out.println("x[" + i + "]＝" + x[i]);
}
}
