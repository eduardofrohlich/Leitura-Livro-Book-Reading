package leitura;
public class ReadingProject {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        Readers[] r = new Readers[2];
        
         r[0] = new Readers("Eduardo",18,"M");
         r[1] = new Readers("Maria", 19, "F");

        b[0] = new Book("Book one", "Jose da Silva", 300, r[0]);
        b[1] = new Book("Book two", "Orivaldo Silveira", 150, r[1]);
        b[2] = new Book("Book three", "Julio Verne",170, r[1]);
        
        b[0].open();
        b[0].flip(300);
        b[0].previousPage();
        
        b[1].open();
        b[1].flip( 57);
        
        r[1].birthday();
        
        System.out.println(b[0].details());
        System.out.println(b[1].details());
        System.out.println(b[2].details());
    }
}