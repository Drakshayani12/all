package com.ltimindtree.product.entity;

public class Product {
    private int productId;
    private String productName;
    private long price;
    private long quantityInStock;
public Product(){}

public Product(int productId, String productName, long price, long quantityInStock) {
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    this.quantityInStock = quantityInStock;
}

public int getProductId() {
    return productId;
}
public void setProductId(int productId) {
    this.productId = productId;
}
public String getProductName() {
    return productName;
}
public void setProductName(String productName) {
    this.productName = productName;
}
public long getPrice() {
    return price;
}
public void setPrice(long price) {
    this.price = price;
}
public long getQuantityInStock() {
    return quantityInStock;
}
public void setQuantityInStock(long quantityInStock) {
    this.quantityInStock = quantityInStock;
}

@Override
public String toString() {
    return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
            + ", quantityInStock=" + quantityInStock + "]";
}

}
