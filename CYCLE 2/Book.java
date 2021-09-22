class Book {
    int ISBN;
    String title;
    String author;
    int price;
    String Publisher;
    
    Book(){

    }

    Book(int isbn, String title, String author, int price, String publisher) {
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.Publisher = publisher;
    }

    public void display() {
        System.out.print(this.ISBN + "\t");
        System.out.print(this.title + "\t");
        System.out.print(this.author + "\t");
        System.out.print(this.price + "\t");
        System.out.print(this.Publisher + "\t");
        System.out.println();
    }

    public static void main(String []args){
        Book books[] = new Book[5];
        books[0] =new Book(1,"Artist","Soma",115,"Amma");
        books[1] =new Book(2,"Brusley","Daisy",120,"Amma");
        books[2] =new Book(3,"Alevlo","Flaura",130,"Amma");
        books[3] =new Book(4,"Emperor","Ambani",140,"Amma");
        books[4] =new Book(5,"Deja","Geetha",150,"Amma");

        int size = 5;  
        for(int i = 0; i<size-1; i++) { 
            for (int j = i+1; j<size; j++) { 
                if(books[i].title.compareTo(books[j].title)>0) {   
                    Book temp = books[i];  
                    books[i] = books[j];  
                    books[j] = temp;  
                }  
            }  
        }  

        for(int i=0;i<5;i++){
            books[i].display();
        }
    }
}
