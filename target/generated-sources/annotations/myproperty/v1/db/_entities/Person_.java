package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-10T06:38:58")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, Date> dateofbirth;
    public static volatile SingularAttribute<Person, String> names;
    public static volatile SingularAttribute<Person, Date> dateCreated;
    public static volatile SingularAttribute<Person, User> updatedBy;
    public static volatile SingularAttribute<Person, String> gender;
    public static volatile SingularAttribute<Person, User> createdBy;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile SingularAttribute<Person, User> _user;
    public static volatile SingularAttribute<Person, Date> dateUpdated;

}