package store;

public class LimitedProduct extends AbsProduct {
	
	private int dayCnt;

	public LimitedProduct(String name, int price, int dayCnt) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name, price);
		this.dayCnt = dayCnt;
	}
	
	@Override
	public void display() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print(super.getNameAndPrice());
		System.out.println("配送不可(残り:" + dayCnt + "日)");
	}
	
	public int minusDayCnt(int minus) {
		return dayCnt -= minus;
	}
}
