/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCast.services;

import java.util.List;

/**
 *
 * @author Walid
 */
public interface IService<T> {
	public boolean add(T t);	
	public boolean delete(T t);	
	public boolean update(T t);
	public T getById(String id);
	public List<T> getAll();
}
