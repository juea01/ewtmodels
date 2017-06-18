package com.eworldtrade.model.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.eworldtrade.model.dto.DealDTO;
import com.eworldtrade.model.dto.UserDTO;
import com.eworldtrade.model.entity.Deal;
import com.eworldtrade.model.entity.GemJewellery;
import com.eworldtrade.model.entity.ProductList;
import com.eworldtrade.model.entity.User;

//@Stateless
//public class UserDAO extends DAO{
//	
//	@EJB
//	private DAO dao;
//
//	public User create(UserDTO userDTO) {
//		
//		User dbUser = new User();
//		dbUser.setUserName(userDTO.getFirstName());
//		dbUser.setUserEmail(userDTO.getEmail());
//		dbUser.setUserDob(userDTO.getDateOfBirth());
//		dbUser.setUserGender(userDTO.getGender());
//		dao.create(dbUser);
//		return dbUser;
//	}

@Stateless
public class UserDAO implements DAO{

	@PersistenceContext(unitName = "EWTModels")
	private EntityManager em;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
		return user;
	}
	
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		em.merge(user);
		return user;
	}
	
	
	@Override
	public List<Deal> getDeals(int startIndex, int totalSize) {
		// TODO Auto-generated method stub
		TypedQuery query = em.createNamedQuery("Deal.findAll",Deal.class);
		query.setFirstResult(startIndex);
		query.setMaxResults(totalSize);
		List<Deal> deals = query.getResultList();
		return deals;
	}
	
	public List<Deal> getDealsBySearchKeyWord(int startIndex, int totalSize, String searchKeyWord) {
		TypedQuery query = em.createNamedQuery("Deal.findAllBySearchKeyWord",Deal.class);
		query.setParameter("searchKeyWord", searchKeyWord);
		query.setFirstResult(startIndex);
		query.setMaxResults(totalSize);
		List<Deal> deals = query.getResultList();
		return deals;
	}

	@Override
	public List<GemJewellery> getGemsJewelleries(int startIndex, int totalSize) {
		// TODO Auto-generated method stub
		TypedQuery query = em.createNamedQuery("GemJewellery.findAll",GemJewellery.class);
		query.setFirstResult(startIndex);
		query.setMaxResults(totalSize);
		List<GemJewellery> gemsJewelleries = query.getResultList();
		return gemsJewelleries;
	}

	
	@Override
	public Deal getDealById(int id) {
		// TODO Auto-generated method stub
		TypedQuery query = em.createNamedQuery("Deal.findById", Deal.class);
		query.setParameter("Id", id);
		Deal deal = (Deal) query.getSingleResult();
		return deal;
	}

	@Override
	public GemJewellery getGemJewelleryById(int id) {
		// TODO Auto-generated method stub
		TypedQuery query = em.createNamedQuery("GemJewellery.findById", GemJewellery.class);
		query.setParameter("Id", id);
		GemJewellery gemJewellery = (GemJewellery) query.getSingleResult();
		return gemJewellery;
	}

	
	@Override
	public Deal createDeal(Deal deal) {
		// TODO Auto-generated method stub
		em.persist(deal);
		return deal;
	}
	
	@Override
	public GemJewellery createGemJewellery(GemJewellery gemJewellery) {
		// TODO Auto-generated method stub
		em.persist(gemJewellery);
		return gemJewellery;
	}

	@Override
	public long countDeals() {
		// TODO Auto-generated method stub
		TypedQuery query = em.createNamedQuery("Deal.countAll", Deal.class);
		long totalCount =  (Long) query.getSingleResult();
		return totalCount;
	}
	
	public long countDealsBySearchKeyWord(String searchKeyWord) {
		TypedQuery query = em.createNamedQuery("Deal.countAllBySearchKeyWord", Deal.class);
		query.setParameter("searchKeyWord", searchKeyWord);
		long totalCount = (Long) query.getSingleResult();
		return totalCount;
	}
	
	@Override
	public long countGemsJewelleries() {
		// TODO Auto-generated method stub
		TypedQuery query = em.createNamedQuery("GemJewellery.countAll", GemJewellery.class);
		long totalCount =  (Long) query.getSingleResult();
		return totalCount;
	}
	
	@Override
	public User getUserByUserNamePassword(String userName, String password) {
		// TODO Auto-generated method stub
		try {
		TypedQuery query = em.createNamedQuery("User.findByUserNamePassword",User.class );
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		User user = (User) query.getSingleResult();
		return user;
		} catch (NoResultException nre) {
			nre.getMessage();
			return null;
		} 
	}

	@Override
	public List<ProductList> getAllProductList() {
		// TODO Auto-generated method stub
		try {
			TypedQuery query = em.createNamedQuery("ProductList.findAll",ProductList.class);
			List<ProductList> productList = query.getResultList();
			return productList;
		}catch (NoResultException nre) {
			nre.getMessage();
			return null;
		}
	}

	@Override
	public User getUserByUserId(int userId) {
		// TODO Auto-generated method stub
		try{
			TypedQuery query = em.createNamedQuery("User.findByUserId", User.class);
			query.setParameter("userId", userId);
			User user = (User) query.getSingleResult();
			return user;
		}catch (NoResultException nre) {
			nre.getMessage();
			return null;
		}
	}

	@Override
	public long countDealsByUserId(int userId) {
		// TODO Auto-generated method stub
		TypedQuery query = em.createNamedQuery("Deal.countAllByUserId", Deal.class);
		query.setParameter("userId", userId);
		long totalCount = (Long) query.getSingleResult();
		return totalCount;
	}

	@Override
	public List<Deal> getDealsByUserId(int startIndex, int totalSize, int userId) {
		TypedQuery query = em.createNamedQuery("Deal.findAllByUserId",Deal.class);
		query.setParameter("userId", userId);
		query.setFirstResult(startIndex);
		query.setMaxResults(totalSize);
		List<Deal> deals = query.getResultList();
		return deals;
	}

	@Override
	public Deal updateDeal(Deal deal) {
		// TODO Auto-generated method stub
		em.merge(deal);
		return deal;
	}
	
}
