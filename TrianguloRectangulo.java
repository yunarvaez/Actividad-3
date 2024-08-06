package PruebaFiguras;

public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        double area;
        area = (base * altura) / 2.0;
        return area;
    }

    double calcularPerimetro(){
        return (base + altura + calcularHipotenusa());
    }


    double calcularHipotenusa(){
        return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }

    void determinarTipoTriangulo(){
        if (base == altura && base == calcularHipotenusa()){
            System.out.println("Es un triángulo equilátero.");
        } else if (base != altura && base != calcularHipotenusa()) {
            System.out.println("Es un triángulo escaleno.");
        } else{
            System.out.println("Es un triángulo isósceles.");
        }
    }
}
