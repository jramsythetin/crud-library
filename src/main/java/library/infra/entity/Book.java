package library.infra.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 250)
    private String name;
    @Column (name = "author", length = 250)
    private String author;
    @Column (name = "genre", length = 40)
    private String genre;
    @Column (name = "isbn", length = 14)
    private String isbn;
}
