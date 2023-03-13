package Homwork_1;
import java.util.Scanner;

class Product {
	private String barcode;
	private String name;
	private int price;

	public Product(String barcode, String name, int price) {
		this.barcode = barcode;
		this.name = name;
		this.price = price;
	}

	public Product(String barcode, int price) {
		this(barcode, "No Name", price);
	}

	public Product(String barcode, String name) {
		this(barcode, name, 0);
	}

	String resultBarcode() {
		return barcode;
	}

	String resultName() {
		return name;
	}

	int resultPrice() {
		return price;
	}
}

public class Review {
	final static int PRODUCT_TOTAL = 3;

	public static void main(String[] args) {
		Product productArray[] = new Product[PRODUCT_TOTAL];
		Scanner a = new Scanner(System.in);
		System.out.println("## 상품 정보 입력 ##");
		for (int i = 0; i < PRODUCT_TOTAL; i++) {
			String barcode, name, price;

			System.out.print("바코드:");
			barcode = a.nextLine();
			System.out.print("상품명:");
			name = a.nextLine();
			System.out.print("가격:");
			price = a.nextLine();
			
			if (name == "")
				productArray[i] = new Product(barcode, Integer.parseInt(price));
			else if (price == "")
				productArray[i] = new Product(barcode, name);
			else
				productArray[i] = new Product(barcode, name, Integer.parseInt(price));
			System.out.println(productArray[i].resultName() + " 추가되었습니다.");
			System.out.println();

		}

		String search;
		System.out.println("## 상품 검색 ##");
		while (true) {
			System.out.print("바코드:");
			search = a.next();
			if (search.equals("Q") || search.equals("q")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			for (int i = 0; i < PRODUCT_TOTAL; i++) {
				if (search.equals(productArray[i].resultBarcode())) {
					System.out.println(productArray[i].resultName() + ", " + productArray[i].resultPrice() + "원");
					System.out.println();
				}
			}
		}

	}
}