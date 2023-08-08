package GorkemKoc.reportingApplication.entities.concretes;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "laborants")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Laborant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "hospitalIdNumber")
    private String hospitalIdNumber;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "laborant")
    List<Report> reports;
}
