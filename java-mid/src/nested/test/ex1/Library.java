package nested.test.ex1;

public class Library {

    private int size;
    private Book[] books;

    public Library(int size) {
        this.size = 0;
        this.books = new Book[size];
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 == ");
        for (int i = 0; i < size; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    public void addBook(String title, String author) {
        // 검증 로직을 다 처리하고
        if(size >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        // 정상 로직을 처리
        books[size++] = new Book(title, author);
    }

     private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

     }
}
