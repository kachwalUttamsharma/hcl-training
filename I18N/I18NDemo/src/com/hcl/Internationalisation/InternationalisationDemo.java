package com.hcl.Internationalisation;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalisationDemo {
  public static void main(String[] args) {
	double d=123456.789;
	NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
	NumberFormat nf1=NumberFormat.getInstance(Locale.US);
    NumberFormat nf2=NumberFormat.getInstance(Locale.CHINA);
    NumberFormat nf3=NumberFormat.getInstance(Locale.CHINESE);
    NumberFormat nf4=NumberFormat.getInstance(Locale.GERMAN);
    System.out.println("Italy is: "+ d + ":" + nf.format(d));
    System.out.println("US is: "+ d + ":" + nf1.format(d));
    System.out.println("CHINA is: "+ d + ":" + nf2.format(d));
    System.out.println("CHINESE is: "+ d + ":" + nf3.format(d));
    System.out.println("GERMAN is: "+ d + ":" + nf4.format(d));

    DateFormat df=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
    System.out.println("Shortformatofdate:"+df.format(new Date()));
  

    DateFormat df1=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
    System.out.println("Shortformatofdate:"+df1.format(new Date()));
  

    DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
    System.out.println("Shortformatofdate:"+df2.format(new Date()));
    
    DateFormat df3=DateFormat.getDateInstance(DateFormat.LONG, Locale.CANADA);
    System.out.println("short format of date :" + df3.format(new Date()));
  
    DateFormat df4=DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALY);
    System.out.println("short format of date :" + df4.format(new Date()));

  }
}
