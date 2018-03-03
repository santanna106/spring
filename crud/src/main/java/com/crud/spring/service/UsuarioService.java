package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.spring.model.Usuario;
import com.crud.spring.dao.IDao;

@Service
public class UsuarioService implements IService<Usuario> {
	
	 @Autowired
	 private IDao usuarioDao;


	public long save(Usuario o) {
		// TODO Auto-generated method stub
		return usuarioDao.save(o);
	}

	public Usuario get(long id) {
		// TODO Auto-generated method stub
		return usuarioDao.get(id);
	}

	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return usuarioDao.list();
	}

	public void update(long id, Usuario o) {
		usuarioDao.update(id, o); 
		
	}

	public void delete(long id) {
		usuarioDao.delete(id);
		
	}

}
