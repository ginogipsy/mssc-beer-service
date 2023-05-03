package ginogipsy.springframework.msscbeerservice.repositories;

import ginogipsy.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by ginogipsy on 2023-03-29
 */

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
