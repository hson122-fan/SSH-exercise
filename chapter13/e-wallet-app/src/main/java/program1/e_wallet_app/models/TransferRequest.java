package program1.e_wallet_app.models;

import java.math.BigDecimal;

public class TransferRequest {
    private Long senderId;
    private Long receiverId;
    private BigDecimal amount;

    public TransferRequest(Long senderId, Long receiverId, BigDecimal amount){
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
    }

    public Long getSenderId(){
        return senderId;
    }

    public Long getReceiverId(){
        return receiverId;
    }

    public BigDecimal getAmount(){
        return amount;
    }
}
