package cse360assignment02;

public class AddingMachine {
  private int total;
  private String string;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    string = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
    total = total + value;
    string = string + " + " + value;
  }

  public void subtract (int value) {
    total = total - value;
    string = string + " - " + value;
  }

  public String toString () {
    return string;
  }

  public void clear() {
  }
}