package dbmsforeveread.foreveread.bookCategory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {
    void deleteAllByBookId(Long bookId);
}
