//Create Java classes representing your entities.

// FPO entity
@Entity
public class FPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    // Other fields, getters, and setters
}

// Compliance entity
@Entity
public class Compliance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fertilizerLicense;

    // Other fields, getters, and setters
}

// Promoter Organization entity
@Entity
public class PromoterOrganization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Other fields, getters, and setters
}

