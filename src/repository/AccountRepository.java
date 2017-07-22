package repository;

import java.util.List;

public interface AccountRepository {
	 
    void addAccount(Account account);
    void removeAccount(Account account);
    void updateAccount(Account account); // Think it as replace for set
 
    List query(AccountSpecification specification);
 
}
