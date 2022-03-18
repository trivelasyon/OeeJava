package level3.reports.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import level3.reports.business.abstracts.UserService;
import level3.reports.core.dataAccess.UserDao;
import level3.reports.core.entities.User;
import level3.reports.core.utilities.DataResult;
import level3.reports.core.utilities.ErrorDataResult;
import level3.reports.core.utilities.SuccessDataResult;

@Service
public class UserManager implements UserService {

	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public DataResult<User> getUser(String name) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<User>(this.userDao.getByuserName(name),"kisi bilgileri alindi");
	}

	@Override
	public DataResult<Boolean> isUser(String name, String password) {
		if(this.userDao.existsByUserNameAndPassword(name, password)==true) {
			return new SuccessDataResult<Boolean>(true,"Giriş sağlandi");
		}
		else {
		return new ErrorDataResult<Boolean>(false,"Kullanıcı adı veya parola yanlış !");
	}
	}
}
