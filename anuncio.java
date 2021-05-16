package capgemini;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Anuncio {
	private String nome;
	private String cliente;
	private LocalDate data_de_início;
	private LocalDate data_de_termino;
	private double investimento;
	private double total_investimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public LocalDate getData_de_início() {
		return data_de_início;
	}
	public void setData_de_início(LocalDate data_de_início) {
		this.data_de_início = data_de_início;
	}
	public LocalDate getData_de_termino() {
		return data_de_termino;
	}
	public void setData_de_termino(LocalDate data_de_termino) {
		this.data_de_termino = data_de_termino;
	}
	public double getInvestimento() {
		return investimento;
	}
	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}
	
	public double getTotal_investimento() {
		return total_investimento;
	}
	public void setTotal_investimento(double total_investimento) {
		this.total_investimento = total_investimento;
	}
	public int intervalo(LocalDate dt1, LocalDate dt2) {
    	long dias = ChronoUnit.DAYS.between(dt2, dt1)*(-1);
        int diferencaEmDias=(int) dias;
        return diferencaEmDias;
	}
   public void calcularTotais(double total_investimento) {
    	
	    double total_visualizacao=total_investimento*30; 
	    double total_cliques=(total_visualizacao*12)/100;		    
	    double total_compartilhados=((total_cliques*15)/100)*40;
	    double total_pessoas=total_visualizacao+total_compartilhados;    		    
        System.out.println("Valor total do investimento: "+ total_investimento);
        System.out.println("Quantidade maxima de Visualizações: "+Math.ceil(total_visualizacao));
        System.out.println("Quantidade maxima de Cliques: " + total_cliques);
        System.out.println("Quantidade maxima de Compartilhamentos: "+Math.ceil(total_compartilhados));
        System.out.println("Total maximo de pessoas que visualizarão: "+Math.ceil(total_pessoas));
        
        System.out.println("*************************************");
        
    }
}
