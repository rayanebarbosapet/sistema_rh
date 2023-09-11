package com.sistema.sistema;
import java.util.Scanner;
import pessoas.*;

public class Menu {

    private Funcionarios user; 

    Scanner sc = new Scanner(System.in);
    Atendente atendente = new Atendente(null, null, null, 0, null, null, null, null, 0, null, null, null);
    Supervisor supervisor = new Supervisor(null, null, null, 0, null, null, null, null, null, null, null, 0);
    Gerente gerente = new Gerente(null, null, null, 0, null, null, null, null, null, null, null);
    
        
    
    public void menuPrincipal(){

        System.out.println("Olá bem vindo ao Sistema_Rh\n escolha uma opção:\n");
        System.out.println("(1)Atendente\n(2)Gerente\n(3)Supervisor\n");
        int escolha=sc.nextInt();

        switch (escolha) {
            case 1:
                
                break;
            case 2 :

        
            default:
                break;
        }
    }


    public String verificaFuncionario(Funcionarios pessoa){
        int tentativas = 4;
    //     System.out.println("Digite seu user:");
    //     //String veriuser = sc.nextLine();
    //     int i = 4;
      
    //         if (pessoa.getNome().equals(veriuser)) {
    //          System.out.println("Olá, "+ user);
    //         } else {
    //             System.out.println("Usuario incorreto, tente novamente.\n");
    //             i--;
    //             System.out.printf("você tem %d tentativas", i);
    //             if ( i == 0 ){
    //                 System.out.println("bloqueado");
    //             }
    //         }
    //    return true;    
        boolean nao_logou= true;
   
       while(nao_logou){
        System.out.println("Digite seu user:");
        String veriuser = sc.nextLine();
        
        if (pessoa.getNome().equals(veriuser)){
            nao_logou= false;
            return "logado";
        } 
        System.out.println("Usuario incorreto, tente novamente.\n");
        tentativas--;
        System.out.printf("você tem %d tentativas\n", tentativas);
                if ( tentativas == 0 ){
                    System.out.println("bloqueado");
                    return "bloqueado";
               }    
       }

     /*    System.out.println("Digite seu user:");
        String veriuser = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            if (i<3) {
             System.out.println("Olá, "+ user);
            } else {
                System.out.println("Usuario incorreto, tente novamente.\n");
                System.out.printf("você tem %d", i);
            }
        }*/
        return "blabla";
     }
    
          
    
    public void menuAtendente(){

       System.out.println("Atendente escolha a opção que deseja inserir\n ");
        System.out.println("(1)Calcular FGTS\n(2)Calcular INSS\n(3)Calculo FÉRIAS\n(4)Calculo DÉCIMO TERCEIRO\n");
         int escolha = sc.nextInt(); 
         
         switch (escolha){
            case 1:

            atendente.calculofgts();
                
                break;
            case 2:

            atendente.calculoinss();

             break;

           case 3:
           
                atendente.calculoFerias();

           break;

          case 4:

               atendente.calculoDecTer();
               break;
            
         default:

            System.out.println("Opção inválida");
             break;
         }
        

    }
      public void menuGerente(){

       System.out.println("Gerente escolha a opção que deseja inserir\n ");
        System.out.println("(1)Calcular FGTS\n(2)Calcular INSS\n(3)Calculo FÉRIAS\n(4)Calculo DÉCIMO TERCEIRO\n");
         int escolha = sc.nextInt(); 
         
         switch (escolha){
            case 1:

            gerente.calculofgts();;
                
                break;
            case 2:

           gerente.calculoinss();

             break;

           case 3:
           
            gerente.calculoFerias();

           break;

          case 4:

            gerente.calculoDecTer();
            break;
            default:

            System.out.println("Opção inválida");

            
                break;
         }
        

    }

    public void menuSupervisor(){

        System.out.println("Supervisor escolha a opção que deseja inserir\n ");
         System.out.println("(1)Calcular FGTS\n(2)Calcular INSS\n(3)Calculo FÉRIAS\n(4)Calculo DÉCIMO TERCEIRO\n");
          int escolha = sc.nextInt(); 
          
          switch (escolha){
             case 1:
 
                supervisor.calculofgts();
                 
                    break;
             case 2:
 
                supervisor.calculoinss();
 
                    break;
 
             case 3:
            
                 supervisor.calculoFerias();
 
                    break;
 
             case 4:
 
                 gerente.calculoDecTer();
                    break;
             
             default:
 
                System.out.println("Opção inválida");
             
                   break;
          }
         
 
     }
}
