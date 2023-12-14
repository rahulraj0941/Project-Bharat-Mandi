//Create Spring Data JPA repositories for each entity:

// FPO Repository
public interface FPORepository extends JpaRepository<FPO, Long> {
    // Additional queries if needed
}

// Compliance Repository
public interface ComplianceRepository extends JpaRepository<Compliance, Long> {
    // Additional queries if needed
}

// Promoter Organization Repository
public interface PromoterOrganizationRepository extends JpaRepository<PromoterOrganization, Long> {
    // Additional queries if needed
}

