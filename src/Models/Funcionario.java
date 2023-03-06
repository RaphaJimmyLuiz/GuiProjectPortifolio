package Models;

public class Funcionario {
    private String name;
    private String cpf;
    private String funcao;
    private double salario;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " Os dados do Funcionario são:"+"\n"+
                "cpf=" + cpf +"\n" +
                "nome=" + name +"\n"+
                "funcao=" + funcao +"\n"+
                "salario=" + salario

                ;
    }
}
