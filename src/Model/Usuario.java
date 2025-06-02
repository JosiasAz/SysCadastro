package Model;

public class Usuario extends Pessoa{
    public Usuario(String nome, String email) {
        super(nome, email);
    }

    public void exibirDados(){
        System.out.println("Nome: "+getNome()+"Email: "+getEmail());
    }
}
