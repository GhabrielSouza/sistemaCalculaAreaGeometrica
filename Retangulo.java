import java.util.List;
import java.util.ArrayList;

class Retangulo extends FiguraGeometrica2D {
    public Retangulo(List<Ponto2D> pontos) {
        super(pontos);
    }

    @Override
    public float calculaArea() {
        List<Ponto2D> pontos = getPontos();

        
        int maiorX = Integer.MIN_VALUE;
        int menorX = Integer.MAX_VALUE;
        int maiorY = Integer.MIN_VALUE;
        int menorY = Integer.MAX_VALUE;

        for (Ponto2D ponto : pontos) {
            int x = ponto.getX();
            int y = ponto.getY();

            if (x > maiorX) {
                maiorX = x;
            }
            if (y > maiorY) {
                maiorY = y;
            }
            if (x < menorX) {
                menorX = x;
            }
            if (y < menorY) {
                menorY = y;
            }
        }

        int base = Math.abs(maiorX - menorX);
        int altura = Math.abs(maiorY - menorY);

        return base * altura;
    }

    @Override
    public void desenhar(final GL2 gl){
        
    }
}