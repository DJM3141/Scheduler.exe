import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import javax.sound.sampled.*;

        public class AudioPlayerTest extends JFrame{

          AudioFormat audioFormat;
          AudioInputStream audioInputStream;
          SourceDataLine sourceDataLine;
          boolean stopPlayback = false;
          final JButton stopBtn = new JButton("Stop");
          final JButton playBtn = new JButton("Play");
          final JTextField textField =
                       new JTextField("roblox-death-sound.au");

          public static void main(String args[]){
            new AudioPlayerTest();
          }//end main
          //-------------------------------------------//

          public AudioPlayerTest(){//constructor

            stopBtn.setEnabled(false);
            playBtn.setEnabled(true);

            //Instantiate and register action listeners
            // on the Play and Stop buttons.
            playBtn.addActionListener(
              new ActionListener(){
            public void actionPerformed(
                              ActionEvent e){
              stopBtn.setEnabled(true);
              playBtn.setEnabled(false);
              playAudio();//Play the file
            }//end actionPerformed
              }//end ActionListener
            );//end addActionListener()

            stopBtn.addActionListener(
              new ActionListener(){
            public void actionPerformed(
                              ActionEvent e){
              //Terminate playback before EOF
              stopPlayback = true;
            }//end actionPerformed
              }//end ActionListener
            );//end addActionListener()

            getContentPane().add(playBtn,"West");
            getContentPane().add(stopBtn,"East");
            getContentPane().add(textField,"North");

            setTitle("");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(250,70);
            setVisible(true);
          }//end constructor
          //-------------------------------------------//

          //This method plays back audio data from an
          // audio file whose name is specified in the
          // text field.
          private void playAudio() {
            try{
              File soundFile =
                   new File(textField.getText());
              audioInputStream = AudioSystem.
                  getAudioInputStream(soundFile);
              audioFormat = audioInputStream.getFormat();
              System.out.println(audioFormat);

              DataLine.Info dataLineInfo =
                      new DataLine.Info(
                        SourceDataLine.class,
                                audioFormat);

              sourceDataLine =
                 (SourceDataLine)AudioSystem.getLine(
                               dataLineInfo);

              //Create a thread to play back the data and
              // start it running.  It will run until the
              // end of file, or the Stop button is
              // clicked, whichever occurs first.
              // Because of the data buffers involved,
              // there will normally be a delay between
              // the click on the Stop button and the
              // actual termination of playback.
              new PlayThread().start();
            }catch (Exception e) {
              e.printStackTrace();
              System.exit(0);
            }//end catch
          }//end playAudio


        //=============================================//
        //Inner class to play back the data from the
        // audio file.
        class PlayThread extends Thread{
          byte tempBuffer[] = new byte[10000];

          public void run(){
            try{
              sourceDataLine.open(audioFormat);
              sourceDataLine.start();

              int cnt;
              //Keep looping until the input read method
              // returns -1 for empty stream or the
              // user clicks the Stop button causing
              // stopPlayback to switch from false to
              // true.
              while((cnt = audioInputStream.read(
               tempBuffer,0,tempBuffer.length)) != -1
                       && stopPlayback == false){
            if(cnt > 0){
              //Write data to the internal buffer of
              // the data line where it will be
              // delivered to the speaker.
              sourceDataLine.write(
                         tempBuffer, 0, cnt);
            }//end if
              }//end while
              //Block and wait for internal buffer of the
              // data line to empty.
              sourceDataLine.drain();
              sourceDataLine.close();

              //Prepare to playback another file
              stopBtn.setEnabled(false);
              playBtn.setEnabled(true);
              stopPlayback = false;
            }catch (Exception e) {
              e.printStackTrace();
              System.exit(0);
            }//end catch
          }//end run
        }//end inner class PlayThread
        //===================================//

        }//end outer class AudioPlayer02.java