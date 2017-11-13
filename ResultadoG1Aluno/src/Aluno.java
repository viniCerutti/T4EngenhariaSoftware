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
	/*@
	 @ private invariant p1 >= 0 && p1 <= 10;
	 @ private invariant p2 >= 0 && p2 <= 10;
	 @ private invariant t >= 0 && t <= 10;
	 @ private invariant e >= 0 && e <= 10;
	 @ private invariant g1 >= 0 && g1 <= 10;
	 @ private invariant g2 >= 0 && g2 <= 10;
	 @
	 @ private invariant faltas>= 0 && faltas <= 60;
	 @*/
	
	/*@
	 @ requires aNome.contains(" ") && aNome.length() >=5 && aNome.length() <= 36;
	 @ requires aMatricula.length() == 8;
	 @*/
	public Aluno(String aNome, String aMatricula, float aP1, float aP2, float aT, float aE, int aFaltas) {
		aNome.length();
		nome = aNome;
		matricula = aMatricula;
		p1 = aP1;
		p2 = aP2;
		t = aT;
		e = aE;
		faltas = aFaltas;
		resultado = GrauFinal.REP;
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

	public /*@ pure helper @*/ void setP1(float aP1) {
		p1 = aP1;
	}

	public /*@ pure helper @*/ void setP2(float aP2) {
		p2 = aP2;
	}

	public /*@ pure helper @*/ void setT(float aT) {
		t = aT;
	}

	public /*@ pure helper @*/ void setE(float aE) {
		e = aE;
	}

	public /*@ pure helper @*/ void setG2(float aG2) {
		DecimalFormat oneDForm = new DecimalFormat("#.#"); 

		g2 = Float.valueOf(oneDForm.format(aG2));
	}

	public /*@ pure helper @*/ void setFaltas(int aFaltas) {
		faltas = aFaltas;
	}

	public /*@ pure helper @*/  void setG1(float aG1) {
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

	public /*@ pure helper @*/  float getP1() {
		return p1;
	}

	public /*@ pure helper @*/ float  getP2() {
		return p2;
	}

	public /*@ pure helper @*/ float getT() {
		return t;
	}

	public /*@ pure helper @*/ float getE() {
		return e;
	}

	public /*@ pure helper @*/ float getG2() {
		return g2;
	}

	public /*@ pure helper @*/ int getFaltas() {
		return faltas;
	}
	
	/*@
	 @ ensures \result == ((getP1()+getP2()+getT()+getE())/4); 
	 @*/
	public float getG1() {
		return ((p1+p2+t+e)/4);
	}
	/*@
	 @ ensures (getFaltas() > 15) ==> \result.equals(GrauFinal.REP);
	 @ ensures (getG1() >= 7.0) ==> \result.equals(GrauFinal.APR);
	 @ ensures (getG1() < 4.0) ==> \result.equals(GrauFinal.REP);
	 @ ensures ((getG1()+getG2()) >= 5.0) ==> \result.equals(GrauFinal.APR);
	 @ ensures \result.equals(GrauFinal.REP);
	 @*/
	public GrauFinal getResultado() {
		if(faltas > 15) { resultado = GrauFinal.REP;}
		else if(g1 >= 7.0) {resultado = GrauFinal.APR;}
		else if (g1 < 4.0) {resultado = GrauFinal.REP;}
		else if (g1 + g2 >= 5.0) {resultado = GrauFinal.APR;}
		else resultado = GrauFinal.REP;
		return resultado;
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