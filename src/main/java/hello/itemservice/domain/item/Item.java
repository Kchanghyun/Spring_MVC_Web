package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data // -> Getter, Setter, RequiredArgsConstructor, ToString, EqualsAndHashCode
// 위험함.
//@Getter
//@Setter
public class Item {
    private Long id;
    private String itemName;
    // Integer -> null이 들어갈 수도 있기 떄문
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
