package telran.b7a.book.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"isbn"})
@Entity
public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3616033536526076604L;
	
	@Id
	String isbn;
	String title;
	@ManyToMany
	@JoinTable(
				name = "BOOK_AUTHORS",
				joinColumns = @JoinColumn(name = "BOOK_ISBN"),
				inverseJoinColumns = @JoinColumn(name = "AUTHORS_NAME")
			)
	Set<Author> authors;
	@ManyToOne
	Publisher publisher;

}