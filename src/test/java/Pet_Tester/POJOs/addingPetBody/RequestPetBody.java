package Pet_Tester.POJOs.addingPetBody;

import java.util.List;
import lombok.Data;

public @Data class RequestPetBody {
	private List<String> photoUrls;
	private String name;
	private int id;
	private Category category;
	private List<TagsItem> tags;
	private String status;
}