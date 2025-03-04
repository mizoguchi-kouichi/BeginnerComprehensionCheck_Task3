package com.kouichi;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("携帯電話番号を入力してください:");
    String PhoneNumber = scanner.next();

    if (PhoneNumber.matches("^0[789]0-\\d{4}-\\d{4}$")) {
      System.out.print(PhoneNumber + "は有効な携帯電話です。");
    } else {
      System.out.print(PhoneNumber + "無効な携帯電話番号です。");
    }
  }
}