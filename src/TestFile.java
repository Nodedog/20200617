import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {

        //File类的文件操作
       /* File file = new File("D:/File.txt");
        //1.判断文件是否存在
        System.out.println(file.exists());
        //2.判断文件是否是普通文件
        System.out.println(file.isFile());
        //3.判断文件是否是目录
        System.out.println(file.isDirectory());
        //4.删除文件
        file.delete();
        //5.创建一个新的文件
        file.createNewFile();

        //打印出一个反斜杠\
        System.out.println(File.separator);*/


       //File类的目录操作
       /*File file = new File("d:/testFile/1/2/3/4");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.getParent());
        file.mkdirs();
        System.out.println(file.exists());*/


       //File类的其他操作
        //只能查看当前目录下的组成
        File file = new File("d:/testFile");
        /*File[] files = file.listFiles();
        for (File x : files) {
            System.out.println(x);
        }*/
        listAllFiles(file);
    }

    //递归打印当前目录以及内部所有File类文件
    private static void listAllFiles(File x){
        if (x.isDirectory()){
            File[] files = x.listFiles();
            for (File xxx: files) {
                listAllFiles(xxx);
            }
        }else {
            System.out.println(x);
        }
    }

}
