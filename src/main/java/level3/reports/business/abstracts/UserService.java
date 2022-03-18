package level3.reports.business.abstracts;

import level3.reports.core.entities.User;
import level3.reports.core.utilities.DataResult;

public interface UserService {

	DataResult<User> getUser(String name);
	
	DataResult<Boolean> isUser(String name , String password);
}
