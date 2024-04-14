package springProj.nutrDB.data.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import springProj.nutrDB.data.entities.FoodEntity;


/**
 *
 */
public interface FoodRepository extends CrudRepository<FoodEntity, Long>, PagingAndSortingRepository<FoodEntity, Long> {

    // This performs the LIMIT OFFSET pagination (drifting possible, so the user may miss entries when paging)
    // https://www.youtube.com/watch?v=zwDIN04lIpc
    // The alternative (pivot based pagination) is more complicated, plus instead of drifting there is no way to directly address a page (no skipping between pages).

    // … where x.name like ?1 (parameter bound wrapped in %)
    Page<FoodEntity> findByNameContaining(String name, Pageable pageable);
}
