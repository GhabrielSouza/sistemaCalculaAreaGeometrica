import com.jogamp.opengl.*;

class Circunferencia extends FiguraGeometrica2D{
    private float raio;

    public Circunferencia(Ponto2D pontos, float raio){
        super(pontos);
        this.raio = raio;
    }


    @Override
    public float calculaArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public void desenhar(final GL2 gl){
        
    }
}