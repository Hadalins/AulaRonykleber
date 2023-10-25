import javax.swing.SingleSelectionModel;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaJuridica pj =  new PessoaJuridica();
		
		pj.setNome("Hadames");
		System.out.println(pj.getNome());
		
		pj.setId(50);
		System.out.println("O ID do CLiente é: " + pj.getId());
		
	    pj.setCnpj("55.654.789/0001-56");
	    System.out.println("CNPJ: " +  pj.getCnpj());
	    
	    pj.setRazaoSocial("Nome da Empresa: " + "Insinuante");
	    System.out.println(pj.getRazaoSocial());
	    
	    pj.setRenda(5000);
	    System.out.println("IR: " + pj.getRenda());
	    
	    pj.setInsccmunicipal("456879");
	    System.out.println("Inscrissão Municipal N: " + pj.getInsccmunicipal());
	    
	    pj.setInscEstadual("321654789-45");
	    System.out.println("inscrição estadual N: " + pj.getInscEstadual());
	    
	    pj.setCapitalSocial(60000);
	    System.out.println("Capital" + pj.getCapitalSocial());
	}

}
