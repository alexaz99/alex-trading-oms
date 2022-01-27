package alex.trading.oms.model.lombok;


import lombok.Builder;
import lombok.Data;



//@lombok.Getter
//@lombok.Setter

// to use RequiredArgsConstructor.
// According to Documentation, Required arguments are final fields and fields with constraints such as @NonNull.
@Data
@Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
//@lombok.RequiredArgsConstructor
@lombok.EqualsAndHashCode(of = {"ordId", "ticker", "isBuy"})
public class Order {
    private long ordId;
    private long clOrdId;
    private String ticker;
    private int side;
    private boolean isBuy;
    private double qty;
    private double price;
    private int ordType;

    public static void main(String[] args) {
        Order order = Order.builder()
                .ordId(1L)
                .clOrdId(45L)
                .ticker("IBM")
                .isBuy(true)
                .build();

        System.out.println(order);
    }
}