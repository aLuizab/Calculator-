
package leidecoulomb;

 

/**
 *
 * @author InfoWay
 */
public abstract class LeiDECoulomb { //classe abstrata (mãe)
    
    //Atributos de Lei de Coulomb
    private  float  k;  // variável da constante eletrostatica
    private int p1; // variavel do expoente da carga 1
    private int p2; // variavel do expoente da carga 2
    private int p3; // variavel do expoente da força
    private double a; // variavel da portencia da carga 1 
    private double b; // variavel da portencia da carga 2
    private int c; // variavel da portencia da constante eletrostática K
    private double d; // variavel da portencia da força
       
    
    // Calcula as potencias de base 10 inseridas 
    public void calcularPotencia(){ 
        setA(Math.pow(10, getP1())); 
        setB(Math.pow(10, getP2()));
        setC((int) Math.pow(10, 9));
        setD(Math.pow(10, getP3()));
       
       
    }
     
   // metodo abstrato  
    public void mostrarValor(){
        
    }

        
     // metodos especiais     
    /**
     * @return the p1
     */
    public int getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(int p1) {
        this.p1 = p1;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the p2
     */
    public int getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(int p2) {
        this.p2 = p2;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @return the p3
     */
    public int getP3() {
        return p3;
    }

    /**
     * @param p3 the p3 to set
     */
    public void setP3(int p3) {
        this.p3 = p3;
    }

    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }

    // Métodos Especiais
    public float  getK() {
        return k;
    }

    
    public void setK(float  k) {
        this.k = (k);
    }
    
    
    
   
    
   }