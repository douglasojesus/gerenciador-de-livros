package dao;
public class DAO {
    public static Estoque estoque;
    public static UsuarioDAO usuarioDAO;
    public static BibliotecarioDAO bibliotecarioDAO;
    public static Estoque getEstoque(){
        if (estoque == null){
            estoque = new EstoqueImplementacao();
        }
        return estoque;
    }
    public static UsuarioDAO getUsuario(){
        if (usuarioDAO == null){
            usuarioDAO = new UsuarioDAOImplementacao();
        }
        return usuarioDAO;
    }
    public static BibliotecarioDAO getBibliotecario(){
        if (bibliotecarioDAO == null){
            bibliotecarioDAO = new BibliotecarioDAOImplementacao();
        }
        return bibliotecarioDAO;
    }

}
