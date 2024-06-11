package nested.test.ex1;

public class Library {

    private int number;
    private Book book;
    private String author;

    public Library(int number) {
        this.number = number;
        this.book = new Book();
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 == ");
        System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
    }

    public void addBook(String book, String author) {
//        class Book{
//            public String title;
//            public String author;
//
//            String[] books;
//        }
        Book[] books;

        for (int i = 0; i < number; i++) {
            books = new Book[number];
            books[i].title = book;
            books[i].author = book;

            if (number) {
                System.out.println("도서관 저장 공간이 부족합니다.");
            }
        }
    }

     class Book{
        private String title;
        private String author;

    }
}
