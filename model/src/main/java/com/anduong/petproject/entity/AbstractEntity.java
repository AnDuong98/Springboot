package com.anduong.petproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter @Setter
public abstract class AbstractEntity {

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertedDate;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
}
