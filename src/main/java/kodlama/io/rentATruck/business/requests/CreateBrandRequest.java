package kodlama.io.rentATruck.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
	//Elimde şöyle bir marka var ekler misin methodu
	//kayıt olmak için verilen veriler
	//Son kullanıcının görmemesi gereken veriler
	private String name;

}
