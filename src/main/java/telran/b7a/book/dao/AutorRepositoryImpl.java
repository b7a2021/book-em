package telran.b7a.book.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.b7a.book.model.Author;

@Repository
public class AutorRepositoryImpl implements AuthorRepository {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Optional<Author> findById(String id) {
		return Optional.ofNullable(em.find(Author.class, id));
	}

	@Override
	public Author save(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Author author) {
		// TODO Auto-generated method stub

	}

}
