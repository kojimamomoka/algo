/*
 * Listの実装であるLinkedListクラスについて体験する
 *
 ArrayList
 Listの実装値を配列で扱うように実装されている．
 インデックス指定のget、setの呼び出しが高速である．
 リストの間への挿入や削除に時間がかかる．

 LinkedList
 双方向リスト．ArrayListと逆の特徴を持っており，
 インデックス指定のget、setの呼び出しは遅く，
 リストの間への挿入と削除が高速である．

 */

package algo;

import java.util.*;

public class LinkedListSample {

	public static void main(String[] args){
		// Listの実装であるArrayListクラスのインスタンス生成，今回は文字列型
		// ジェネリクス（総称型）を使っている（復習）
		LinkedList<String> list = new LinkedList<String>();
		list.add("東京"); // 要素の追加
		list.add("ロンドン");
		list.add("パリ");
		list.add("パリ"); // Ｓｅｔの場合と比較しよう

		for(int i=0; i<list.size(); i++){ // リストの要素を表示；
			System.out.println(list.get(i));
		}
		System.out.println("");

		list.remove(1); // 要素の削除

		for(int i=0; i<list.size(); i++){ // リストの要素を表示；
			System.out.println(list.get(i));
		}
		System.out.println("");

		list.add(2,"バンコク"); // 第2番目に要素を追加

		for(int i=0; i<list.size(); i++){ // リストの要素を表示；
			System.out.println(list.get(i));
		}
	}
}

