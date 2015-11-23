package algo;

import java.util.Scanner;
public class BinSearch { // 二分探索クラス
  static int search(int[] a, int n, int key) {
    int pl = 0; // 左側インデックス
    int pr = n ‐ 1; // 右側インデックス


    do {
      int pc = (pl+pr)/2; // 中央インデックスの算出
      if (a[pc] == key) return pc; // 探索成功
      else if (a[pc] < key) pl = pc + 1; // 探索範囲を右側に変更
      else pr = pc ‐ 1; // 探索範囲を左側に変更
    } while (pl <= pr);
    // 右側インデックスが左側インデックスの左になったら探索失敗
    return ‐1;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("データ数：");
    int num = stdIn.nextInt();
    int[] x = new int[num]; // データ配列

    // ソーティングは未だ学習していないので，今回は昇順に入力する．
    System.out.println("昇順にデータ入力してください．");

    System.out.print("x[0]："); // データの読込み
    x[0] = stdIn.nextInt();
    for (int i=1;i<num;i++) {
      do {
        System.out.print("x[" + i + "]：");
        x[i] = stdIn.nextInt();
      } while (x[i]<x[i‐1]); // 昇順になっていることを確認
    }

    System.out.print("キー値："); // キー値の読込み
    int ky = stdIn.nextInt();

    int idx = search(x,num,ky); // 配列xから値がkyの要素を探索

    if (idx == ‐1) // 結果の表示
      System.out.println("キー値はありません．");
    else
      System.out.println("キー値はx[" + idx + "]にあります．");
  }
}

