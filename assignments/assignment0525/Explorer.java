package assignment0525;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Explorer {
    private String currentPath;
    private File dirObj;
    private String[] currentFiles;
    private String[] options = {"M", "R", "D", ".", "MOVE", "Q"};
    private Scanner sc = new Scanner(System.in);
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy년  MM월 dd일 hh시 mm문 ss초");

    Explorer() {
        currentPath = "iodata";
        dirObj = new File(currentPath);
        if(!(dirObj.isDirectory())){
            System.out.println("iodata 폴더가 없어서 프로그램을 종료 합니다.");
            System.exit(0);
        }
        currentFiles = dirObj.list();
    }

    public void update(String newPath) {
        currentPath = newPath;
        dirObj = new File(currentPath);
        currentFiles = dirObj.list();
    }

    public String getOption() {
        String resultOption = sc.nextLine().toUpperCase();
        while (!Arrays.asList(options).contains(resultOption)) {
            System.out.println("다음 옵션들중에 하나를 골라주세요.");
            for (String option : options) {
                System.out.print(option + "\t");
            }
            System.out.println();
            resultOption = sc.nextLine().toUpperCase();
        }
        return resultOption;
    }

    public void makeFolder() {
        System.out.print("새로 생성할 폴더 이름을 작성하세요 : ");
        String newFolder = sc.nextLine();
        new File(currentPath + "/" + newFolder).mkdir();
        update(currentPath);
    }

    public void deleteObj() {
        System.out.print("삭제할 파일 혹은 디렉토리 이름을 작성하세요 : ");
        String deleteObj = sc.nextLine();
        while (!Arrays.asList(currentFiles).contains(deleteObj)) {
            System.out.println("밑에 보이는 파일 혹은 폴더 이름을 제대로 작성 해주세요");
            for (String file : currentFiles) {
                System.out.print(file + "\t");
            }
            System.out.println();
            deleteObj = sc.nextLine();
        }
        new File(currentPath + "/" + deleteObj).delete();
        update(currentPath);
        System.out.println(deleteObj + " 삭제 완료");

    }

    public void renameObj() {
        System.out.print("이름을 변경할 파일 혹은 디렉토리 이름을 작성하세요 : ");
        String renameObj = sc.nextLine();
        while (!Arrays.asList(currentFiles).contains(renameObj)) {
            System.out.println("밑에 보이는 파일 혹은 폴더 이름을 제대로 작성 해주세요");
            for (String file : currentFiles) {
                System.out.print(file + "\t");
            }
            System.out.println();
            renameObj = sc.nextLine();
        }
        System.out.println();
        System.out.print("새로운 이름을 작성해주세요 : ");
        String newName = sc.nextLine();

        File f1 = new File(currentPath + "/" + renameObj);
        File f2 = new File(currentPath + "/" + newName);
        boolean b = f1.renameTo(f2);
        System.out.println(b ? "이름 변경 완료" : "이름 변경 실패");
        update(currentPath);


    }


    public void moveUp() {
        if (currentPath.contains("/")) {
            String newPath = currentPath.substring(0, currentPath.lastIndexOf('/'));
            update(newPath);
        } else {
            System.out.println("최 상위 경로 : /" + currentPath + " 폴더 입니다");
        }
    }


    public void moveDown() {
        int folderCount = 0;
        for (String obj : currentFiles) {
            if (new File(currentPath + "/" + obj).isDirectory()) {
                folderCount++;
            }
        }
        if (folderCount > 0) {

            System.out.print("이동할 하위 폴더 이름 작성해주세요 : ");
            String folderName = sc.nextLine();
            while (!(new File(currentPath + "/" + folderName).isDirectory())) {

                printStatus();
                System.out.print("이동 실패 \n폴더로 설정된 이름을 작성 바랍니다 : ");
                folderName = sc.nextLine();
            }
            String newPath = currentPath + "/" + folderName;
            update(newPath);
        } else {
            System.out.println("더 이상의 하위 폴더는 존재 하지 않습니다.");
        }
    }


    public void formatSpaces(int totalSpaces, String file) {
        int spaces = totalSpaces - file.length();
        if (spaces > 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
        }
    }

    public void printStatus() {
        System.out.println("현재 경로 : " + currentPath);
        System.out.println(" -------------------------------------------------------------");
        System.out.println("이름\t\t\t\t\t\t\t\t종류\t\t크기\t\t\t마지막수정날짜");
        File eachFile;
        long time;
        for (String file : currentFiles) {
            System.out.print(file);
            formatSpaces(32, file);

            eachFile = new File(currentPath + "/" + file);
            if (eachFile.isFile()) {
                System.out.print("파일\t\t");
            } else if (eachFile.isDirectory()) {
                System.out.print("폴더\t\t");
            } else {
                System.out.print("알수없음\t\t");
            }
            System.out.print(eachFile.length());
            formatSpaces(12, String.valueOf(eachFile.length()));

            time = eachFile.lastModified();
            System.out.println(sdf.format(new Date(time)));
            System.out.println();
        }
        System.out.println(" -------------------------------------------------------------");
    }

    public void wholeOperate() {
        while (true) {
            printStatus();
            System.out.println("[M]새폴더  [R]이름변경  [D]삭제 [.]상위폴더이동 [move]하위폴더 이동 : move 새새폴더  [Q]:프로그램 끝내기 ");
            String option = getOption();
            switch (option) {
                case "M":
                    makeFolder();
                    break;
                case "R":
                    renameObj();
                    break;
                case "D":
                    deleteObj();
                    break;
                case ".":
                    moveUp();
                    break;
                case "MOVE":
                    moveDown();
                    break;
                case "Q":
                    System.out.println("프로그램 종료");
                    System.exit(0);
            }
        }
    }
}
