
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class test {

    public static void readLines(File f)throws IOException
    {
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line;
        List<String>lines=new ArrayList<>();

        while((line=br.readLine())!=null)
        {
            lines.add(line);

        }
        for(int i=0;i<lines.size();i++)
        {
            System.out.println(i+" - "+lines.get(i));
        }
        br.close();
        fr.close();
    }

    public static void main(String args[])
    {
        //must put file path and without .txt
        File f=new File("E:\\self learning\\CodeForces\\src\\test");
        try{
            readLines(f);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }




}


