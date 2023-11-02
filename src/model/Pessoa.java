package model;

class Pessoa {
    protected String nome;
    private String cpf;

   
    public Pessoa () {
        
    }
    
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCPF: " + cpf;
    }
}

