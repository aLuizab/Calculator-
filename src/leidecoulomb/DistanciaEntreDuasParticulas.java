package leidecoulomb;


import static java.lang.Math.sqrt; // inportanto linguagem matematica (raiz quadrada)

/**
 *
 * @author InfoWay
 */
public class DistanciaEntreDuasParticulas extends LeiDECoulomb{ //classe não abstrata (filha de LeiDECoulomb)
   
    //Atributos de DistanciaEntreDuasParticulas
    private double q1; // carga 1
    private double q2; // carga 2
    private double r; // distancia
    private double F; // força
   
    
    //METODOS
    // metodo que mostra a formula que está sendo utilizada para o calculo 
    public void motrarFormula(){
        System.out.println("\nFórmula: \n         K x |q1| x |q2| \n"
                + "R = sqrt --------------- \n                F");
        
        
    }
    // mtodo que mostra como o calculo foi realizado 
    public void mostrarDetalhes(){
        System.out.println("\nDetalhes: \n         (9 x 10^9 N.m²/C²) x (" + getQ1()+ " C) x " + "(" + getQ2()+ " C)"
                + "\nR = sqrt -------------------------------------- = "+ getR() +" Metros\n                       " 
                + getF() + " x 10^" + getP3() + " N" );
    }
    
    @Override
    public void mostrarValor() {
        System.out.println("\nCarga 1: " + getQ1()+ " x 10^" + getP1() + " Coulomb" + "\nCarga 2: " 
                + getQ2() + " x 10^" + getP2() + " Coulomb" + "\nForça Eletrostática: " 
                + getF() + " x 10^" + getP3() +" Newton\nK = 9 x 10^9 N.m²/C²" );
    }
    
    // maeodos especiais 
    
    public double getQ1() {
        return q1;
    }

    
    public void setQ1(double q1) {
        this.q1 = q1;
    }

    
   
    public double getR() {
        return r;
    }

    //Fórmula para calcular a distancia entre as particulas 
    public void setR() {
        r = (double) sqrt(((getK() * getC()) * (getQ1() * getA()) * (getQ2() * getB()))/ (getF() * getP3())); 
        System.out.println("\nA distância entre as partículas é: " + r + " metros");
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
