//Create controllers to handle HTTP requests:

@RestController
@RequestMapping("/api/fpo")
public class FPOController {
    @Autowired
    private FPOService fpoService;

    @PostMapping("/save")
    public ResponseEntity<FPO> saveFPO(@RequestBody FPO fpo) {
        FPO savedFPO = fpoService.saveFPO(fpo);
        return new ResponseEntity<>(savedFPO, HttpStatus.CREATED);
    }

    // Other FPO-related endpoints
}

@RestController
@RequestMapping("/api/compliance")
public class ComplianceController {
    @Autowired
    private ComplianceService complianceService;

    // Implement Compliance-related endpoints
}

@RestController
@RequestMapping("/api/promoter")
public class PromoterOrganizationController {
    @Autowired
    private PromoterOrganizationService promoterOrganizationService;

    // Implement Promoter Organization-related endpoints
}
