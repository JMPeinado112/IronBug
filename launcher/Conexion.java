import java.sql. *; 
class Conexion {
          Connection con; 
          Statement sql;
          ResultSet res;
          
          public static final String url = "jdbc:mysql://localhost:3307/daw2?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";  
          public static final String name = "com.mysql.cj.jdbc.Driver";  
          public static final String user = "root";  
          public static final String password = "usbw";  
          
                     public Connection getConnection () {
        	           try {
        		  Class.forName(name);
        		           System.out.println ("El controlador de la base de datos se cargó correctamente");
        	  }catch(ClassNotFoundException e){
        		  e.printStackTrace();
        	  }
        	  try {
        		           con = DriverManager.getConnection (url, user, password); 
        		           System.out.println ("Conexión de base de datos exitosa");
        	  }catch(SQLException e) {
        		  e.printStackTrace();
        	  }
        	           return con; 
          }
                     public static void main (String [] args) {
        	           Conexion c = new Conexion(); 
        	            c.getConnection ();           
        	            }
}
