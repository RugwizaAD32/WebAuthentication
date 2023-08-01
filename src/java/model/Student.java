/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Student implements Serializable{
    private String name;
    private String email;
    private String phone;
    private byte[] image;
    private byte[] pdf;
    private String religion;

    public Student() {
    }

    public Student(String name, String email, String phone, byte[] image, byte[] pdf, String religion) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.image = image;
        this.pdf = pdf;
        this.religion = religion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    
    
}