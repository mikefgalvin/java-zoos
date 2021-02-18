package com.lambdaschool.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "telephones")
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    @Column(nullable = false)
    private String phonenumber;

    private String phonetype;

    @ManyToOne
    @JoinColumn(name = "zooid", nullable = false)
    @JsonIgnoreProperties(value = "telephones", allowSetters = true)
    private Zoo zoo;

    public Telephone() { }

    public Telephone(String phonenumber, String phonetype) {
        this.phonenumber = phonenumber;
        this.phonetype = phonetype;
    }

    public long getPhoneid() { return phoneid; }

    public void setPhoneid(long phoneid) { this.phoneid = phoneid; }

    public String getPhonenumber() { return phonenumber; }

    public void setPhonenumber(String phonenumber) { this.phonenumber = phonenumber; }

    public String getPhonetype() { return phonetype; }

    public void setPhonetype(String phonetype) { this.phonetype = phonetype; }

    public Zoo getZoo() { return zoo; }

    public void setZoo(Zoo zoo) { this.zoo = zoo; }

    //createdby - string
    //createdate - timestamp
    //lastmodifiedby string
    //lastmodifieddate timestamp
    //phonenumber string
    //phonetype string
    //zooid -- foreign key
}
