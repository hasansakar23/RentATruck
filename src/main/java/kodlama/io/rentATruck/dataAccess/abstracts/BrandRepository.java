package kodlama.io.rentATruck.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.rentATruck.entities.concretes.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer>  {

}
