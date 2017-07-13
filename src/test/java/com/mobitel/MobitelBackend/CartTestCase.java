package com.mobitel.MobitelBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.CartDAO;
import com.mobitel.MobitelBackend.model.Cart;

public class CartTestCase {
	
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		// Inserting a Cart Object.
		CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
		
	/*	//Insertion TestCase
		
		Cart cart=new Cart();
		cart.setCartid(1001);
		cart.setProdid(4);
		cart.setProdname("Nike");
		cart.setPrice(15000);
		cart.setQuantity(7);
		cart.setStatus("N");
		cart.setUsername("Lynal");
		
		cartDAO.addToCart(cart);
		System.out.println("Added to the Cart");
	*/	
	/*	//Deleting TestCase
		Cart cart=cartDAO.getCartItem(2);
		cartDAO.deleteCartItem(cart);
		System.out.println("The Cart Deleted");
	*/	
		//Displaying TestCase
	/*	
		List<Cart> list=cartDAO.getCartItems("Lynal");
		
		for(Cart cart:list)
		{
			System.out.println(cart.getCartid() +":::");
			System.out.println(cart.getProdid()+":::");
			System.out.println(cart.getProdname()+":::");
			System.out.println(cart.getPrice()+":::");
			System.out.println(cart.getQuantity()+":::");
		}
		
		System.out.println("Cart item Displayed:");
	*/	
		// Update TestCase
		
		Cart cart=cartDAO.getCartItem(1);
		cart.setProdname("Converse");
		cartDAO.updateCartItem(cart);
		System.out.println("The Cart Updated");
     }
}