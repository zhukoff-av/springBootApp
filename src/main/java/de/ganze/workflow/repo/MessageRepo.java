package de.ganze.workflow.repo;

import de.ganze.workflow.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

  List<Message> findByTag(String tag);

}
