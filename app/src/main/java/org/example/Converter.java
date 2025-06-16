package org.example;

public class Converter {

  public String toPounds(int ounces) {
      double pounds = ounces / 16.0;
      String unit;

      if (pounds == 1.0) {
          unit = "lb";
      } else {
          unit = "lbs";
      }

      return String.format("%.4f %s", pounds, unit);
  }

  public String toPoundsAndOunces(int ounces) {
      int lbs = ounces / 16;
      int oz = ounces % 16;

      String lbUnit;
      if (lbs == 1) {
          lbUnit = "lb";
      } else {
          lbUnit = "lbs";
      }

      return String.format("%d %s %d oz", lbs, lbUnit, oz);
  }
}
