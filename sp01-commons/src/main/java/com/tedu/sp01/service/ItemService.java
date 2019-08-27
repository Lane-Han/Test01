package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	/**
	 * 保存订单时，减少商品数量
	 * @param list
	 */
	void decreaseNumbers(List<Item> list); 
}
