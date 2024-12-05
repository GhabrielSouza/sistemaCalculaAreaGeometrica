import java.util.List;
import java.util.ArrayList;

abstract class FiguraGeometrica2D implements IAritmeticaGeometica2D{
    private List<Ponto2D> pontos;

    public FiguraGeometrica2D(List<Ponto2D> pontos){
        this.pontos = new ArrayList<>();
        this.pontos.add(ponto);
    }

    public FiguraGeometrica2D(List<Ponto2D> pontos){
        this.pontos = pontos;
    }

     public List<Ponto2D> getPontos() {
        return pontos;
    }

    public abstract float calculaArea();

    public abstract void desenhar(final GL2 gl); 

    public void imprimirCalculaArea(float calculaArea){

    }
}