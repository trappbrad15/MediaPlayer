package com.example.testproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.IOException; 
import java.io.InputStream;
import java.io.OutputStreamWriter; 
import java.io.InputStreamReader;
import java.io.PrintWriter; 
import java.net.InetAddress; 
import java.net.Socket; 
import java.net.UnknownHostException; 

import android.util.Log; 

public class MainActivity extends Activity {


@Override 
public void onCreate(Bundle savedInstanceState) { 
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_main);
    
    Button mediaPlayer = (Button) findViewById(R.id.buttonMediaPlayer);
    
    mediaPlayer.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View paramView) {
			// TODO Auto-generated method stub
			new Thread(new Runnable() {
        		public void run() {
        			connectSocket("MediaPlayer");
        		}
        	}).start();
			Intent intent = new Intent(MainActivity.this, MediaControls.class);
			startActivity(intent);
		}
	});
   
} 

private void connectSocket(String a){ 

    try { 
        InetAddress serverAddr = InetAddress.getByName("192.168.0.107"); 
        Log.d("TCP", "C: Connecting..."); 
        Socket socket = new Socket(serverAddr, 8001); 


        PrintWriter out = null;
        BufferedReader in = null;

        try { 
            Log.d("TCP", "C: Sending Message"); 
            out = new PrintWriter( new BufferedWriter( new OutputStreamWriter(socket.getOutputStream())),true); 
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));                
          
            out.write(a);
            out.close();
            
            Log.d("TCP", "C: Sent."); 
            Log.d("TCP", "C: Done.");               

        } catch(Exception e) { 
            Log.e("TCP", "S: Error", e); 
        } finally { 
            socket.close(); 
        } 

    } catch (UnknownHostException e) { 
        // TODO Auto-generated catch block 
        Log.e("TCP", "C: UnknownHostException", e); 
        e.printStackTrace(); 
    } catch (IOException e) { 
        // TODO Auto-generated catch block 
        Log.e("TCP", "C: IOException", e); 
        e.printStackTrace(); 
    }       
} 
} 