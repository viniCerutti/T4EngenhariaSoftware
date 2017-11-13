import java.text.DecimalFormat;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-dd58bc5-3568 modeling language!*/

// line 2 "model.ump"
// line 21 "model.ump"
// line 26 "model.ump"
public class Aluno {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Aluno Attributes
	private String nome;
	private String matricula;
	private float p1;
	private float p2;
	private float t;
	private float e;
	private float g2;
	private int faltas;
	private float g1;
	private GrauFinal resultado;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------

	public Aluno(String aNome, String aMatricula, float aP1, float aP2, float aT, float aE, int aFaltas, GrauFinal aResultado) {
		nome = aNome;
		matricula = aMatricula;
		p1 = aP1;
		p2 = aP2;
		t = aT;
		e = aE;
		faltas = aFaltas;
		resultado = aResultado;
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public void setNome(String aNome) {

		nome = aNome;

	}

	public void setMatricula(String aMatricula) {
		matricula = aMatricula;
	}

	public void setP1(float aP1) {
		p1 = aP1;
	}

	public void setP2(float aP2) {
		p2 = aP2;
	}

	public void setT(float aT) {
		t = aT;
	}

	public void setE(float aE) {
		e = aE;
	}

	public void setG2(float aG2) {
		DecimalFormat oneDForm = new DecimalFormat("#.#"); 

		g2 = Float.valueOf(oneDForm.format(aG2));
	}

	public void setFaltas(int aFaltas) {
		faltas = aFaltas;
	}

	public void setG1(float aG1) {
		DecimalFormat oneDForm = new DecimalFormat("#.#"); 
		g1 = Float.valueOf(oneDForm.format(aG1));
	}

	public void setResultado(GrauFinal aResultado) {

		resultado = aResultado;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public float getP1() {
		return p1;
	}

	public float getP2() {
		return p2;
	}

	public float getT() {
		return t;
	}

	public float getE() {
		return e;
	}

	public float getG2() {
		return g2;
	}

	public int getFaltas() {
		return faltas;
	}

	public float getG1() {
		return ((p1+p2+t+e)/4);
	}

	public GrauFinal getResultado() {
		return resultado;
	}

	public void delete() {
	}

	public String toString() {
		return super.toString() + "[" + "nome" + ":" + getNome() + "," + "matricula" + ":" + getMatricula() + "," + "p1"
				+ ":" + getP1() + "," + "p2" + ":" + getP2() + "," + "t" + ":" + getT() + "," + "e" + ":" + getE() + ","
				+ "g2" + ":" + getG2() + "," + "faltas" + ":" + getFaltas() + "," + "g1" + ":" + getG1() + "]"
				+ System.getProperties().getProperty("line.separator") + "  " + "resultado" + "="
				+ (getResultado() != null
						? !getResultado().equals(this) ? getResultado().toString().replaceAll("  ", "    ") : "this"
						: "null");
	}
}