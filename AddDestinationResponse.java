
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

@XmlRootElement(name = "addDestinationResponse", namespace = "http://service.webservice.travel.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDestinationResponse", namespace = "http://service.webservice.travel.com/")

public class AddDestinationResponse {

    @XmlElement(name = "result")
    private int result;

    public int getResult() {
        return this.result;
    }

    public void setResult(int newResult)  {
        this.result = newResult;
    }

}

