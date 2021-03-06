/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1.db._entities.responses;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Mover 6/24/2017
 */
public class PropertyResponse {
    private Integer id;
    private Date dateCreated;
    private Date dateUpdated;
    private String brief;
    private String status;
    private String details;
    private Integer accountId;
    private Integer userId;
    private String property_type;

    private PropertySizeResponse[] propertySizeResponses;

    private String location;
    private String lat;
    private String lng;


    public PropertyResponse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public PropertySizeResponse[] getPropertySizeResponses() {
        return propertySizeResponses;
    }

    public void setPropertySizeResponses(PropertySizeResponse[] propertySizeResponses) {
        this.propertySizeResponses = propertySizeResponses;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.dateCreated);
        hash = 11 * hash + Objects.hashCode(this.dateUpdated);
        hash = 11 * hash + Objects.hashCode(this.brief);
        hash = 11 * hash + Objects.hashCode(this.status);
        hash = 11 * hash + Objects.hashCode(this.details);
        hash = 11 * hash + Objects.hashCode(this.accountId);
        hash = 11 * hash + Objects.hashCode(this.userId);
        hash = 11 * hash + Objects.hashCode(this.property_type);
        hash = 11 * hash + Arrays.deepHashCode(this.propertySizeResponses);
        hash = 11 * hash + Objects.hashCode(this.location);
        hash = 11 * hash + Objects.hashCode(this.lat);
        hash = 11 * hash + Objects.hashCode(this.lng);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PropertyResponse other = (PropertyResponse) obj;
        if (!Objects.equals(this.brief, other.brief)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.details, other.details)) {
            return false;
        }
        if (!Objects.equals(this.property_type, other.property_type)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.lat, other.lat)) {
            return false;
        }
        if (!Objects.equals(this.lng, other.lng)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateCreated, other.dateCreated)) {
            return false;
        }
        if (!Objects.equals(this.dateUpdated, other.dateUpdated)) {
            return false;
        }
        if (!Objects.equals(this.accountId, other.accountId)) {
            return false;
        }
        if (!Objects.equals(this.userId, other.userId)) {
            return false;
        }
        if (!Arrays.deepEquals(this.propertySizeResponses, other.propertySizeResponses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getCanonicalName()
                + "{"
                + "id=" + id
                + ", dateCreated=" + dateCreated
                + ", dateUpdated=" + dateUpdated
                + ", brief=" + brief
                + ", status=" + status
                + ", details=" + details
                + ", accountId=" + accountId
                + ", type=" + property_type
                + ", userId=" + userId
                + ", propertySize=" + propertySizeResponses
                + ", location=" + location
                + ", lat=" + lat
                + ", lng=" + lng
                + "}";
    }


}
