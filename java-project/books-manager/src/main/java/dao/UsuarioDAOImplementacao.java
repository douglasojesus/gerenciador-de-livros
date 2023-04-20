package dao;

import models.Usuario;

import java.util.HashMap;

public class UsuarioDAOImplementacao implements UsuarioDAO {
    private HashMap<Integer, Usuario> usuarios = new HashMap<>();
    @Override
    public void create(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }
    @Override
    public Usuario findById(int id) {
        return usuarios.get(id);
    }
    @Override
    public void delete(int id) throws Exception {

    }

    @Override
    public void deleteMany() {

    }
}
