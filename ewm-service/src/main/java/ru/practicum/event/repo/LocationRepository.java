package ru.practicum.event.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practicum.event.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
