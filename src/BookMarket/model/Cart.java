package BookMarket.model;

import java.util.ArrayList;

public class Cart {
	
	//private CartItem[] itemList = new CartItem[64];
	private ArrayList<CartItem> itemList = new ArrayList<>();
	//private int numItem = 0;
	
	public boolean isEmpty() {
		return itemList.isEmpty();
	}

	public int getNumItem() {
		return itemList.size();
	}
	
	public ArrayList<CartItem> getItemList() {
		return itemList;
	}

	public String getItemInfo(int index) {
		return itemList.get(index).toString();
	}

	public void resetCart() {	
		this.itemList.clear();
	}

	public void addItem(Book book) {

		CartItem item = getCartItem(book);
		if (item == null) {
			itemList.add(new CartItem(book));
		} else {
			item.addQuantity(1);
		}
		
		
	}

	private CartItem getCartItem(Book book) {
		
		for(CartItem item : itemList) {
			if (item.getBook() == book)
				return item;
		}	
		return null;
	}

	
}
