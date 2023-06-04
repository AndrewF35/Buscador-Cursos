package Data;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Plano {
    private JPanel p;
    private int w;
    private int h;
    private int escala=10;
    
    public Plano(JPanel p,int escala) {
        this.escala=escala;
        this.p=p;
        w=p.getWidth();
        h=p.getHeight();
    }
    
    public void dibujar(){        
        Graphics2D g=(Graphics2D) p.getGraphics();        
        g.clearRect(0, 0, w, h);
        int x2=w/2;
        for(int x=w/2;x<w;x+=escala){
            g.drawLine(x, 0, x,h);
            g.drawLine(x2, 0, x2,h);
            x2=x2-escala;
        }
        int y2=h/2;
        for(int y=h/2;y<h;y+=escala){
            g.drawLine(0, y, w,y);
            g.drawLine(0, y2, w,y2);
            y2=y2-escala;
        }
        g.setColor(Color.red);
        g.drawLine(w/2, 0, w/2,h);
        g.drawLine(0, h/2, w,h/2);          
    }
    
    public void dibujarPunto(float x, float y){
        Graphics2D g=(Graphics2D) p.getGraphics(); 
        int xDigital=(int) (w/2+x*escala);
        int yDigital=(int) (h/2-y*escala);
        g.fillOval(xDigital-3, yDigital-3, 6, 6);
    }
    

}
