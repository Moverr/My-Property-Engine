package myproperty.v1.db._entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import myproperty.v1.db._entities.Accounts;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-10T06:38:58")
@StaticMetamodel(Packages.class)
public class Packages_ { 

    public static volatile CollectionAttribute<Packages, Accounts> accountsCollection;
    public static volatile SingularAttribute<Packages, String> package_name;
    public static volatile SingularAttribute<Packages, Integer> id;

}