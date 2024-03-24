package com.group4.fashionstarshop.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group4.fashionstarshop.model.Store;
import com.group4.fashionstarshop.repository.StoreRepository;
import com.group4.fashionstarshop.service.StoreService;
@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreRepository storeRepository;
	@Override
	public Store createStore(Store store) {
		return storeRepository.save(store);
	}

	@Override
	public Store updateStore(Long id, Store store) {
		store.setStoreId(id);
		return storeRepository.save(store);
	}

	@Override
	public Store getStore(Long id) {
		// TODO Auto-generated method stub
		return storeRepository.findById(id).orElseThrow(null);
	}

	@Override
	public void deleteStore(Long id) {
		storeRepository.deleteById(id);;
		
	}

	@Override
	public List<Store> getAllStores() {
		
		return storeRepository.findAll();
	}
}
