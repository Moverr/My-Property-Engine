package myproperty._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty._entities.Contacts;
import myproperty._entities.User;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T00:14:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-06T14:50:26")
>>>>>>> 772fa81e449296d89773065967b8ae57594b9734
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Date> dateofbirth;
    public static volatile CollectionAttribute<Person, Contacts> contactsCollection;
    public static volatile SingularAttribute<Person, String> names;
    public static volatile SingularAttribute<Person, Date> dateCreated;
    public static volatile SingularAttribute<Person, User> updatedBy;
    public static volatile SingularAttribute<Person, String> gender;
    public static volatile SingularAttribute<Person, User> createdBy;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile SingularAttribute<Person, User> _user;
    public static volatile SingularAttribute<Person, Date> dateUpdated;

}