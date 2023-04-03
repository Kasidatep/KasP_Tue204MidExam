package kasp.int204.tue.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name="orderNumber")
    private Integer id;
    @Column(name="orderDate", nullable = false)
    private String orDate;
    @Column(nullable = false)
    private String requiredDate;
    private String shippedDate;
    @Column(nullable = false)
    private String status;
    private String comments;
    @Column(name="customerNumber", nullable = false)
    private Integer custNo;
}
