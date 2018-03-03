package com.crud.spring.dao;

import java.util.List;
import com.crud.spring.model.Usuario;

public interface IDao<T> {

   public long save(T o);
   public Usuario get(long id);
   public List<T> list();
   public void update(long id, T o);
   public void delete(long id);

}