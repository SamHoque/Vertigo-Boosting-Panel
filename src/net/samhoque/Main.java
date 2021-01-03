package net.samhoque;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import java.awt.Robot;
import javafx.stage.Stage;
import net.samhoque.boost.FXMLController;
import net.samhoque.boost.Timers;
import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application implements NativeKeyListener {
    private static Timers atual;
    private static Runtime runtime;
    public ArrayList<String> users;
    private static Robot robot;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Actual Init
        Main.setRuntime(Runtime.getRuntime());
        Main.setRobot(new Robot());
        Main.setAtual(Timers.IDLE);

        //Settings Init
        System.out.println("checking if the settings exist");
        File config = new File("config.txt");
        if (!config.exists()) {
            System.out.println("config.txt does not exist, creating it");
            config.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("config.txt"));
            bufferedWriter.append("acc1:pass1\nacc2:pass2\nacc3:pass3\nacc4:pass4\nacc5:pass5\nacc6:pass6\nacc7:pass7\nacc8:pass8\nacc9:pass9\nacc10:pass10\nC:\\Program Files (x86)\\Steam\\Steam.exe");
            bufferedWriter.close();
        } else {
            System.out.println("config.txt already exists");
        }
        File delays = new File("delays.txt");
        if (!delays.exists()) {
            System.out.println("delays.txt does not exist, creating it");
            delays.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("delays.txt"));
            bufferedWriter.append("135\r\n13\r\n36\r\n1\r\n42\r\n135\r\n13\r\n36\r\n1\r\n42\r\n135\r\n13\r\n36\r\n1\r\n42\r\n40\r\n30");
            bufferedWriter.close();
        } else {
            System.out.println("delays.txt already exists");
        }


        //GUI Init
        Parent root = FXMLLoader.load(getClass().getResource("FXMLPainel.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.setTitle("VertigoBoost - Coded by SamHoque#1337");
        primaryStage.setX(320.0);
        primaryStage.setY(460.0);
        primaryStage.getIcons().add(new Image("net/samhoque/logo.png"));
        primaryStage.setOnCloseRequest(windowEvent -> {
            Platform.exit();
            System.exit(0);
        });

        //
        System.out.println("starting loop for the program to work");
        new FXMLController().task();
        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.WARNING);
        logger.setUseParentHandlers(false);
        GlobalScreen.registerNativeHook();
        GlobalScreen.addNativeKeyListener(this);
        System.out.println("fully loaded program");
        System.out.println("remember to load the config before starting to use the program");
        System.out.println("good boost!");
       // BoostMetodos.killAllExe("conhost.exe");
    }


    public static void setAtual(final Timers timers) {
        Main.atual = timers;
    }

    public static Robot getRobot() {
        return Main.robot;
    }

    public static Runtime getRuntime() {
        return Main.runtime;
    }

    public static Timers getAtual() {
        return Main.atual;
    }

    public static void setRobot(final Robot robot) {
        Main.robot = robot;
    }

    public static void setRuntime(final Runtime runtime) {
        Main.runtime = runtime;
    }

    public Main() {
        this.users = new ArrayList<String>();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nativeKeyEvent) {

    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
        if (nativeKeyEvent.getKeyCode() == 66) {
            System.out.println("[F8] setting idle..");
            setAtual(Timers.IDLE);
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nativeKeyEvent) {

    }
}
