public abstract class Entidade {

    protected int x, y ;
    protected boolean vivo ;

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public boolean isVivo() {
        return vivo;
    } 
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void mover(int novoX, int novoY) {

        if (novoX < 8 && novoY > -1) {

           this.x = novoX ;
           this.y = novoY ;
        }
    }

    public void elimina() {
        this.vivo = false ;
    }
}
