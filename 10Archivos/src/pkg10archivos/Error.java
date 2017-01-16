/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 *
 * @author aj.zavala
 */
public class Error implements Escribible{
    private long timestamp;
    private int codigoError;
    private String descripcion;

    public Error()
    {
    }
    
    public Error(int codigoError,String descripcion)
    {
       this.timestamp = new Date().getTime();
       this.codigoError = codigoError;
       this.descripcion = descripcion;  
    }
    
    public long getTimestamp() {
        return timestamp;
    }

    public String toString()
    {
      return timestamp + "|"+codigoError+"|"+descripcion;
    }
    
    @Override
    public void escribir(String url) {
        try {
            //FileWriter f = new FileWriter(url);
            //f.append(timestamp + " " + codigoError + " " + descripcion);
            //f.close();
            
            FileOutputStream fo = new FileOutputStream(url,true);
            OutputStreamWriter os = new OutputStreamWriter(fo,"UTF-8");
            BufferedWriter bw = new BufferedWriter(os);
            bw.write(timestamp + "|" + codigoError + "|" + descripcion+"\n");
            bw.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("FileNotFoundException");
        }
        catch(UnsupportedEncodingException ex)
        {
        System.out.println("UnsupportedEncodingException");
        }   
        catch (IOException ex) {
            System.out.println("IOException");
        }
        catch(Exception ex)
        {
            System.out.println("Exception");
        }
        finally
        {
          
        }
    }

    @Override
    public Escribible leer(String url,Long timestamp) {
      try {
            FileReader fr = new FileReader(url);
            BufferedReader br= new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine()) != null)
            {
               String[] sl = linea.split("\\|");
               if(sl[0].equals(timestamp.toString()))
               {
                   this.timestamp = Long.parseLong(sl[0]);
                   this.codigoError = Integer.parseInt(sl[1]);
                   this.descripcion = sl[2];
                   return this;
               }
               
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("FileNotFoundException");
        }
        catch(UnsupportedEncodingException ex)
        {
        System.out.println("UnsupportedEncodingException");
        }   
        catch (IOException ex) {
            System.out.println("IOException");
        }
      
      return null;
    }

    
    
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
