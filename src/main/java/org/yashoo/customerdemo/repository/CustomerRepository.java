package org.yashoo.customerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yashoo.customerdemo.model.Customer;

/**
 * Repository interface fot {@link Customer} class
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
