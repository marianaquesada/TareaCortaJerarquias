public class Circulo extends Figura implements Comparable<Circulo>{
    private double radio;
    int lados;

    public Circulo(double pRadio){
        radio = pRadio;
        lados=0;
    }
    public double calcularArea(){//hereda metodo abstracto de figura
        return 3.14 * radio*radio;
    }
    public int numeroLados(){
        return lados;
    }
    @Override
    public int compareTo(Circulo otro){
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