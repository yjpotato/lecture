package chap21_stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _06_filesStream {
    public static void main(String[] args)  {
        //hyundaicar.txt의 경로 (Path)객체 얻기
        //Paths.get() 메소드를 이용하여 파일 경로를 Path 객체로 가져옴.
        try {
            //getResource() 메소드를 이용해서 해당 자바 클래스의 위치에서 파일 경로를 찾
            Path path = Paths.get(_06_filesStream.class.getResource("hyundaicar.txt").toURI());
            //Files.lines() => 텍스트 파일을 행으로 분리해서
            //                 행들의 스트림을 만들어준다.
            Stream<String> fileStream = Files.lines(path, Charset.defaultCharset());
            //Files.lines() 메소드는 텍스트 파일을 행 단위로 읽어서 각 행을 스트림으로 만들어 줍니다.
            // 첫 번째 인자로 Path 객체를, 두 번째 인자로 Charset 객체를 전달합니다

            fileStream.forEach(l -> System.out.println(l)); // 파일 내용을 한 줄씩 출력. 람다표현식으로 입력.

        } catch (URISyntaxException ue) {
            ue.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
