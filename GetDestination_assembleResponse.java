
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

@XmlRootElement(name = "getDestination_assembleResponse", namespace = "http://service.webservice.travel.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDestination_assembleResponse", namespace = "http://service.webservice.travel.com/")

public class GetDestination_assembleResponse {

    @XmlElement(name = "result")
    private java.util.List<com.travel.webservice.data.Destination_assemble> result;

    public java.util.List<com.travel.webservice.data.Destination_assemble> getResult() {
        return this.result;
    }

    public void setResult(java.util.List<com.travel.webservice.data.Destination_assemble> newResult)  {
        this.result = newResult;
    }

}
