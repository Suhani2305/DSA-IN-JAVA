package Unit_5;

import java.io.*;


//files(reading and writing)
// import java.io.*;
// public class input {
//     public static void main(String[] args) {
//         try(BufferedReader r = new BufferedReader(new FileReader("input.txt"))) {
//             String line;
//             while ((line = r.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
    
// }

// public class input{
//     public static void main(String[] args){
//         try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
//             writer.write("Hello World!");
//             writer.newLine(); // write a new line
//             writer.write("This is a test file.");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//     }
// }



//network connections (reading and writer data over a network)
// import java.net.*;
// import java.io.*;
// public class input{
//     public static void main(String[] args){
//         try{
//             URL url = new URL("http://www.example.com");
//             BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
//             String line;
//             while((line = r.readLine()) != null){
//                 System.out.println(line);
//             }
//             r.close();
//         }catch(MalformedURLException e){
//             System.out.println("Malformed URL: " + e.getMessage());
//         } catch (IOException e) {
//             System.out.println("IO Exception: " + e.getMessage());
//         }
//     }
// }



// sending data over the network
// import java.net.*;
// import java.io.*;
// public class input{
//     public static void main(String[] args){
//         try{
//             Socket socket = new Socket("localhost", 8080);
//             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//             out.println("Hello from client!");
//             socket.close();
//         }catch(IOException e){
//             System.out.println("IO Exception: " + e.getMessage());
//         }
//     }
// }


// dayabasses (reaidng and writing data using JDBC)
// import java.sql.*;
// public class input{
//     public static void main(String[] args){
//         try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
//             Statement stmt = con.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM users");
//             while(rs.next()){
//                 System.out.println(rs.getString("name"));
//             }
//             con.close();
//         }catch(Exception e){
//             System.out.println("Exception: " + e.getMessage());
//         }
//     }
// }



// mememory buffers  
// we use ByteArrayInputStream and ByteArrayOutputStream to read and write data in memory
// import java.io.*;
// public class input{
//     public static void main(String[] args){
//         try{
//             byte[] data = "Hello World!".getBytes();
//             ByteArrayInputStream input = new ByteArrayInputStream(data);
//             ByteArrayOutputStream output = new ByteArrayOutputStream();
//             int b;
//             while((b = input.read()) != -1){
//                 output.write(b);
//             }
//             System.out.println(output.toString());
//         }
//         catch(IOException e){
//             System.out.println("IO Exception: " + e.getMessage());
//         }
//     }
// }


import java.io.*;
public class input{
    public static void main(String[] args){
        // try(BufferedReader r = new  BufferedReader(new FileReader("example.txt"))){
        //     String line;
        //     while((line = r.readLine()) != null){
        //         System.out.println(line);
        //     }
        try(BufferedWriter w = new BufferedWriter(new FileWriter("example.txt"))){
            w.write("Hello, Java File Hnadling!");
            System.out.println("Data written to file successfully.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}