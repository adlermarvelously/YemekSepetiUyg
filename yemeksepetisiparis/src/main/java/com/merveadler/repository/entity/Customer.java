package com.merveadler.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    String email;
    String address;
    String phone;
    String password;
    String cardDetails;
    String verificationCode;
    Long balance;
    int status ;

    private String activationCode;


}