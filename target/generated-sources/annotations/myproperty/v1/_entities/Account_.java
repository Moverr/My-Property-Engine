package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.AccountType;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.Subscription;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-12T21:21:04")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Date> dateCreated;
    public static volatile SingularAttribute<Account, String> accountName;
    public static volatile SingularAttribute<Account, AccountType> accountType;
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, Subscription> subscription;
    public static volatile SingularAttribute<Account, Person> authorId;

}