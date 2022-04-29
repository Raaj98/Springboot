package com.socialmedia.socialmedia.Passport;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.socialmedia.socialmedia.Student1.Student1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "raaj_passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String passportNo;
    @OneToOne(fetch=FetchType.LAZY,mappedBy = "passport")
    @JsonBackReference
    private Student1 student1;
}
