package com.anduong.petproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column
    private String email;

    @NotNull
    @Column
    private String firstName;

    @NotNull
    @Column
    private String lastName;

    @Column
    private boolean active;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertedDate;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles",
    joinColumns = { @JoinColumn(name = "user_id")},
    inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Roles> roles = new ArrayList<>();

}
