package leitura;
public interface InterfaceLivro {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pag); //folhear até uma determinada página;
    public abstract void avancarPag();
    public abstract void voltarPag();
}