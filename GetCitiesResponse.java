
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

@XmlRootElement(name = "getCitiesResponse", namespace = "http://service.webservice.travel.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCitiesResponse", namespace = "http://service.webservice.travel.com/")

public class GetCitiesResponse {

    @XmlElement(name = "result")
    private java.util.List<com.travel.webservice.data.City> result;

    public java.util.List<com.travel.webservice.data.City> getResult() {
        return this.result;
    }

    public void setResult(java.util.List<com.travel.webservice.data.City> newResult)  {
        this.result = newResult;
    }

}
