package com.crud.spring.service;

import java.util.List;


public interface IService<T> {

   long save(T o);
   T get(long id);
   List<T> list();
   void update(long id, T o);
   void delete(long id);
}
