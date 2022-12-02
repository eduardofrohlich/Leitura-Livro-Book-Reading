package leitura;
public class Leitura {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Eduardo",18,"M");
        p[1] = new Pessoa("Maria",19,"F");
        
        l[0] = new Livro("Livro um", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("Livro dois", "Orivaldo Silveira", 150, p[1]);
        l[2] = new Livro("Livro tres", "Paulo Guina",170, p[1]);
        
        l[0].abrir();
        //l[0].folhear(300);
        //l[0];
        l[0].voltarPag();
        
        l[1].abrir();
        l[1].folhear( 57);
        
        p[1].fazerAniver();
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}