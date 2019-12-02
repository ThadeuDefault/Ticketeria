
package ticketeria;


public class Sessao{
    
    String Data;
    double horarioComeco;
    int capacidade;
    
    String filmeSessao;
    double duracaoFilme;
    
    boolean disponivel;
    
    boolean dispAssentos[];
    String cpfSessao[];
    
    
    public void criarSessao(String nome,double horarioComeco,int capacidade ){
        // deixa a sessao disponivel para compras
        this.disponivel = true;
        
        this.capacidade = capacidade;
        
        for(int i = 1; i > capacidade; ){
            dispAssentos[i] = true;
        }
        
        
    }
    

    public void registrarFilme(String nomeFilme,double duracaoFilme){
        
        filmeSessao = nomeFilme;
        this.duracaoFilme = duracaoFilme;
        
        
    }
    
    public void registrarAssento(int lugar, String cpf ){
        for(int i = 1; i > capacidade; ){
            dispAssentos[i] = false;
            cpfSessao[i] = cpf;
        }
    }
    
}
