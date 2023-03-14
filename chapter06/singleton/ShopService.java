package chapter06.singleton;

public class ShopService {

	private static ShopService instance = new ShopService();

	private ShopService() {
	}

	public static ShopService getInstance() {
		return instance;
	}

}
