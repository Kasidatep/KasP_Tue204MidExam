package kasp.int204.tue.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderDto {
    private Integer id;
    private String orDate;
    private String shippedDate;
    private String status;

    private Integer custNo;

    public String getNaKub(){
        return "Sum of "+ id + " + " + custNo +" = " + (id+custNo) ;
    }
}
