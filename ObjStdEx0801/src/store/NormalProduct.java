package store;

public class NormalProduct extends AbsProduct implements Deliverable{

	public NormalProduct(String name, int price) {
		super(name, price);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void display() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.getNameAndPrice());
	}

	@Override
	public void disPlayDeliv() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("【通常送料500円】");
		System.out.println(super.getNameAndPrice());
	}

}
