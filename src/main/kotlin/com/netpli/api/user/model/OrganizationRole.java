package com.netpli.api.user.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class OrganizationRole {
    private String organizationId;
    private String roleId;
}
