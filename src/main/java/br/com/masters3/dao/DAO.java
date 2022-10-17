package br.com.masters3.dao;

public interface DAO<T extends Object> {
	public void create(T Object);
	public T read(int id);
	public void update(T Object);
	public void delete(T Object);
}
