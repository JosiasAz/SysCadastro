import Controller.UsuarioController;
import Model.Usuario;
import Model.UsuarioDAO;
import View.TelaCadastro;

public class Main {
    public static void main(String [] args){
        TelaCadastro view = new TelaCadastro();
        UsuarioDAO dao = new UsuarioDAO();
        UsuarioController controller= new UsuarioController(view,dao);
    }
}
