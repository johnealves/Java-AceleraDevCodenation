package com.challenge.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class UserAccelerationCompany implements Serializable {
    @ManyToOne
    @NotNull
    private User user;

    @ManyToOne
    @NotNull
    private Acceleration acceleration;

    @ManyToOne
    @NotNull
    private Company company;
}
