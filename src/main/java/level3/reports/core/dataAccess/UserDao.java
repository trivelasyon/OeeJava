package level3.reports.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import level3.reports.core.entities.User;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

	User getByuserName(String userName);
	
   /* @Query("select new java.lang.Boolean(count(u) > 0) from User u where u.userName = :name and u.password=:password")
	Boolean isUser(@Param("name")String userName,@Param("password")String password);
	*/
    
    Boolean existsByUserNameAndPassword(String userName, String password);
    
    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM User c WHERE c.userName = :name and c.password=:password")
    boolean existsIsUser(@Param("name") String userName,@Param("password")String password);
}
