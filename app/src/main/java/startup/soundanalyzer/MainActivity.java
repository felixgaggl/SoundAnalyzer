package startup.soundanalyzer;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Main activity: Analysing activity started!");

        readFile();


    }

    private void readFile() {
        String filepath = Environment.getExternalStorageDirectory().getPath();

        File file = new File(filepath);
        try {
            System.out.println("out here analysing stuff");
            WavFile wavFile = WavFile.openWavFile(file);
            System.out.println(wavFile.getAudioFormat());





        } catch (IOException e) {
            e.printStackTrace();
        } catch (WavFileException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
