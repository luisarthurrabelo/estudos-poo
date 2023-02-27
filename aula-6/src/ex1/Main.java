package ex1;

public class Main {
    
    public static double folhaSalarial(Funcionario func[]) {
        
        double salario = 0;
        
        for(int i=0; i < 5; i++)
            salario += func[i].calculaSalario();
        
        return salario;
    }
    
    public static void mediaSalarial(Funcionario func[]) {
        
        double salarioGerente = 0;
        double salarioAssistente = 0;
        double salarioVendedor = 0;
        int gc = 0, ac = 0, vc = 0;
        
        for(int i=0; i < 5; i++) {
            if(func[i] instanceof Gerente) {
                salarioGerente += func[i].calculaSalario();
                gc++;
            }
            
            else if(func[i] instanceof Assistente) {
                salarioAssistente += func[i].calculaSalario();
                ac++;
            }
            
            else if(func[i] instanceof Vendedor) {
                salarioVendedor += func[i].calculaSalario();
                vc++;
            }
        }
        
        System.out.println("Média Gerente: " + (salarioGerente/gc));
        System.out.println("Média Assistente: " + (salarioAssistente/ac));
        System.out.println("Média Vendedor: " + (salarioVendedor/vc));        
    }
    
    public static void main(String[] args) {
        
        Funcionario funcionario[] = new Funcionario[5];
        double salarioBase = 1500;
        
        funcionario[0] = new Gerente("Luis", "1978", salarioBase);
        funcionario[1] = new Assistente("Pedro", "1231", salarioBase);
        funcionario[2] = new Vendedor("Maria", "1434", salarioBase, 500);
        funcionario[3] = new Gerente("Felipe", "1238", salarioBase);
        funcionario[4] = new Assistente("Ana", "1234", salarioBase);
        
        System.out.println("Folha Salarial: " + folhaSalarial(funcionario));
        mediaSalarial(funcionario);
    }
}
