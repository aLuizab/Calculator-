package leidecoulomb;

/**
 *
 * @author InfoWay
 */
public class ForcaEletrostatica extends LeiDECoulomb{ //classe não abstrata (filha de LeiDECoulomb)
    // atributos
    private double q1; // carga 1
    private double q2; // carga 2
    private double r; // distancia
    private double F; // força
      
   
    
    //  METODOS
    // metodo que mostra a formula que está sendo utilizada para o calculo 
    public void motrarFormula(){
        System.out.println("\nFórmula: \n     K x |q1| x |q2| "
                + "\nF = ----------------- " // traço divisor 
                + "\n           r²"); 
        
        
    }
    // mtodo que mostra como o calculo foi realizado 
    public void mostrarDetalhes(){
        System.out.println("\nDetalhes: \n"
                + "    (9,0 x 10^9 N.m²/C²)"  + " x " // F = K x
                + "(" + getQ1() + " x 10^" + getP1() + " C)" + " x "  // q1 x
                        + "(" + getQ2() + " x 10^" + getP2() + " C)" // q2 x
                                   + "\nF = -------------------------------------------------------- = " + getF() + " Newton\n"  // traço divisor 
                                   + "                           (" + getR() + " m)²"); // r²
    }
 
    @Override
    public void mostrarValor() {
        System.out.println("\nDados: \nCarga 1: " + getQ1()+ " x 10^" + getP1()+ " Coulomb"   
                + "\nCarga 2: " + getQ2()+ " x 10^" + getP2() + " Coulomb" 
                        + "\nDistância: " + getR() + " metros" 
                                + "\nK = 9 x 10^9 N.m²/C²");
    }
    
      
   
      
    // Métodos Especiais 
    
    public double getF() {
        return F;
    }

    // Equação para o Cálculo da Força Eletrostática
    public void setF() {
        F =  (double) (((getK() * getC()) * (getQ1()* getA()) * ((getQ2() * getB())))/(getR() * getR())); 
        System.out.println("\nA força eletrostática é igual a: " + F + " Newton");
    }

    public double getQ1() {
        return q1;
    }

    public void setQ1(double q1) {
        this.q1 = q1;
    }

    
    public double getR() {
        return r;
    }

  
    public void setR(double r) {
        this.r = r;
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
