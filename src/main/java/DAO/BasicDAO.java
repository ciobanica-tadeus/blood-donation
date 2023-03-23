package DAO;

public interface BasicDAO<T,I>{

    void create(T t);

    T read(I id);

    T findByEmail(String email);

}
