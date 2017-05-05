package com.eworldtrade.model.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.eworldtrade.model.dto.DealDTO;
import com.eworldtrade.model.dto.UserDTO;
import com.eworldtrade.model.entity.Deal;
import com.eworldtrade.model.entity.GemJewellery;
import com.eworldtrade.model.entity.User;




//@Stateless
//public class DAO {
//	
//	@PersistenceContext(unitName = "EWTModels")
//	private EntityManager em;
//	
//	public <E> E create(E e) {
//		em.persist(e);
//		return e;
//	}

@Local	
	public interface DAO {
	
	public User createUser(User user);
	
	public Deal createDeal(Deal deal);
	
	public GemJewellery createGemJewellery(GemJewellery gemJewellery);
	
	public List<Deal> getDeals(int startIndex, int totalSize); 
	
	public List<GemJewellery> getGemsJewelleries(int startIndex, int totalSize); 
	
	public long countDeals();
	
	public long countGemsJewelleries();
	
	public Deal getDealById(int id); 
	
	public GemJewellery getGemJewelleryById(int id); 
	
	public User getUserByUserNamePassword(String userName, String password);
}
