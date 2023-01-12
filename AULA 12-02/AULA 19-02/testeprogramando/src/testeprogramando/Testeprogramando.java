
package testeprogramando;
import programando.Programando;

public class Testeprogramando {

    public static void main(String[] args) {
        Programando c1 = new Programando ( );
        c1.setnome("Luana");
        c1.setidade(20);
        c1.setemail("luana.santana@fatecitapetininga.edu.br");
        System.out.println("Nome: " + c1.getnome());
        System.out.println("Email: " + c1.getemail());
        System.out.println("Idade: " + c1.getidade());
        }
}