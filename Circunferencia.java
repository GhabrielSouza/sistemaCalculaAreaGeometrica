class Circunferencia extends FiguraGeometrica2D{
    private float raio;

    public Circunferencia(Ponto2D ponto, float raio){
        super(ponto);
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