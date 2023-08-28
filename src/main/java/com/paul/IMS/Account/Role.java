package com.paul.IMS.Account;

public enum Role {
    ADMIN("Admin"),
    MANAGER("Manager"),
    SALESPERSON("Salesperson"),
    WAREHOUSE_STAFF("Warehouse Staff"),
    CUSTOMER_SUPPORT("Customer Support"),
    REPORTING_ANALYST("Reporting Analyst"),
    GUEST("Guest"),
    SUPER_ADMIN("Super Admin");

    private final String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
