package example.project.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.project.backend.entity.Note;

@Repository
public interface NotesRepository extends CrudRepository<Note, Long> {
}
