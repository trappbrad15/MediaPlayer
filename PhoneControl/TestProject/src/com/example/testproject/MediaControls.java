package com.example.testproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MediaControls extends Activity {
	
    TextView currentSong;
	Button play, pause, next, previous;
	boolean _isRunning;
	@Override
	public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_media_controls); 
    _isRunning = true;
	currentSong = (TextView)findViewById(R.id.textView1);
	play = (Button)findViewById(R.id.buttonPlay);
    pause = (Button)findViewById(R.id.buttonPause);
    next = (Button)findViewById(R.id.buttonNext);
    previous = (Button)findViewById(R.id.Previous);
    
    /*new Thread(new Runnable(){
    	public void run(){
    		receiveData();
    	}
    }).start();*/
    
    play.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        	new Thread(new Runnable() {
        		public void run() {
        			connectSocket("Play");
        		}
        	}).start();
        }
    });
    
    pause.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        	new Thread(new Runnable() {
        		public void run() {
        			connectSocket("Pause");
        		}
        	}).start();
        }
    });
    next.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        	new Thread(new Runnable() {
        		public void run() {
        			connectSocket("Next");
        		}
        	}).start();
        }
    });
    previous.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        	new Thread(new Runnable() {
        		public void run() {
        			connectSocket("Previous");
        		}
        	}).start();
        }
    });
	}
    
    private void connectSocket(String a){ 

        try { 
            InetAddress serverAddr = InetAddress.getByName("192.168.0.107"); 
            Log.d("TCP", "C: Connecting..."); 
            Socket socket = new Socket(serverAddr, 8002); 


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
    /*private void receiveData()
    {
    	while(_isRunning)
    	{
	    	try
	    	{
	    		
	    		@SuppressWarnings("deprecation")
				InetAddress clientAddress = 
	    		Socket socket = new Socket(clientAddress.getHostAddress(), 8003);
	    		try{
	        		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
	        		String message = in.readLine();
	        		currentSong.setText(message);
	
	    		}catch(Exception e) { 
	                Log.e("TCP", "S: Error", e); 
	            }
	    	}
	    	catch (UnknownHostException e) { 
	            // TODO Auto-generated catch block 
	            Log.e("TCP", "C: UnknownHostException", e); 
	            e.printStackTrace(); 
	        } catch (IOException e) { 
	            // TODO Auto-generated catch block 
	            Log.e("TCP", "C: IOException", e); 
	            e.printStackTrace(); 
	        }  
    	}
    
    }*/
}
