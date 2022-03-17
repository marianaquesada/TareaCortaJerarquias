public class Rectangulo <T extends Figura>  implements Comparable<T>{
    private double base;
    private double altura;
    int lados;
    
    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
        lados=4;
        }

    public double calcularArea(){//hereda metodo abstracto de figura
        return base * altura;
        }
    
    public int numeroLados(){
        return lados;
    }
     
    @Override
    public int compareTo(T otro ) {
        double areaPorComparar = otro.calcularArea();
        double miArea = this.calcularArea();
        int ladosComparar=otro.numeroLados();
        if(miArea==areaPorComparar){
            System.out.println(0);
            System.out.println("Comparacion de lados:");

            if(ladosComparar==this.lados){
                return 0;
            }
            else if (this.lados > ladosComparar){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }

}
