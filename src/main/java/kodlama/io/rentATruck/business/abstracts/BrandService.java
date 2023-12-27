package kodlama.io.rentATruck.business.abstracts;

import java.util.List;

import kodlama.io.rentATruck.business.requests.CreateBrandRequest;
import kodlama.io.rentATruck.business.responds.GetAllBrandsResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll(); //responds methodu çünkü ben ona yanıt veriyorum
	
	void add(CreateBrandRequest createBrandRequest) ;
		
	

}
