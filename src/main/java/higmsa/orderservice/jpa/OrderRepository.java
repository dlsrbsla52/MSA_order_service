package higmsa.orderservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {

    OrderEntity findByProductId(String productId);

    Iterable<OrderEntity> findByUserId(String userId);
}
