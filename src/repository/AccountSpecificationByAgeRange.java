package repository;

public class AccountSpecificationByAgeRange implements AccountSpecification, SqlSpecification{
	 
    private int minAge;
    private int maxAge;
 
    public AccountSpecificationByAgeRange(int minAge, int maxAge) {
        super();
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
 
    @Override
    public boolean specified(Account account) {
        return account.ageBetween(minAge, maxAge);
    }
 
    @Override
    public String toSqlClauses() {
        return String.format("age between %s and %s", minAge, maxAge);
    }
 
}
