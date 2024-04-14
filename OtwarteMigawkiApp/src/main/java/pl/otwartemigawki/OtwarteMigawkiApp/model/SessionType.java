package pl.otwartemigawki.OtwarteMigawkiApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "session_type")
public class SessionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_session_type", nullable = false)
    private Integer id;

    @Column(name = "session_type_name", length = 50)
    private String sessionTypeName;

    @OneToMany(mappedBy = "idSessionType")
    private Set<AvailableDate> availableDates = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idSessionType")
    private Set<UserSession> userSessions = new LinkedHashSet<>();

}