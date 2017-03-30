package entidade;

public class Funcionario {
	
	
        private String nome;
        private  String departamento;
        private double salario;
        private String dataEntrada;
        private String rg;
        private Data data;
        
        

        public Funcionario() {
			super();
		}
		public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg, Data data) {
			super();
			this.nome = nome;
			this.departamento = departamento;
			this.salario = salario;
			this.dataEntrada = dataEntrada;
			this.rg = rg;
			this.data = data;
		}
		public Data getData() {
			return data;
		}
		public void setData(Data data) {
			this.data = data;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public String getDataEntrada() {
			return dataEntrada;
		}
		public void setDataEntrada(String dataEntrada) {
			this.dataEntrada = dataEntrada;
		}
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		
		
		public void recebeAumento(double valor){
            this.salario += valor;
        }
		
        public double calculaGanhoAnual(){
            return this.salario * 12;
        }
        
        @Override
		public String toString() {
			return "Funcionario [nome=" + nome + ", departamento=" + departamento + ", salario=" + salario
					+ ", dataEntrada=" + dataEntrada + ", rg=" + rg + "]";
		}
		
        public void mostra(){
        	
        	System.out.println("Nome: "+this.nome);    
            System.out.println("Salario: R$  "+this.salario);	
        	System.out.println("Departamento: "+this.departamento);
        	System.out.println("RG: "+this.rg);
        	System.out.println("Ganho Anual: R$ "+this.calculaGanhoAnual());
        	
        	
        }
        
    }


