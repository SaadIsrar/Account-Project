package Application;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApplicationProjectJSON {

		private void run() throws IOException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		Account account = new Account("Bob", "bobbington", 6678);
		try {
			mapper.writeValue(new File("C:\\Users\\Admin\\eclipse-workspace\\Account Application.json"), account);
			String jsonInString = mapper.writeValueAsString(account);
			System.out.println(jsonInString);
			
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(account);
			System.out.println(jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
				e.printStackTrace();
		} catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	private ApplicationProjectJSON() {
		Service serviceObj = new Service();
		
		serviceObj.getAccounts().get(0).getfName();
		serviceObj.getAccounts().get(0).getsName();
		serviceObj.getAccounts().get(0).getAccountNumber();
		
		
		
	}

}
