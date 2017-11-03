import com.amazonaws.encryptionsdk.AwsCrypto;
import com.amazonaws.encryptionsdk.CryptoAlgorithm;
import com.amazonaws.encryptionsdk.CryptoResult;
import com.amazonaws.encryptionsdk.kms.KmsMasterKey;
import com.amazonaws.encryptionsdk.kms.KmsMasterKeyProvider;
import org.apache.commons.io.FilenameUtils;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.jar.JarEntry;

public class DataMigrationEncryptionDaemon {
    private static String targetFolder;      //the folder whose files are being encrypted   -passed though CLI args[1]
    private static String outputFolder;      //the output folder that will contain the processed files -- CLI args[2]

    //Constructor
   public DataMigrationEncryptionDaemon(String targetFolder, String outputFolder) throws IOException{
        this();
   }
   public DataMigrationEncryptionDaemon() throws IOException{
       getLogin();
   }
    //gets the login information for kms
    //TODO do something if the env var is null
   public static void getLogin(){

       String AWSarn = System.getenv("JavaTestEnvVar");
    if(AWSarn == null){
        //do something
    }else
        System.out.println(AWSarn);
   }

    public static void main(String[] args) throws IOException {
    DataMigrationEncryptionDaemon daemon = new DataMigrationEncryptionDaemon();
        if(args.length == 3){
            System.out.println("move file operations");
        }else if(args.length == 2 && args[1].toLowerCase().equals("here")){
            System.out.println("here operations");
        }

    }
}