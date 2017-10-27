package leidecoulomb;

/**
 *
 * @author InfoWay
 */
public class CargaDeUmaParticula extends LeiDECoulomb { //classe não abstrata (filha de LeiDECoulomb)
     //Atributos
    private double q1; // carga 1
    private double q2; // carga 2
    private double r; // distancia
    private double F; // força
     
    
    //METODOS
    // metodo que mostra a formula que está sendo utilizada para o calculo 
    public void motrarFormula(){
        System.out.println("\nFórmula: \n      F x r² \nQ = ---------- \n     K x |q2|");
        
        
    }
    // mtodo que mostra como o calculo foi realizado 
    public void mostrarDetalhes(){
        System.out.println("\nDetalhes: \n      (" + getF() + " x 10^" + getP3() + " N)"  + " x (" + getR()+ " m)²"
                + "\nQ = ---------------------------- = "+ getQ1() +" Coulomb"
                        + "\n    " + "(9 x 10^9 N.m²/C²) x (" + getQ2() + " C)" );
    }
    // sobrescrevendo o metodo abstrato mostrarValor()
    @Override
    public void mostrarValor() {
        System.out.println("\nCarga 2: " + getQ2()+ " x 10^" + getP2() + " Coulomb" + ""
                + "\nDistância: " + getR() + " metros" + ""
                        + "\nForça Eletrostática: " + getF() + " x 10^" + getP3() + " Newton");
    }

    // Metodos especiais
    public double getQ1() {
        return q1;
    }

    // fórmula da carga
    public void setQ1() {
        q1 = (getF()  * (getR() * getR()))/((getK() * getC()) * (getQ2() * getB()));
        System.out.println("\nA carga da partícula é igual a: " + q1 + " Coulomb");
    }

    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getF() {
        return F;
    }

    public void setF(double F) {
        this.F = F;
    }
    
    /**
     * @return the q2
     */
    public double getQ2() {
        return q2;
    }

    /**
     * @param q2 the q2 to set
     */
    public void setQ2(double q2) {
        this.q2 = q2;
    }

    
}
