import java.util.Scanner;
import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;

/**
 *
 * @author Gustavo Patricio
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        int numQuarto;
        double valorDiaria;
        
        System.out.println("Hello my friend!");
        System.out.println("Digite o numero do quarto:");
        numQuarto = entrada.nextInt();
        System.out.println("Digite o valor da diária:");
        valorDiaria = entrada.nextDouble();
        
        //ok lets go!
        
        QuartoHotel qh = new QuartoHotel(numQuarto, valorDiaria);
        
        int opcao;
        
        do { 
            
            System.out.println("************************");
            System.out.println("*****QUARTO HOTEL*****");
            System.out.println("************************");
            System.out.println("");
        
            System.out.println("1 - Consultar Quarto");
            System.out.println("2 - Reservar Quarto");
            System.out.println("3 - Liberar Quarto");
            System.out.println("4 - Consultar Faturamento Quarto");
            System.out.println("5 - Sair");
            System.out.print("\n\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            System.out.println("\n");  

            switch (opcao) {
                case 1: /*Consultar Quarto*/
                    if (qh.getSituacao() == true)
                    {
                    System.out.println("O quarto está reservado!");
                    }
                    else
                    {
                    System.out.println("O quarto está livre!");
                    }
                    
                    break;

                case 2:/*Reservar Quarto*/
                    
                    if (qh.getSituacao() == true)
                    {
                    System.out.println("ERRO! O quarto já foi reservado!!!!");
                    }
                    else
                    {
                    int r;
                    System.out.println("Insira o número do RG:");
                    r = entrada.nextInt();
                    
                    qh.reservar(r);
                    
                    System.out.println("Sua reserva foi efetuada com sucesso!");
                    
                    }
                    
                    
                    break;

                case 3: /*Liberar Quarto*/
                    
                    if (qh.getSituacao() == true)
                    {
                    int lib;
                    double totalPagar;
                    System.out.println("Quantos dias o cliente ficou hospedado?");
                    lib = entrada.nextInt();
                    
                    totalPagar = qh.liberar(lib);
                    
                    System.out.println("O cliente de RG "+ qh.getNumRG() + " ficou hospedado por " + lib + " dias");
                    System.out.println("Total a pagar: " + df.format(totalPagar));
                    }
                    else
                    {
                    System.out.println("O quarto já está livre!!!");
                    }
                    
                    
                    break;
                    
                case 4: /*Consultar Faturamento Quarto*/
                   System.out.println("Total faturado pelo quarto: " + df.format(qh.getTotalFaturado()));
                    
                    break;
            }
           
        //System.out.println("************************");
        System.out.println("\n\n");  
        } while (opcao < 5);
        
        
    }
    
}
