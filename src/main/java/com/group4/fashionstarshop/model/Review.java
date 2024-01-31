package com.group4.fashionstarshop.model;

import java.sql.Time;

public class Review {
    private Long reviewId;
    private int customerId;
    private int productId;
    private int orderId;
    private int ratingValue;
    private String text;
    private Time reviewTime;
}
