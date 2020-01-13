/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;

/**
 *
 * @author Aurelijus
 */
public class Item {
    
 private String itemName;
    private String itemCode;
    private String itemQuantity;
    private String itemExpirationDate;

    public Item(String itemName, String itemCode, String itemQuantity, String itemExpirationDate) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.itemQuantity = itemQuantity;
        this.itemExpirationDate = itemExpirationDate;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemExpirationDate() {
        return itemExpirationDate;
    }

    public void setItemExpirationDate(String itemExpirationDate) {
        this.itemExpirationDate = itemExpirationDate;
    }

    @Override
    public String toString() {
        return "Item Name = " + itemName + ", Code = " + itemCode + ", Quantity = " + itemQuantity + ", Expiration Date = " + itemExpirationDate;
    }

}

