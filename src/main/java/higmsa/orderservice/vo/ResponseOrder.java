package higmsa.orderservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // null값 데이터는 반환하지 않음
public class ResponseOrder {

    private String productId;

    private Integer qty;

    private Integer unitPrice;

    private Integer totalPrice;

    private Date createAt;

    private String orderId;

    private String userId;
}
