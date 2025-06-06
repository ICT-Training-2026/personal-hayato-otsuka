package driver;
import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AbsProduct[] absProd = makeProductList();
		System.out.println("--- 商品リスト ---");
		displayProductList(absProd);
		
		Deliverable[] delivarableProd = getDeliverable(absProd);
		System.out.println("--- 配送可能商品 ---");
		displayDelivList(delivarableProd);
	}
	
	public static AbsProduct[] makeProductList() {
		AbsProduct[] absProducts = {
				new LimitedProduct("マウス", 2000, 10),
				new SpecialProduct("特化キーボード", 3600, 4500),
				new LimitedProduct("Webカメラ", 3900, 7),
				new NormalProduct("マイク",2800),
				new SpecialProduct("ディスプレイ", 15000, 20000),
				new NormalProduct("LED照明", 4200)
		};
		return absProducts;
	}
	
	public static void displayProductList(AbsProduct[] absProd) {
		for(int i = 0; i < absProd.length; i++) {
			absProd[i].display();
		}
	}
	
	public static Deliverable[] getDeliverable(AbsProduct[] absProd) {
		Deliverable[] deliverableProducts = new Deliverable[absProd.length];
		for(int i = 0,  j = 0; i < absProd.length; i++) {
			if(absProd[i] instanceof Deliverable) {
				deliverableProducts[j] = (Deliverable) absProd[i];
				j++;
			}
		}
		return deliverableProducts;
	}
	
	public static void displayDelivList(Deliverable [] deliv) {
		for(int i = 0; i < deliv.length; i++) {
			if(deliv[i] == null) {
				continue;
			} else {
				deliv[i].disPlayDeliv();
			}
		}
	}

}
