package library.infra.repository;

import library.infra.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository <Book, Long> {

    boolean existsByName(String name);
}
