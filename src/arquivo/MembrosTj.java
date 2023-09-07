package arquivo;

public class MembrosTj {
	String matricula;
	String nome;
	String cargo;
	String funcao;
	String lotacao;
	String portaria;
	String publicacao;
	String vitalicio;

	//construtor padrão
	public MembrosTj() {}
	
	//construtor com todos os dados
	public MembrosTj(String matricula, String nome, String cargo, String funcao, String lotacao, String portaria,
			String publicacao, String vitalicio) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.funcao = funcao;
		this.lotacao = lotacao;
		this.portaria = portaria;
		this.publicacao = publicacao;
		this.vitalicio = vitalicio;
	} 
	/**
	 * construtor recebe um array de 8 posiçoes, um para cada dado
	 */
	public MembrosTj(String[] dados) {
		try {
			if (dados.length != 8) throw new LancaException("array incompatível");
			this.matricula = dados[0];
			this.nome = dados[1];
			this.cargo = dados[2];
			this.funcao = dados[3];
			this.lotacao = dados[4];
			this.portaria = dados[5];
			this.publicacao =dados[6];
			this.vitalicio = dados[7];
			
		} catch (Exception e) {
			System.out.println("Erro durante o mapeamento dos dados dos funcionários!");
			e.printStackTrace();
		}
		
		
	}

	public String getMatricula() {return matricula;	}

	public void setMatricula(String matricula) {this.matricula = matricula;	}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;	}

	public String getCargo() {return cargo;}

	public void setCargo(String cargo) { this.cargo = cargo;	}

	public String getFuncao() {	return funcao;}

	public void setFuncao(String funcao) {this.funcao = funcao;}

	public String getLotacao() {return lotacao;	}

	public void setLotacao(String lotacao) {this.lotacao = lotacao;	}

	public String getPortaria() {return portaria;}

	public void setPortaria(String portaria) {this.portaria = portaria;}

	public String getPublicacao() {	return publicacao;}

	public void setPublicacao(String publicacao) {	this.publicacao = publicacao;	}

	public String getVitalicio() {	return vitalicio;	}

	public void setVitalicio(String vitalicio) {this.vitalicio = vitalicio;	}

	@Override
	public String toString() {
		return "MembrosTj [matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo + ", funcao=" + funcao
				+ ", lotacao=" + lotacao + ", portaria=" + portaria + ", publicacao=" + publicacao + ", vitalicio="
				+ vitalicio + "]";
	}
	
	
	
	
}
