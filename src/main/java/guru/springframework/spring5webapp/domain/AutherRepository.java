package guru.springframework.spring5webapp.domain;

import org.springframework.data.repository.CrudRepository;

public interface AutherRepository extends CrudRepository<Author, Long> {
}