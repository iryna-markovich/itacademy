package domain;

public interface BuyerQueue {
    void insert(Buyer buyer);
    Buyer select();
}
