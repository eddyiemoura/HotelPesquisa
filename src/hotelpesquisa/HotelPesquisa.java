package hotelpesquisa;

import java.util.Scanner;
public class HotelPesquisa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] hospedes = new String[15];
        short opcao;
        int cadastro = 0;
        boolean existe = false;
        
        do{
            System.out.println("Digite 1- cadastrar; 2-pesquisar; 3-sair");
            opcao = leia.nextShort();
            
            switch(opcao){
                case 1 -> {
                    
                 if(cadastro == 15){
                     System.out.println("Máximo de cadastros atingido!");
                     break;
                 }
                    System.out.println("Digite o nome do hóspede: ");
                    for(int i = 0; i < 15; i++){
                        if(hospedes[i] == null){
                            hospedes[i] = leia.next();
                            cadastro++;
                            break;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Digite o nome do hóspede: ");
                    String pesquisa = leia.next();
                   for(int i = 0; i < 15; i++){
                       if(hospedes[i].equals(pesquisa)){
                           System.out.println("Hóspede encontrado no índice: "+i);
                           existe = true;
                           break;
                       }
                   }
                }
            }
  
        }while(opcao != 3);
    }
}
