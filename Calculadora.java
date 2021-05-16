package capgemini;

import java.time.LocalDate;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Anuncio anuncio01=new Anuncio();
		Anuncio anuncio02=new Anuncio();
		Anuncio anuncio03=new Anuncio();
		Anuncio[] anuncios=new Anuncio[03];
		Anuncios anu=new Anuncios();
		int d1, m1,a1;
        int d2, m2,a2;
        double valor;
        double total_investimento1,total_investimento2,total_investimento3;
        int resposta;
		Scanner ler = new Scanner(System.in);
		System.out.println("****************************************");
		System.out.println("CADASTRO PRIMEIRO ANUNCIO:");
		System.out.println("****************************************");
		
		System.out.print("Nome do anuncio:");
    	anuncio01.setNome(ler.next());
		System.out.print("Cliente do anuncio:");
		anuncio01.setCliente(ler.next());    	
		System.out.print("Informe o dia inicial:");
        d1 = ler.nextInt();
        System.out.print("Informe o mês inicial:");
        m1 = ler.nextInt();
        System.out.print("Informe o ano inicial:");
        a1 = ler.nextInt();
        LocalDate dt1 = LocalDate.of(a1, m1, d1);        
        anuncio01.setData_de_início(dt1);             
        System.out.println("Data do final do anuncio:");
        System.out.print("Informe o dia Final:");
        d2 = ler.nextInt();
        System.out.print("Informe o mês Final:");
        m2 = ler.nextInt();
        System.out.print("Informe o ano Final:");
        a2 = ler.nextInt();
        LocalDate dt2 = LocalDate.of(a2, m2, d2);        
        anuncio01.setData_de_termino(dt2);            
        System.out.print("Por favor, digite o valor do investimento diário:");
        valor = ler.nextDouble(); 
        anuncio01.setInvestimento(valor);
        total_investimento1=valor * anuncio01.intervalo(dt1, dt2);
        anuncio01.setTotal_investimento(total_investimento1);
        anuncio01.calcularTotais(total_investimento1);
       
          
        System.out.println("****************************************");
        System.out.println("CADASTRO SEGUNDO ANUNCIO:");
        System.out.println("****************************************");

        System.out.print("Nome do anuncio:");
    	anuncio02.setNome(ler.next());
		System.out.print("Cliente do anuncio:");
		anuncio02.setCliente(ler.next());    	
		System.out.print("Informe o dia inicial:");
        d1 = ler.nextInt();
        System.out.print("Informe o mês inicial:");
        m1 = ler.nextInt();
        System.out.print("Informe o ano inicial:");
        a1 = ler.nextInt();
        LocalDate dt3 = LocalDate.of(a1, m1, d1);        
        anuncio02.setData_de_início(dt3);             
        System.out.println("Data do final do anuncio:");
        System.out.print("Informe o dia Final:");
        d2 = ler.nextInt();
        System.out.print("Informe o mês Final:");
        m2 = ler.nextInt();
        System.out.print("Informe o ano Final:");
        a2 = ler.nextInt();
        LocalDate dt4 = LocalDate.of(a2, m2, d2);        
        anuncio02.setData_de_termino(dt4);            
        System.out.print("Por favor, digite o valor do investimento diário:");
        valor = ler.nextDouble(); 
        total_investimento2=valor * anuncio02.intervalo(dt1, dt2); 
        anuncio02.setTotal_investimento(total_investimento2);
        anuncio01.calcularTotais(total_investimento2);
        
        System.out.println("****************************************");
        System.out.println("CADASTRO TERCEIRO ANUNCIO:");
        System.out.println("****************************************");
        
        System.out.print("Nome do anuncio:");
    	anuncio03.setNome(ler.next());
		System.out.print("Cliente do anuncio:");
		anuncio03.setCliente(ler.next());    	
		System.out.print("Informe o dia inicial:");
        d1 = ler.nextInt();
        System.out.print("Informe o mês inicial:");
        m1 = ler.nextInt();
        System.out.print("Informe o ano inicial:");
        a1 = ler.nextInt();
        LocalDate dt5 = LocalDate.of(a1, m1, d1);
        anuncio03.setData_de_início(dt5);             
        System.out.println("Data do final do anuncio:");
        System.out.print("Informe o dia Final:");
        d2 = ler.nextInt();
        System.out.print("Informe o mês Final:");
        m2 = ler.nextInt();
        System.out.print("Informe o ano Final:");
        a2 = ler.nextInt();
        LocalDate dt6 = LocalDate.of(a2, m2, d2);        
        anuncio03.setData_de_termino(dt6);            
        System.out.print("Por favor, digite o valor do investimento diário:");
        valor = ler.nextDouble(); 
        total_investimento3=valor * anuncio03.intervalo(dt5, dt6);
        anuncio03.setTotal_investimento(total_investimento3);
        anuncio03.calcularTotais(total_investimento3);
        
        anuncios[0]=anuncio01;
        anuncios[1]=anuncio02;
        anuncios[2]=anuncio03;
        anu.setAnuncios(anuncios);
        
        System.out.println("Digite 1 para relatorio geral ");
        System.out.println("Digite 2 para relatorio por cliente ");       
        System.out.println("Digite 3 para relatorio por tempo ");
        System.out.print("resposta: ");
        resposta = ler.nextInt(); 
        if(resposta==1) {
        	anu.imprimirRelatorio();
        }else if(resposta==2) {
        	System.out.println("Digite o nome do cliente para gerar relatorio: ");
        	String nome = ler.next();
        	anu.imprimirRelatorio(nome);
        }else if(resposta==3) {
        	System.out.println("Digite o ano inicial desejado: ");
        	int ano1 = ler.nextInt();
        	System.out.println("Digite o ano final desejado: ");
        	int ano2 = ler.nextInt();
        	anu.imprimirRelatorio(ano1,ano2);
        }else {
          System.out.println("Opção invalida !!!");
        }
        
        
	}

}
