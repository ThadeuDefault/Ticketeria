
package ticketeria;

public class Ingresso{
    
    //Interações cliente - ingresso 
    String cpf;
    String tipo;
    int lugar;
    
    //Preços
    double precoInteira = 17;
    double precoEspecial = 0;
    
    //compra de ingresso
    public void comprarIngresso(Sessao sessao, String cpf,int lugar, boolean inteiraOUmeia){
        
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
    
    public void getIngresso(){
s
    } 
}
