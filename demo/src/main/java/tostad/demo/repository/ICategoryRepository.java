package tostad.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tostad.demo.entity.Category;

@Repository
public  interface ICategoryRepository extends JpaRepository<Category, Long> {
}
