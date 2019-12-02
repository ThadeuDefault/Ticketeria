
package ticketeria;

public class Ingresso{
    
    //Interações cliente - ingresso 
    String cpf;
    String tipo;
    int lugar;
    
    //Preços
    double precoMeia = 8.50;
    double precoInteira = 17; 
    
    //compra de ingresso
    public void comprarIngresso(String cpf,Sessao sessao,int lugar, boolean inteiraOUmeia){
        
        this.cpf = cpf;
        this.lugar = lugar;
        
        if( sessao.disponivel == true){
        sessao.registrarAssento(lugar, cpf);
        
        
        if(inteiraOUmeia == true){
            this.tipo = "meia";
        }else{
            this.tipo = "inteira";
        }
        
        }else{
            
            System.out.println("Sessao indisponivel!");
            
        }
    }
}
