package com.crud.spring.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.spring.model.Usuario;

@Repository
public class UsuarioDaoImpl implements IDao<Usuario> {

   @Autowired
   private SessionFactory sessionFactory;

	public long save(Usuario usuario) {
		sessionFactory.getCurrentSession().save(usuario);
	    return usuario.getId();
	}
	
	public Usuario get(long id) {
		return sessionFactory.getCurrentSession().get(Usuario.class, id);
	}
	
	public List<Usuario> list() {
		Session session = sessionFactory.getCurrentSession();
	    CriteriaBuilder cb = session.getCriteriaBuilder();
	    CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
	    Root<Usuario> root = cq.from(Usuario.class);
	    cq.select(root);
	    Query<Usuario> query = session.createQuery(cq);
	    return query.getResultList();
	}
	
	public void update(long id, Usuario usuario) {
		Session session = sessionFactory.getCurrentSession();
		Usuario usuario2 = session.byId(Usuario.class).load(id);
		usuario2.setNome(usuario.getNome());
		usuario2.setEmail(usuario.getEmail());
	    session.flush();
		
	}
	
	public void delete(long id) {
		 Session session = sessionFactory.getCurrentSession();
		 Usuario usuario = session.byId(Usuario.class).load(id);
	     session.delete(usuario);
		
	}

   

}