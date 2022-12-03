package leitura;
public class Book implements BookInterface{
    private String title, author;
    private int totalPages, currentPage;
    private boolean open;
    private Readers reader;

    public Book(String title, String author, int totalPages, Readers reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.reader = reader;
        this.currentPage = 0;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public int gettotalPages() {
        return totalPages;
    }

    public void settotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getcurrentPage() {
        return currentPage;
    }

    public void setcurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isopen() {
        return open;
    }

    public void setopen(boolean open) {
        this.open = open;
    }

    public Readers getreader() {
        return reader;
    }

    public void setreader(Readers reader) {
        this.reader = reader;
    }
    
    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void flip(int page) {
        if(this.isopen()){
            if(page > this.totalPages){
            this.currentPage = 0;
            } else {
                this.currentPage = page;
             }
        } else{
            System.out.println("Can't flip through! The book is not open!");
        }
    }

    @Override
    public void nextPage() {
        if(this.getcurrentPage()<this.gettotalPages() && this.isopen()){
            this.setcurrentPage(this.getcurrentPage()+1);
        } else{
            System.out.println("--Unable to move page--");
        }
    }

    @Override
    public void previousPage() {
        if(this.getcurrentPage()>0 && this.isopen()){
            this.setcurrentPage(this.getcurrentPage()-1);
        }else{
            System.out.println("--Unable to return page--");
        }
    }

    public String details() {
        return "\nBook info{\n" + "* title=" + title + ", author=" + author + 
                "\n* totalPages=" + totalPages + ", currentPage=" + currentPage + 
                ", open=" + open + "\n* reader=" + reader.getName() + 
                ", age=" + reader.getAge()+ ", gender=" + reader.getGender()+'}';
    }
}