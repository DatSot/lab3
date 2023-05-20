package tostad.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tostad.demo.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
