package Ejemplo2;

public class Motocicleta implements Vehiculo{
    private int centimentosCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimentosCubicos, String marca) {
        this.centimentosCubicos = centimentosCubicos;
        this.marca = marca;
    }

    public int getCentimentosCubicos() {
        return centimentosCubicos;
    }

    public void setCentimentosCubicos(int centimentosCubicos) {
        this.centimentosCubicos = centimentosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimentosCubicos=" + centimentosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo un caballito para romperme un hueso");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca: " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta marca: " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de " + this.centimentosCubicos + "cc");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando con la motocicleta de " + this.centimentosCubicos + "cc");
    }
}
