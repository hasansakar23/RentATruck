package kodlama.io.rentATruck.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentATruck.business.abstracts.BrandService;
import kodlama.io.rentATruck.business.requests.CreateBrandRequest;
import kodlama.io.rentATruck.business.responds.GetAllBrandsResponse;
import kodlama.io.rentATruck.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@RestController //anotation 
@RequestMapping("/api/brands")
@AllArgsConstructor // BrandServiceli cons oluşturdu
public class BrandsController {
	private BrandService brandService;

	
	@GetMapping("/getAll")
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
		
	}
		@PostMapping("/add")
		public void add(CreateBrandRequest createBrandRequest) {
			this.brandService.add(createBrandRequest);
		}

}
