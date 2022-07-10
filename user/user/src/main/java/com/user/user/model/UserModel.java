package com.user.user.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Table(name = "user")
@Entity
public class UserModel {
    @Id
    //why we are using IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    int userId;

    @Column(name = "user_name")
    String userName;

    @Column(name = "user_password")
    String userPassword;

    @Column(name = "user_address")
    String userAddress;

    @Column(name = "user_dob")
    LocalDate userDob;

}
