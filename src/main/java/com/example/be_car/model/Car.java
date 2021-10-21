package com.example.be_car.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private Long price;
    private String image;
    private String origin;
    private String gear;
    private String style;
    private String status;
    private Long kmNumber;
    private String province;
    private String description;
    private Long warrantyPeriod;
    private String carCompany;
    @ManyToOne
    @JoinColumn(name = "user_id")

    private User user;
    @OneToOne
    private Comment comment;
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Like> likeList;

    public Car() {
    }

    public Car(Long id, String name, Long price, String image, String origin, String gear, String style, String status, Long kmNumber, String province, String description, Long warrantyPeriod, String carCompany, User user, Comment comment, List<Like> likeList) {
        Id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.origin = origin;
        this.gear = gear;
        this.style = style;
        this.status = status;
        this.kmNumber = kmNumber;
        this.province = province;
        this.description = description;
        this.warrantyPeriod = warrantyPeriod;
        this.carCompany = carCompany;
        this.user = user;
        this.comment = comment;
        this.likeList = likeList;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getKmNumber() {
        return kmNumber;
    }

    public void setKmNumber(Long kmNumber) {
        this.kmNumber = kmNumber;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(Long warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public List<Like> getLikeList() {
        return likeList;
    }

    public void setLikeList(List<Like> likeList) {
        this.likeList = likeList;
    }
}
