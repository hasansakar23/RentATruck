package kodlama.io.rentATruck.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentATruck.business.abstracts.BrandService;
import kodlama.io.rentATruck.business.requests.CreateBrandRequest;
import kodlama.io.rentATruck.business.responds.GetAllBrandsResponse;
import kodlama.io.rentATruck.core.utilities.mapping.ModelMapperService;
import kodlama.io.rentATruck.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentATruck.entities.concretes.Brand;


@Service
public class BrandManager implements BrandService{
  private BrandRepository brandRepository;
  private ModelMapperService modelMapperService;
@Autowired
public BrandManager(BrandRepository brandRepository) {
	this.brandRepository = brandRepository;
}
@Override
// Burada Brand değil de GetAllBrandsResponse yazmamızın sebebi
// Branddeki özel nesnelri usera açmamak
// Biz cevap verirken --> Response
public List<GetAllBrandsResponse> getAll() {
		
	List<Brand> brands = brandRepository.findAll() ;

	
	GetAllBrandsResponse getAllBrandsResponse = this.modelMapperService.forResponse().map(brands, GetAllBrandsResponse.class);
	// TODO Auto-generated method stub
	return  getAllBrandsResponse;
}
@Override
public void add(CreateBrandRequest createBrandRequest) {
	
	
	Brand brand= this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
	this.brandRepository.save(brand);
	
}



  
}
