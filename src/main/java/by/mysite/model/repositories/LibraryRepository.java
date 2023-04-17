package by.mysite.model.repositories;

import by.mysite.model.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional //для hibernate
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
