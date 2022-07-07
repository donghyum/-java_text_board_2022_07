package com.ldh.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");

    int articleLastId = 0;

    while (true) {
      System.out.printf("명령) ");
      String cmd = sc.nextLine();

      if ( cmd.equals("exit")) {
        break;
      }

      else if (cmd.equals("/user/article/write")){
        System.out.println("게시물 출력");
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String body = sc.nextLine();
        int id = articleLastId + 1;
        articleLastId++;
        System.out.printf("%d번째 게시물이 등록 되었습니다.\n", id);
      }
      else {
        System.out.printf("입력 된 명령어 : %s\n", cmd);
      }
    }

    System.out.println("== 프로그램 끝 ==");

    sc.close();
  }
}