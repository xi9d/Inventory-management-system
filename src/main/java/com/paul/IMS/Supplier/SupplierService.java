package com.paul.IMS.Supplier;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SupplierService {
    List<Supplier> getAllSuppliers();
    Optional<Supplier> getSupplierById(UUID id);
    Supplier saveSupplier(Supplier supplier);
    void deleteSupplier(UUID id);
}
