
package testefuncionario;

import org.me.funcionario.Funcionario;


public class TesteFuncionario {

    public static void main(String[] args) {
        
        Funcionario func1= new Funcionario( );
        func1.nome ="JOÃO";
        func1.idade =25;
        func1.salario = 2000.00;
        
        System.out.println("Nome: "+ func1.nome );
        func1.exibeMensagem();
    }
    
}
