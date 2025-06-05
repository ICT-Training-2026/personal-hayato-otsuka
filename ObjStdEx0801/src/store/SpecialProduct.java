package store;

public class SpecialProduct extends AbsProduct  implements Deliverable{

	
	private int orgPrice;
	
	public SpecialProduct(String name, int price, int orgPrice) {
		super(name, price);
		// TODO 自動生成されたコンストラクター・スタブ
		this.orgPrice = orgPrice;
	}

	@Override
	public void display() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print(super.getNameAndPrice());
		System.out.println("(定価:" + orgPrice + "円)");
	}

	@Override
	public void disPlayDeliv() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("【*特別送料300円*】");
		System.out.println(super.getNameAndPrice());
	}

}
