package alex.trading.oms.model.lombok;


//@Data
//@Builder

//@lombok.Getter
//@lombok.Setter

// to use RequiredArgsConstructor.
// According to Documentation, Required arguments are final fields and fields with constraints such as @NonNull.
//@lombok.RequiredArgsConstructor
//@lombok.EqualsAndHashCode(of = {"ordId", "ticker", "isBuy"})
public class Order {

    private long ordId;
    private long clOrdId;
    private String ticker;
    private int side;
    private boolean isBuy;
    private double qty;
    private double price;
    private int ordType;

}