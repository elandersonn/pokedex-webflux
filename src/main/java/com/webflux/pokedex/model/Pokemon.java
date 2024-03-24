package com.webflux.pokedex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pokemon {
    @Id
    private String id;
    private String name;
    private String type;
    private String skills;
    private String attributes;
    private Double weight;

    public Pokemon(String id, String name, String type, String skills, String attributes, Double weight) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.type = type;
        this.attributes = attributes;
        this.weight = weight;
    }

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String getAttributes() {
        return attributes;
    }
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pokemon other = (Pokemon) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (skills == null) {
            if (other.skills != null)
                return false;
        } else if (!skills.equals(other.skills))
            return false;
        if (attributes == null) {
            if (other.attributes != null)
                return false;
        } else if (!attributes.equals(other.attributes))
            return false;
        if (weight == null) {
            if (other.weight != null)
                return false;
        } else if (!weight.equals(other.weight))
            return false;
        return true;
    }


    /*@Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }    
    */


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((skills == null) ? 0 : skills.hashCode());
        result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
        result = prime * result + ((weight == null) ? 0 : weight.hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "Pokemon [id=" + id + ", name=" + name + ", type=" + type + ", skills=" + skills + ", attributes="
                + attributes + ", weight=" + weight + "]";
    }

}
