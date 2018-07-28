public class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "title1";
        myBooks[1].title = "title2";
        myBooks[2].title = "title3";
        myBooks[0].author = "author1";
        myBooks[1].author = "author2";
        myBooks[2].author = "author3";
        for (int x = 0; x < 3; x++) {
            System.out.println(myBooks[x].title + " by " + myBooks[x].author);
        }
    }
}