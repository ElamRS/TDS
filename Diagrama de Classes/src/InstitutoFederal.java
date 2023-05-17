import java.util.ArrayList;

public class InstitutoFederal {
	private String campus;
	private String endereco;
	private ArrayList<Departamento> depts = new ArrayList<Departamento> ();
	
	public InstitutoFederal(String campus, String endereco) {
		this.campus = campus;
		this.endereco = endereco;
		
		Departamento elo = new Departamento("Elética", 2);
		depts.add(elo);
		
		Departamento dti = new Departamento("Informática e Turismo", 1);
		depts.add(dti);
		
		Departamento civil = new Departamento("Engenharia Civil", 3);
		depts.add(civil);
	}
	
	public String getCampus() {
		return this.campus;
	}
	
	public void setCampus(String campus) {
		this.campus = campus;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public ArrayList<Departamento> getDepartamentos() {
		return this.depts;
	}
	
	public void setDepartamentos(ArrayList<Departamento> depts) {
		this.depts.addAll(depts);
	}
	
	// ToString
	// TODO
	
	// Equals
	// TODO
	
	// HashCode
	// TODO
}
