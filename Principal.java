import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;

import javax.swing.JFrame;

class Principal implements GLEventListener{

    private int quantidadeRetangulo;
    private int quantidadeCircunferencia;

    public Principal(int quantidadeRetangulo, int quantidadeCircunferencia){
        this.quantidadeRetangulo = quantidadeRetangulo;
        this.quantidadeCircunferencia = quantidadeCircunferencia;
    }

    @Override
    public void display(GLAutoDrawable drawable){
        final GL2 gl = drawable.getGL().getGL2();

        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f();
        gl.glVertex2f();
        gl.glEnd();
    }

    @Override
    public void dispose(GLAutoDrawable drawable){

    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int w, int h){

    }

    @Override
    public void init(GLAutoDrawable drawable){

    }

    public static void main(String[] args){

        //gerando um objeto da GLprofile GL2
        final GLProfile profile = GLProfile.get(GLProfile.GL2);

        //instanciando capacidades GL
        GLCapabilities capabilities = new GLCapabilities(profile);

        //instanciando telas GL
        final GLCanvas glcanvas = new GLCanvas(capabilities);

        //instanciando um frame e criando seu tamanho
        Retangulo retangulo = new Retangulo();
        Circunferencia circunferencia = new Circunferencia();
        glcanvas.addGLEventListener(retangulo);
        glcanvas.setSize(400, 400);

        //instanciando um FRAME no java swing
        final JFrame frame = new JFrame("Figura Geometrica");

        //Gerando o frame na tela  
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setViseble(true);
    }
}