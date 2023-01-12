
package programando;

public class Funcionario {
    private int idade;
    private String email;
    private String nome;
    public void setNome(String nomeD) {
        nome = nomeD;
    }
    public String getNome ( ){
        return nome;
    }
    public void setIdade (int idade_c){
        idade = idade_c;
    }
    public int getIdade ( ){
        return idade;
    }
    public void setEmail (String emailD ){
        email = emailD;
    }
    public String getEmail( ){
        return email;
    }

    public static class funcionario {

        public funcionario() {
        }
    }
}