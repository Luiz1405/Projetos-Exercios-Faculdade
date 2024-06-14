public class Triangulo{
    private int ladoA, ladoB, ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public int getLadoA(){
        return ladoA;
    }

    public int setLadoA(int novoLadoA){
        this.ladoA = novoLadoA;
        return this.ladoA;
    }

    public int getLadoB(){
        return ladoB;
    }

    public void setLadoB(int novoLadoB){
        this.ladoB = novoLadoB;
    }

    public int getLadoC(){
        return ladoC;
    }

    public void setLadoC(int novoLadoC){
        this.ladoC = novoLadoC;
    }

    public void tipoTriangulo(Triangulo triangulo) {
        if(ladoA == ladoB && ladoA == ladoC) {
            System.out.println("É um triangulo equilátero.");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            System.out.println("É um triangulo isóceles.");
        } else {
            System.out.println("É um triangulo escaleno.");
        }
    }

    public void calculaArea(Triangulo triangulo){
        double area = 0.00;
        double p = 0.00;

        p = (ladoA + ladoB + ladoC) / 2;

        area = Math.sqrt((p*(p - ladoA)*(p - ladoB)*(p - ladoC)));

        System.out.println("A area do triangulo é : " + area);
    }

    public void calculaPerimetro(Triangulo triangulo){
        double p = 0.00;
        p = (ladoA + ladoB + ladoC) / 2;
        System.out.println("O valor do perimetro é: " + p);

    }

    


    

}