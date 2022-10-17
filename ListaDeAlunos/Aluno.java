package ListaDeAlunos;

public class Aluno {
    private String nome, ra;

    Aluno(){

    }

    public Aluno(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setRa(String ra){
        this.ra = ra;
    }
    public String getRa(){
        return ra;
    }

    @Override
    public String toString() {
        String r = "";
        r = "Aluno: " + nome + "\nRA: " + ra;
        
        return r;
    } 
    
}
