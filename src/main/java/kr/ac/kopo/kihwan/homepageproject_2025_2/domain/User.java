package kr.ac.kopo.kihwan.homepageproject_2025_2.domain;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String role; // ROLE_USER, ROLE_ADMIN 등
}