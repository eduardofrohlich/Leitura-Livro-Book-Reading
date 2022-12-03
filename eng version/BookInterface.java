package leitura;
public interface BookInterface {
    public abstract void open();
    public abstract void close();
    public abstract void flip(int page); //folhear até uma determinada página;
    public abstract void nextPage();
    public abstract void previousPage();
}