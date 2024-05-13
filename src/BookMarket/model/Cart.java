package BookMarket.model;

import java.util.ArrayList;

public class Cart {

	ArrayList<CartItem> itemList = new ArrayList<>();
	int numItem = 0;
	
	public boolean isEmpty() {
		return numItem == 0;
	}

	public int getNumItem() {
		return numItem;
	}

	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}
	
	public ArrayList<CartItem> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<CartItem> itemList) {
		this.itemList = itemList;
	}

	public String getItemInfo(int index) {
		return itemList.toString();
	}

	public void resetCart() {
		
		numItem = 0;
		
		this.itemList.clear();;
	}

	public void addItem(CartItem book) {

		CartItem item = getCartItem(book);
		if (item == null) {
			itemList.add(book);
		} else {
			item.addQuantity(1);
		}
		
		
	}

	private CartItem getCartItem(CartItem book) {
		
		for(CartItem item : itemList) {
			if (item.equals(book))
				return item;
		}
		
		return null;
	}

	
}
