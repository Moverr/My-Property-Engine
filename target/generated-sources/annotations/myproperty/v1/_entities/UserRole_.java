package myproperty.v1._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1._entities.Roles;
import myproperty.v1._entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-28T22:46:03")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, Date> dateCreated;
    public static volatile SingularAttribute<UserRole, Roles> roleId;
    public static volatile SingularAttribute<UserRole, Integer> id;
    public static volatile SingularAttribute<UserRole, Integer> authorId;
    public static volatile SingularAttribute<UserRole, User> userId;
    public static volatile SingularAttribute<UserRole, String> status;

}