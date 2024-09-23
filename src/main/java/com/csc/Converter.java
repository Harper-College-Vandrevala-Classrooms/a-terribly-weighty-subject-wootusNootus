package com.csc;

public class Converter 
{
  public String toPounds(int ounces) 
  {
    double pounds = (double) ounces/16;
    String combined = String.format("%.4f", pounds) + (pounds == 1 ? " lb" : " lbs");
    return combined;
  }

  public String toPounds() 
  {
    return "0 lbs";
  }

  public String toPoundsAndOunces(int ounces) 
  {
    int newOunces = ounces % 16;
    int pounds = ounces / 16;
    String combined = pounds + (pounds == 1 ? " lb " : " lbs ") + newOunces + " oz";
    return combined;
  }

  public String toPoundsAndOunces() 
  {
    return "0 lbs/oz";
  }

  public String toOunces(int pounds, int ounces) 
  {
    int totalOunces = (pounds * 16) + ounces;
    return totalOunces + " oz";
  }

  public String toOunces() 
  {
    return "0 oz";
  }
}
