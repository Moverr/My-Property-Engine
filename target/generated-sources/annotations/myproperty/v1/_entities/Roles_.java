package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.UserRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-12T21:21:04")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, String> role;
    public static volatile SingularAttribute<Roles, Date> dateCreated;
    public static volatile CollectionAttribute<Roles, UserRole> userRoleCollection;
    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile SingularAttribute<Roles, Person> authorId;
    public static volatile SingularAttribute<Roles, String> status;

}