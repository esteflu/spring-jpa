package example.domain;

import example.converter.LocalDateTimeConverter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    /*@Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false, updatable = false, nullable = false)
    private Date created;*/

    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime created;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

   /* public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }*/

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}