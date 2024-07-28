package Dao;

import java.util.ArrayList;

import Modal.Cart;

public class Cart_DAO {
	ArrayList<Cart> carts = new ArrayList<Cart>();
	double orderTotal;
	public ArrayList<Cart> getCarts() {
		return carts;
	}
	public void setCarts(ArrayList<Cart> carts) {
		this.carts = carts;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public int getCount() {
		return carts.size();
	}
	protected void calculateOrderTotal() {
		double Total = 0;
		for(int counter = 0; counter < carts.size() ; counter++ ) {
			Cart cart = (Cart) carts.get(counter);
			Total += cart.getTamtinh();
		}
		setOrderTotal(Total);
	}
	public Cart getCart(int Index) {
		Cart cart =  null;
		if(carts.size() > Index) {
			cart = (Cart) carts.get(Index);
		}
		return cart;
	}
	public void addCart( String anh, String ten, String giatien, String soluong) {
		double tamtinh = 0.0;
		double giagiam = 0.0;
		int soluongmua = 0;
		Cart cart = new Cart();
		try {
			if (giatien != null && !giatien.isEmpty()) {
	            giagiam = Double.parseDouble(giatien);
	        }
			if (soluong !=null && !soluong.isEmpty()) {
				soluongmua= Integer.parseInt(soluong);
			}
			if (soluongmua > 0) {
				tamtinh = giagiam *soluongmua;
				
				cart.setTensanpham(ten);
				cart.setImg(anh);
				cart.setGiagiam(giagiam);
				cart.setSoluongmua(soluongmua);
				cart.setTamtinh(tamtinh);
				carts.add(cart);
				calculateOrderTotal();
			}

		} catch (NumberFormatException e) {
			System.out.println("Error add-----------------------: " + e.getMessage());
	        e.printStackTrace();
		}		
	}
	public void addCart(Cart cart) {
		carts.add(cart);
	}
	public void updateCart(String Index , String soluong) {
		double tamtinh = 0.0;
		double giagiam = 0.0;
		int soluongmua = 0;
		int index = 0;
		Cart cart = null;
		try {
			index = Integer.parseInt(Index);
			soluongmua = Integer.parseInt(soluong);
			if(soluongmua >0) {
				cart =(Cart) carts.get(index -1);
				giagiam = cart.getGiagiam();
				tamtinh = giagiam*soluongmua;
				cart.setSoluongmua(soluongmua);
				cart.setTamtinh(tamtinh);
				calculateOrderTotal();
			}
		} catch (NumberFormatException e) {
			System.out.println("Error update" + e.getMessage());
			e.printStackTrace();
		}
	}
	public void deleteCart(String Index) {
		int index = 0;
		try {
			index = Integer.parseInt(Index);
			carts.remove(index -1);
			calculateOrderTotal();
		} catch (NumberFormatException e) {
			System.out.println("Error detele"+ e.getMessage());
			e.printStackTrace();
		}
	}
	public void clear() {
		// TODO Auto-generated method stub
		carts.clear();
	}

}
