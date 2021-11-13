package tech.stenger.toolinventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import tech.stenger.toolinventory.enumeration.Type;
import tech.stenger.toolinventory.model.XTool;

import java.util.List;
import java.util.Optional;

public interface XToolRepo extends JpaRepository<XTool,Long> {
    @Transactional
    void deleteXToolById(long id);

    Optional<XTool> findXToolById(long pId);

    Optional<List<XTool>> findXToolByType(Type type);
}
