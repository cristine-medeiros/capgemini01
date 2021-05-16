package capgemini;

public class Anuncios {
	private Anuncio[] anuncios;

	public Anuncio[] getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(Anuncio[] anuncios) {
		this.anuncios = anuncios;
	}
	
	public void imprimirRelatorio() {
		for(int i=0;i<3;i++) {
			System.out.println("nome do an�ncio: " + anuncios[i].getNome());
			System.out.println("Cliente: " + anuncios[i].getCliente());
			System.out.println("Data de in�cio: " + anuncios[i].getData_de_in�cio());
			System.out.println("Data de t�rmino: " + anuncios[i].getData_de_termino());
			System.out.println("Valor total do investimento: " + anuncios[i].getTotal_investimento());
		}
	}	
	public void imprimirRelatorio(String nome) {
		for(int i=0;i<3;i++) {
		  if(nome.equals(anuncios[i].getCliente())) {
			System.out.println("nome do an�ncio: " + anuncios[i].getNome());
			System.out.println("Cliente: " + anuncios[i].getCliente());
			System.out.println("Data de in�cio: " + anuncios[i].getData_de_in�cio());
			System.out.println("Data de t�rmino: " + anuncios[i].getData_de_termino());
			System.out.println("Valor total do investimento: " + anuncios[i].getTotal_investimento());
			}
		  }
	}
	public void imprimirRelatorio(int ano1, int ano2) {
		for(int i=0;i<3;i++) {
			int a1=anuncios[i].getData_de_in�cio().getYear();
			int a2=anuncios[i].getData_de_termino().getYear();
		  
			if(a1>=ano1 && a2<=ano2) {
			System.out.println("nome do an�ncio: " + anuncios[i].getNome());
			System.out.println("Cliente: " + anuncios[i].getCliente());
			System.out.println("Data de in�cio: " + anuncios[i].getData_de_in�cio());
			System.out.println("Data de t�rmino: " + anuncios[i].getData_de_termino());
			System.out.println("Valor total do investimento: " + anuncios[i].getTotal_investimento());
			}
			
		  }
		  
	}
	
}
