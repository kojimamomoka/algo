// ストラテジデザインを体験する
// アルゴリズムをクラスでカプセル化して切り替える．

package algo;

public class StrategySample {

	interface Strategy{ // インターフェース(Strategy)を作る
		String function();
	}

	// アルゴリズムをクラスでカプセル化する
	public static class ConcriteStrategyA implements Strategy{
		public String function() {
			return "アルゴリズムＡ";
		}
	}

	public static class ConcriteStrategyB implements Strategy{
		public String function() {
			return "アルゴリズムＢ";
		}
	}

	public static class ConcriteStrategyC implements Strategy{
		public String function() {
			return "アルゴリズムＣ";
		}
	}

	public static String function(int id){ // アルゴリズムの切り替え
		Strategy strategy;
		if(id==1) strategy = new ConcriteStrategyA();
		else if (id==2) strategy = new ConcriteStrategyB();
		else strategy = new ConcriteStrategyC();

		return strategy.function();
	}

	public static void main(String[] args){
		System.out.println(function(2));
	}
}

/*
* 例えば次のようなプログラムの場合，アルゴリズムを並列にゴチャゴチャと記載している
*
* public static String function(int id){
* String result;
* if(id==1) result = "アルゴリズムＡ";
* else if (id==2) result = "アルゴリズムＢ";
* else result = "アルゴリズムＣ";
* return result;
* */


