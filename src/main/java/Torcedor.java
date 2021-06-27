

public abstract class Torcedor extends Ticket{

    private String nome;
    private int idade;
    private int cpf;


    public String getNome() {
        return nome;
    }

    public Torcedor setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Torcedor setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public int getCpf() {
        return cpf;
    }

    public Torcedor setCpf(int cpf) {
        this.cpf = cpf;
        return this;
    }

    public abstract double ValorEntradaParaTorcedorAdulto();

    public abstract double ValorEntradaParaMenor10Anos();

}
