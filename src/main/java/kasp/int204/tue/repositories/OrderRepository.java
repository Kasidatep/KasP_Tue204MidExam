package kasp.int204.tue.repositories;

import kasp.int204.tue.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAllByStatus(String status);
    List<Order> findAllByCustNo(Integer custNo);

    @Query("select o from Order o where o.status = ?1")
    List<Order> findWithStatus(String status);
}
