package Model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario){
        usuarios.add(usuario);
    }

    public boolean emailExiste(String email){
        for(Usuario u: usuarios){
            if(u!= null && u.getEmail()!=null && u.getEmail().equalsIgnoreCase(email)){
                return true;
            }
        }
        return false;
    }

    public List<Usuario> listar(){
        return usuarios;
    }
    
}
