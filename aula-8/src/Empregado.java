public class Empregado implements Comparable<Empregado>{
    private String cpf;
    private int idade;
    private float salario;

    public Empregado(String cpf, int idade, float salario) {
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public int compareTo(Empregado obj) {

        Empregado other = (Empregado) obj;

        if(getIdade() > other.getIdade()) {
            return 1;
        }
        else if(getIdade() < other.getIdade()) {
            return -1;
        }
        else
            return 0;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public String toString() {
        return "cpf: " + cpf + ", idade: " + idade + ", salario: " + salario;
    }
}
