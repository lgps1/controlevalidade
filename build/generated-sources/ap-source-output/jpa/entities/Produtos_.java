package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-23T17:36:05")
@StaticMetamodel(Produtos.class)
public class Produtos_ { 

    public static volatile SingularAttribute<Produtos, String> descrição;
    public static volatile SingularAttribute<Produtos, String> id;
    public static volatile SingularAttribute<Produtos, String> fabricante;
    public static volatile SingularAttribute<Produtos, String> localização;
    public static volatile SingularAttribute<Produtos, Date> validade;

}