package dao;

public interface CRUD<T, E extends Exception> {
    public void create(T obj);
    public T findById(int id);
    public void delete(int id) throws E;
    public void deleteMany();
}