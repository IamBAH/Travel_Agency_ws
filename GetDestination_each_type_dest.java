
package com.travel.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.4.2
 * Sun Apr 17 12:06:40 CEST 2022
 * Generated source version: 2.4.2
 */

@XmlRootElement(name = "getDestination_each_type_dest", namespace = "http://service.webservice.travel.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDestination_each_type_dest", namespace = "http://service.webservice.travel.com/")

public class GetDestination_each_type_dest {

    @XmlElement(name = "idDestType")
    private int idDestType;

    public int getIdDestType() {
        return this.idDestType;
    }

    public void setIdDestType(int newIdDestType)  {
        this.idDestType = newIdDestType;
    }

}

