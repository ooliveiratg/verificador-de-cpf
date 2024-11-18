package licoes;

import java.util.Scanner;

public class verificaCpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       long cpf;
       System.out.println("digite seu cpf: ");
       cpf= sc.nextLong();
        int[] vetor= new int[11]; 
      int[] vetor2 = new int[11];
        int mult1=10,mult2=11, cpfTemp=0,soma=0,div=0,aux1=0,soma2=0,div2=11,res;
        
       
        for (int i=0; i<=10;i++){
            vetor2[i]=(int)(cpf%10);
            vetor[i]=(int)(cpf%10);
            cpf/=10;

            
        // cpfTemp=vetor[i];
    // System.out.println(vetor[i]);
            
        }
        for(int i=10;i>=2;i--){
            
            vetor[i]*=mult1;
            soma+=vetor[i];
            div=soma;
          
            System.out.println(vetor2[i]+" x "+mult1 + " = "+vetor[i]+" = "+soma);
            
          mult1--;
        }

        div%=11;

        System.out.println(div);
        
        aux1=div;

      if(aux1>1){
        aux1=11-aux1;
        System.out.println(aux1);
     
      }
      else{
          
          aux1=0;
        System.out.println(aux1);
        }
      
       


  

    for(int i=10;i>=1;i--){
        vetor2[i]*=mult2;
        soma2+=vetor2[i];
        mult2--;
    }
    res=soma2%11;
    res=11-res;
    System.out.println(res);

    if(res==vetor[0]||aux1==vetor[1]){
        System.out.println("valido");
    }
    else{
        System.out.println("invalido");
    }



    // 59749461894



          

            
        
        // div%=11;
        // // System.out.println(div);

       







        }    
            
        
        
        

       

    
}
