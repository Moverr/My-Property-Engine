package myproperty._entities;

import myproperty.v1._entities.AccountType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Account;
import myproperty.v1._entities.Person;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(AccountType.class)
public class AccountType_ { 

    public static volatile CollectionAttribute<AccountType, Account> accountCollection;
    public static volatile SingularAttribute<AccountType, Date> dateCreated;
    public static volatile SingularAttribute<AccountType, Integer> id;
    public static volatile SingularAttribute<AccountType, String> type;
    public static volatile SingularAttribute<AccountType, Person> authorId;

}