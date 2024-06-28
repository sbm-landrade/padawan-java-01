package sintaxe_variaveis_e_fluxo;

public class TesteOpcionalIr {
	   public static void main(String[] args) {

	        double salario = 3751.02;
	        
	        if(salario >= 1900.0  && salario <= 2800.0) {
	            System.out.println("A sua aliquota é de 15%");
	            System.out.println("Você pode deduzir R$ 142");
	        }

	        if(salario >=  2800.01 && salario <= 3750.0) {
	            System.out.println("A sua aliquota é de 15%");
	            System.out.println("Você pode deduzir R$ 350");
	        }
	        if(salario >= 3751.01 && salario <= 4664.00) {
	        	System.out.println("A sua aliquota é de 22.5%");
	        	System.out.println("Você pode deduzir R$ 636");
	        }
	        
	   }
}