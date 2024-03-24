package com.group4.fashionstarshop.service;

import java.util.List;


import com.group4.fashionstarshop.model.Store;

public interface StoreService {
	Store createStore(Store store);
	Store updateStore(Long id, Store store);
	Store getStore(Long id);
    void deleteStore(Long id);
    List<Store> getAllStores();
}
