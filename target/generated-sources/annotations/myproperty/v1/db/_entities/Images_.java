package myproperty.v1.db._entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-10T06:38:58")
@StaticMetamodel(Images.class)
public class Images_ { 

    public static volatile SingularAttribute<Images, Date> dateCreated;
    public static volatile SingularAttribute<Images, String> name;
    public static volatile SingularAttribute<Images, Integer> id;
    public static volatile SingularAttribute<Images, String> url;
    public static volatile SingularAttribute<Images, String> parentType;
    public static volatile SingularAttribute<Images, Integer> parentId;
    public static volatile SingularAttribute<Images, String> status;

}