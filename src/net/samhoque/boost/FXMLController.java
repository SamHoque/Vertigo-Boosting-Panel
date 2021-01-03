package net.samhoque.boost;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import net.samhoque.BoostMetodos;
import net.samhoque.Main;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class FXMLController {
    public TextField delay3;

    public TextField delay2;

    public TextField delay8;
    public static int del14;

    public TextField delay11;
    public static int del12;
    public static int del11;
    private static int modo;

    public TextField delay6;
    public static int del16;

    public PasswordField pass7;

    public TextField delay13;
    public static int del10;
    public static int del17;

    public PasswordField pass3;

    public TextField acc5;
    public static int del8;
    public static int del7;
    private static Boolean boostar;

    public PasswordField pass4;

    public PasswordField pass5;

    public TextField acc6;

    public TextField acc3;

    public TextField delay4;

    public PasswordField pass2;

    public PasswordField pass1;

    public TextField acc4;
    public static int del4;
    public static int del2;

    public TextField delay12;

    public PasswordField pass9;

    public TextField delay5;

    public TextField acc10;

    public TextField delay16;

    public TextField delay14;

    public TextField delay15;

    public TextField delay17;

    public TextField delay10;
    public static int del6;

    public PasswordField pass8;

    public TextField acc9;

    public TextField textload1;
    public static int del3;
    public static int del9;

    public TextField textload2;

    public TextField delay9;

    public TextField delay7;

    public TextField acc1;

    public TextField delay1;
    public static int del5;

    public TextField acc2;

    public PasswordField pass10;

    public TextField acc7;
    private static int random;

    public TextField steamlocation;
    public static int del15;
    public static int del13;

    public PasswordField pass6;

    public TextField acc8;
    public static int del1;

    static {
        del1 = 0;
        del2 = 0;
        del3 = 0;
        del4 = 0;
        del5 = 0;
        del6 = 0;
        del7 = 0;
        del8 = 0;
        del9 = 0;
        del10 = 0;
        del11 = 0;
        del12 = 0;
        del13 = 0;
        del14 = 0;
        del15 = 0;
        del16 = 0;
        del17 = 0;
    }


    public void abrir5(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc5.getText(), this.pass5.getText(), "320", "230");
    }

    public void abrir1(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc1.getText(), this.pass1.getText(), "0", "0");
    }

    public void abrir4(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc4.getText(), this.pass4.getText(), "320", "0");
    }

    public void abrir3(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc3.getText(), this.pass3.getText(), "0", "460");
    }

    public void abrir2(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc2.getText(), this.pass2.getText(), "0", "230");
    }

    public void abrir6(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc6.getText(), this.pass6.getText(), "960", "0");
    }

    public void abrir7(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc7.getText(), this.pass7.getText(), "960", "230");
    }

    public void abrir8(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc8.getText(), this.pass8.getText(), "960", "460");
    }

    public void abrir10(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc10.getText(), this.pass10.getText(), "640", "230");
    }


    public void abrir9(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc9.getText(), this.pass9.getText(), "640", "0");
    }

    public void load1(ActionEvent actionEvent) throws IOException {
        if (this.textload1.getText() == null) {
            System.out.println("you need to write the file name (without using .txt)");
            return;
        }
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(new StringBuilder(String.valueOf(this.textload1.getText())).append(".txt"))));
            int i = 1;
            while ((str = bufferedReader.readLine()) != null) {
                if (str.contains(":")) {
                    String[] split = str.split(":");
                    if (i == 1) {
                        this.acc1.setText(split[0]);
                        this.pass1.setText(split[1]);
                    }
                    if (i == 2) {
                        this.acc2.setText(split[0]);
                        this.pass2.setText(split[1]);
                    }
                    if (i == 3) {
                        this.acc3.setText(split[0]);
                        this.pass3.setText(split[1]);
                    }
                    if (i == 4) {
                        this.acc4.setText(split[0]);
                        this.pass4.setText(split[1]);
                    }
                    if (i == 5) {
                        this.acc5.setText(split[0]);
                        this.pass5.setText(split[1]);
                    }
                } else {
                    String[] split = str.split("\t");
                    if (i == 1) {
                        this.acc1.setText(split[0]);
                        this.pass1.setText(split[1]);
                    }
                    if (i == 2) {
                        this.acc2.setText(split[0]);
                        this.pass2.setText(split[1]);
                    }
                    if (i == 3) {
                        this.acc3.setText(split[0]);
                        this.pass3.setText(split[1]);
                    }
                    if (i == 4) {
                        this.acc4.setText(split[0]);
                        this.pass4.setText(split[1]);
                    }
                    if (i == 5) {
                        this.acc5.setText(split[0]);
                        this.pass5.setText(split[1]);
                    }
                }
                i++;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("this txt file does not exist");
        }
    }

    public void load2(ActionEvent actionEvent) {
        if (this.textload2.getText() == null) {
            System.out.println("you need to write the file name (without using .txt)");
            return;
        }
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(new StringBuilder(String.valueOf(this.textload2.getText())).append(".txt"))));
            int i = 1;
            while ((str = bufferedReader.readLine()) != null) {
                if (str.contains(":")) {
                    String[] split = str.split(":");
                    if (i == 1) {
                        this.acc6.setText(split[0]);
                        this.pass6.setText(split[1]);
                    }
                    if (i == 2) {
                        this.acc7.setText(split[0]);
                        this.pass7.setText(split[1]);
                    }
                    if (i == 3) {
                        this.acc8.setText(split[0]);
                        this.pass8.setText(split[1]);
                    }
                    if (i == 4) {
                        this.acc9.setText(split[0]);
                        this.pass9.setText(split[1]);
                    }
                    if (i == 5) {
                        this.acc10.setText(split[0]);
                        this.pass10.setText(split[1]);
                    }
                } else {
                    String[] split = str.split("\t");
                    if (i == 1) {
                        this.acc6.setText(split[0]);
                        this.pass6.setText(split[1]);
                    }
                    if (i == 2) {
                        this.acc7.setText(split[0]);
                        this.pass7.setText(split[1]);
                    }
                    if (i == 3) {
                        this.acc8.setText(split[0]);
                        this.pass8.setText(split[1]);
                    }
                    if (i == 4) {
                        this.acc9.setText(split[0]);
                        this.pass9.setText(split[1]);
                    }
                    if (i == 5) {
                        this.acc10.setText(split[0]);
                        this.pass10.setText(split[1]);
                    }
                }
                ++i;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("this txt file does not exist");
        }
    }

    public void carregar(ActionEvent actionEvent) throws IOException {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("config.txt"));
        int i = 1;
        while ((str = bufferedReader.readLine()) != null) {
            String[] split = str.split(":");
            if (i == 1) {
                this.acc1.setText(split[0]);
                this.pass1.setText(split[1]);
            }
            if (i == 2) {
                this.acc2.setText(split[0]);
                this.pass2.setText(split[1]);
            }
            if (i == 3) {
                this.acc3.setText(split[0]);
                this.pass3.setText(split[1]);
            }
            if (i == 4) {
                this.acc4.setText(split[0]);
                this.pass4.setText(split[1]);
            }
            if (i == 5) {
                this.acc5.setText(split[0]);
                this.pass5.setText(split[1]);
            }
            if (i == 6) {
                this.acc6.setText(split[0]);
                this.pass6.setText(split[1]);
            }
            if (i == 7) {
                this.acc7.setText(split[0]);
                this.pass7.setText(split[1]);
            }
            if (i == 8) {
                this.acc8.setText(split[0]);
                this.pass8.setText(split[1]);
            }
            if (i == 9) {
                this.acc9.setText(split[0]);
                this.pass9.setText(split[1]);
            }
            if (i == 10) {
                this.acc10.setText(split[0]);
                this.pass10.setText(split[1]);
            }
            if (i == 11) {
                this.steamlocation.setText(str);
            }
            i++;
        }
        bufferedReader.close();
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("delays.txt"));
        int i2 = 1;
        while ((str = bufferedReader1.readLine()) != null) {
            if (i2 == 1) {
                this.delay1.setText(str);
                del1 = Integer.parseInt(str);
            }
            if (i2 == 2) {
                this.delay2.setText(str);
                del2 = Integer.parseInt(str);
            }
            if (i2 == 3) {
                this.delay3.setText(str);
                del3 = Integer.parseInt(str);
            }
            if (i2 == 4) {
                this.delay4.setText(str);
                del4 = Integer.parseInt(str);
            }
            if (i2 == 5) {
                this.delay5.setText(str);
                del5 = Integer.parseInt(str);
            }
            if (i2 == 6) {
                this.delay6.setText(str);
                del6 = Integer.parseInt(str);
            }
            if (i2 == 7) {
                this.delay7.setText(str);
                del7 = Integer.parseInt(str);
            }
            if (i2 == 8) {
                this.delay8.setText(str);
                del8 = Integer.parseInt(str);
            }
            if (i2 == 9) {
                this.delay9.setText(str);
                del9 = Integer.parseInt(str);
            }
            if (i2 == 10) {
                this.delay10.setText(str);
                del10 = Integer.parseInt(str);
            }
            if (i2 == 11) {
                this.delay11.setText(str);
                del11 = Integer.parseInt(str);
            }
            if (i2 == 12) {
                this.delay12.setText(str);
                del12 = Integer.parseInt(str);
            }
            if (i2 == 13) {
                this.delay13.setText(str);
                del13 = Integer.parseInt(str);
            }
            if (i2 == 14) {
                this.delay14.setText(str);
                del14 = Integer.parseInt(str);
            }
            if (i2 == 15) {
                this.delay15.setText(str);
                del15 = Integer.parseInt(str);
            }
            if (i2 == 16) {
                this.delay16.setText(str);
                del16 = Integer.parseInt(str);
            }
            if (i2 == 17) {
                this.delay17.setText(str);
                del17 = Integer.parseInt(str);
            }
            i2++;
        }
        bufferedReader1.close();
    }

    public void salvar(ActionEvent actionEvent) throws IOException {
        FileWriter fileWriter = new FileWriter("config.txt");
        fileWriter.write("");
        fileWriter.flush();
        fileWriter.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("config.txt"));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc1.getText())).append(":").append(this.pass1.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc2.getText())).append(":").append(this.pass2.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc3.getText())).append(":").append(this.pass3.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc4.getText())).append(":").append(this.pass4.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc5.getText())).append(":").append(this.pass5.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc6.getText())).append(":").append(this.pass6.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc7.getText())).append(":").append(this.pass7.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc8.getText())).append(":").append(this.pass8.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc9.getText())).append(":").append(this.pass9.getText()).append("\n")));
        bufferedWriter.append(String.valueOf(new StringBuilder(String.valueOf(this.acc10.getText())).append(":").append(this.pass10.getText()).append("\n")));
        bufferedWriter.append(this.steamlocation.getText());
        bufferedWriter.close();
        FileWriter fileWriter1 = new FileWriter("delays.txt");
        fileWriter1.write("");
        fileWriter1.flush();
        fileWriter1.close();
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("delays.txt"));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay1.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay2.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay3.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay4.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay5.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay6.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay7.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay8.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay9.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay10.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay11.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay12.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay13.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay14.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay15.getText())).append("\n")));
        bufferedWriter1.append(String.valueOf(new StringBuilder(String.valueOf(this.delay16.getText())).append("\n")));
        bufferedWriter1.append(this.delay17.getText());
        bufferedWriter1.close();
        del1 = Integer.parseInt(this.delay1.getText());
        del2 = Integer.parseInt(this.delay2.getText());
        del3 = Integer.parseInt(this.delay3.getText());
        del4 = Integer.parseInt(this.delay4.getText());
        del5 = Integer.parseInt(this.delay5.getText());
        del6 = Integer.parseInt(this.delay6.getText());
        del7 = Integer.parseInt(this.delay7.getText());
        del8 = Integer.parseInt(this.delay8.getText());
        del9 = Integer.parseInt(this.delay9.getText());
        del10 = Integer.parseInt(this.delay10.getText());
        del11 = Integer.parseInt(this.delay11.getText());
        del12 = Integer.parseInt(this.delay12.getText());
        del13 = Integer.parseInt(this.delay13.getText());
        del14 = Integer.parseInt(this.delay14.getText());
        del15 = Integer.parseInt(this.delay15.getText());
        del16 = Integer.parseInt(this.delay16.getText());
        del17 = Integer.parseInt(this.delay17.getText());
    }

    public void abrir(ActionEvent actionEvent) throws IOException {
        this.AbrirConta(this.acc1.getText(), this.pass1.getText(), "0", "0");
        this.AbrirConta(this.acc2.getText(), this.pass2.getText(), "0", "230");
        this.AbrirConta(this.acc3.getText(), this.pass3.getText(), "0", "460");
        this.AbrirConta(this.acc4.getText(), this.pass4.getText(), "320", "0");
        this.AbrirConta(this.acc5.getText(), this.pass5.getText(), "320", "230");
        this.AbrirConta(this.acc6.getText(), this.pass6.getText(), "960", "0");
        this.AbrirConta(this.acc7.getText(), this.pass7.getText(), "960", "230");
        this.AbrirConta(this.acc8.getText(), this.pass8.getText(), "960", "460");
        this.AbrirConta(this.acc9.getText(), this.pass9.getText(), "640", "0");
        this.AbrirConta(this.acc10.getText(), this.pass10.getText(), "640", "230");
    }

    public void fechar(ActionEvent actionEvent) throws IOException {
        BoostMetodos.killAllExe("csgo.exe");
        BoostMetodos.killAllExe("Steam.exe");
        BoostMetodos.killAllExe("steamwebhelper.exe");
        BoostMetodos.killAllExe("gameoverlayui.exe");
    }

    public void aao(ActionEvent actionEvent) throws IOException, AWTException, InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.AAO);
    }

    public void createlobby(ActionEvent actionEvent) throws InterruptedException, IOException, AWTException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.OTRO);
        this.criarlobbys();
        Main.setAtual(Timers.IDLE);
    }

    public void iniciar(ActionEvent actionEvent) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.BOOST16x0);
    }

    public void aao2(ActionEvent actionEvent) throws IOException, FileNotFoundException, InterruptedException, AWTException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.AAO2);
    }

    public void criar(ActionEvent actionEvent) throws AWTException, IOException, InterruptedException, FileNotFoundException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.BOOST15x15);
    }


    public void derank(ActionEvent actionEvent) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.DERANK);
    }

    public void stop(ActionEvent actionEvent) throws IOException {
        Main.setAtual(Timers.IDLE);
        FXMLController.setModo(1);
        System.out.println("PARA PARA PARA");
    }

    public void iniciar2(ActionEvent actionEvent) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.BOOST16x02);
    }

    public void X9(ActionEvent actionEvent) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.BOOST9X0);
    }

    public void X92(ActionEvent actionEvent) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.BOOST9X02);
    }

    public void aa1(ActionEvent actionEvent) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.AAO1);
    }


    public void createlobby2(ActionEvent actionEvent) throws InterruptedException {

        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.OTRO);
        this.criarlobbys2();
        Main.setAtual(Timers.IDLE);
    }

    public void aa21(ActionEvent actionEvent) throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3L));
        Main.setAtual(Timers.AAO21);
    }

    public void steam(ActionEvent actionEvent) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://samhoque.dev"));
    }

    public void discord(ActionEvent actionEvent) throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI("https://samhoque.dev"));
    }

    public void achouBusca1(int mod, int mod2) throws InterruptedException {
        if (FXMLController.getModo() == mod2 && (Main.getRobot().getPixelColor(176, 362).getRGB() == new Color(76, 175, 80).getRGB() || Main.getRobot().getPixelColor(176, 362).getRGB() == new Color(113, 214, 117).getRGB() || Main.getRobot().getPixelColor(152, 361).getRGB() == new Color(255, 255, 255).getRGB())) {
            System.out.println("Achou lobby 1");
            BoostMetodos.Sleep2(50);
            BoostMetodos.irClicar(164, 130);
            BoostMetodos.irClicar(164, 130);
            BoostMetodos.irClicar(164, 362);
            BoostMetodos.irClicar(164, 362);
            BoostMetodos.irClicar(164, 591);
            BoostMetodos.irClicar(164, 591);
            BoostMetodos.irClicar(479, 128);
            BoostMetodos.irClicar(479, 128);
            BoostMetodos.irClicar(479, 360);
            BoostMetodos.irClicar(479, 360);
            System.out.println("Iniciando Modo GAME");
            FXMLController.setModo(mod);
            BoostMetodos.fim();
        }
        if (FXMLController.getModo() == mod2 && (Main.getRobot().getPixelColor(176, 362).getRGB() != new Color(76, 175, 80).getRGB() || Main.getRobot().getPixelColor(176, 362).getRGB() != new Color(113, 214, 117).getRGB() || Main.getRobot().getPixelColor(152, 361).getRGB() != new Color(255, 255, 255).getRGB()) && Main.getRobot().getPixelColor(215, 219).getRGB() != new Color(48, 2, 2).getRGB()) {
            BoostMetodos.irClicar(175, 223);
            BoostMetodos.Sleep2(150);
            BoostMetodos.irClicar(221, 221);
            BoostMetodos.Sleep2(150);
            BoostMetodos.fim();
        }
    }

    public static Boolean getBoostar() {
        return boostar;
    }

    public void achouBuscawingman(int mod, int mod2, int mod3) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        BoostMetodos.Sleep2(50);
        if (FXMLController.getModo() == mod3 && (Main.getRobot().getPixelColor(176, 362).getRGB() == new Color(76, 175, 80).getRGB() || Main.getRobot().getPixelColor(176, 362).getRGB() == new Color(113, 214, 117).getRGB() || Main.getRobot().getPixelColor(152, 361).getRGB() == new Color(255, 255, 255).getRGB())) {
            System.out.println("Achou lobby 1");
            BoostMetodos.Sleep2(50);
            if (Main.getRobot().getPixelColor(1139, 364).getRGB() == new Color(76, 175, 80).getRGB() || Main.getRobot().getPixelColor(1139, 364).getRGB() == new Color(91, 203, 95).getRGB() || Main.getRobot().getPixelColor(1117, 363).getRGB() == new Color(255, 255, 255).getRGB()) {
                System.out.println("Achou lobby 2");
                BoostMetodos.irClicar(164, 130);
                BoostMetodos.irClicar(164, 130);
                BoostMetodos.irClicar(164, 362);
                BoostMetodos.irClicar(164, 362);
                BoostMetodos.irClicar(803, 129);
                BoostMetodos.irClicar(803, 129);
                BoostMetodos.irClicar(803, 359);
                BoostMetodos.irClicar(803, 359);
                System.out.println("Iniciando Modo GAME");
                FXMLController.setModo(mod);
                BoostMetodos.fim();
            } else {
                System.out.println("Cancelando Busca");
                BoostMetodos.irClicar(164, 130);
                BoostMetodos.irClicar(1181, 222);
                BoostMetodos.Sleep(90);
                FXMLController.setModo(mod2);
                BoostMetodos.fim();
            }
        }
        BoostMetodos.Sleep2(20);
        if (FXMLController.getModo() == mod3 && (Main.getRobot().getPixelColor(1139, 364).getRGB() == new Color(76, 175, 80).getRGB() || Main.getRobot().getPixelColor(1139, 364).getRGB() == new Color(91, 203, 95).getRGB() || Main.getRobot().getPixelColor(1117, 363).getRGB() == new Color(255, 255, 255).getRGB())) {
            System.out.println("Achou lobby 2");
            BoostMetodos.Sleep2(50);
            if (Main.getRobot().getPixelColor(176, 362).getRGB() == new Color(76, 175, 80).getRGB() || Main.getRobot().getPixelColor(176, 362).getRGB() == new Color(113, 214, 117).getRGB() || Main.getRobot().getPixelColor(152, 361).getRGB() == new Color(255, 255, 255).getRGB()) {
                System.out.println("Achou lobby 1");
                BoostMetodos.irClicar(164, 130);
                BoostMetodos.irClicar(164, 130);
                BoostMetodos.irClicar(164, 362);
                BoostMetodos.irClicar(164, 362);
                BoostMetodos.irClicar(803, 129);
                BoostMetodos.irClicar(803, 129);
                BoostMetodos.irClicar(803, 359);
                BoostMetodos.irClicar(803, 359);
                System.out.println("Iniciando Modo GAME");
                FXMLController.setModo(mod);
                BoostMetodos.fim();
            } else {
                System.out.println("Cancelando Busca");
                BoostMetodos.irClicar(1118, 127);
                BoostMetodos.irClicar(220, 221);
                BoostMetodos.Sleep(90);
                FXMLController.setModo(mod2);
                BoostMetodos.fim();
            }
        }
        BoostMetodos.Sleep2(20);
        if (FXMLController.getModo() == mod3) {
            System.out.println("tentando achar erro...");
            if ((Main.getRobot().getPixelColor(176, 362).getRGB() != new Color(76, 175, 80).getRGB() || Main.getRobot().getPixelColor(176, 362).getRGB() != new Color(113, 214, 117).getRGB() || Main.getRobot().getPixelColor(152, 361).getRGB() != new Color(255, 255, 255).getRGB()) && Main.getRobot().getPixelColor(215, 219).getRGB() != new Color(48, 2, 2).getRGB()) {
                BoostMetodos.irClicar(175, 223);
                BoostMetodos.Sleep2(150);
                BoostMetodos.irClicar(221, 221);
                BoostMetodos.Sleep2(150);
                BoostMetodos.fim();
            }
            if ((Main.getRobot().getPixelColor(1139, 364).getRGB() != new Color(76, 175, 80).getRGB() || Main.getRobot().getPixelColor(1139, 364).getRGB() != new Color(91, 203, 95).getRGB() || Main.getRobot().getPixelColor(1117, 363).getRGB() != new Color(255, 255, 255).getRGB()) && Main.getRobot().getPixelColor(1179, 223).getRGB() != new Color(48, 2, 2).getRGB()) {
                BoostMetodos.irClicar(1121, 222);
                BoostMetodos.Sleep2(150);
                BoostMetodos.irClicar(1183, 221);
                BoostMetodos.Sleep2(150);
                BoostMetodos.fim();
            }
        }
    }


    public void gamelobby1(int ldr, int ld2) throws InterruptedException {
        BoostMetodos.mouseDelay(del17);
        BoostMetodos.Sleep(del1);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep(del2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del4);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del5);
        BoostMetodos.Sleep(5);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.Sleep(7);
        BoostMetodos.disc(ld2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ld2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ld2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ld2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ld2, 2);
        BoostMetodos.Sleep(30);
    }


    public void empate(int ldr, int ldr2) throws InterruptedException {
        BoostMetodos.mouseDelay(del17);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del6);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep(del7);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del9);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del10);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 5);
        BoostMetodos.Sleep(del7);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 4);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 4);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del7);
        BoostMetodos.rec(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr2, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del8);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.Sleep(15);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep(30);
    }


    public void criarlobbys() throws InterruptedException {
        System.out.println(del16);
        BoostMetodos.mouseDelay(del16);
        BoostMetodos.desbugar(1);
        BoostMetodos.desbugar(2);
        BoostMetodos.desbugar(3);
        BoostMetodos.desbugar(4);
        BoostMetodos.desbugar(5);
        BoostMetodos.abrirSala(1);
        BoostMetodos.chamarAcc(1, 1);
        BoostMetodos.chamarAcc(1, 2);
        BoostMetodos.chamarAcc(1, 3);
        BoostMetodos.chamarAcc(1, 4);
        BoostMetodos.Sleep(3);
        BoostMetodos.aceitar(1);
        BoostMetodos.aceitar(2);
        BoostMetodos.aceitar(3);
        BoostMetodos.aceitar(4);
        BoostMetodos.desbugar(6);
        BoostMetodos.desbugar(7);
        BoostMetodos.desbugar(8);
        BoostMetodos.desbugar(9);
        BoostMetodos.desbugar(10);
        BoostMetodos.abrirSala(2);
        BoostMetodos.chamarAcc(2, 5);
        BoostMetodos.chamarAcc(2, 6);
        BoostMetodos.chamarAcc(2, 7);
        BoostMetodos.chamarAcc(2, 8);
        BoostMetodos.Sleep(3);
        BoostMetodos.aceitar(5);
        BoostMetodos.aceitar(6);
        BoostMetodos.aceitar(7);
        BoostMetodos.aceitar(8);
        BoostMetodos.Sleep(5);
    }

    public void wingman(int ldr1, int ldr2) throws InterruptedException {
        BoostMetodos.mouseDelay(del17);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del11);
        BoostMetodos.disc(ldr1, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr1, 2);
        BoostMetodos.Sleep(del12);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr1, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr1, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del13);
        BoostMetodos.disc(ldr1, 2);
        BoostMetodos.Sleep2(350);
        BoostMetodos.disc(ldr1, 1);
        BoostMetodos.Sleep(del12);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr1, 2);
        BoostMetodos.Sleep2(350);
        BoostMetodos.rec(ldr1, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del13);
        BoostMetodos.disc(ldr1, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr1, 2);
        BoostMetodos.Sleep(del12);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr1, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr1, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del13);
        BoostMetodos.disc(ldr1, 2);
        BoostMetodos.Sleep2(350);
        BoostMetodos.disc(ldr1, 1);
        BoostMetodos.Sleep(del12);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr1, 2);
        BoostMetodos.Sleep2(350);
        BoostMetodos.rec(ldr1, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del15);
        BoostMetodos.disc(ldr1, 1);
        BoostMetodos.Sleep2(350);
        BoostMetodos.disc(ldr1, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(10);
        BoostMetodos.disc(ldr2, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr2, 2);
        BoostMetodos.Sleep(30);
    }

    public void criarlobbys1() throws InterruptedException {
        BoostMetodos.mouseDelay(del16);
        BoostMetodos.desbugar(1);
        BoostMetodos.desbugar(2);
        BoostMetodos.desbugar(3);
        BoostMetodos.desbugar(4);
        BoostMetodos.desbugar(5);
        BoostMetodos.abrirSala(1);
        BoostMetodos.chamarAcc(1, 1);
        BoostMetodos.chamarAcc(1, 2);
        BoostMetodos.chamarAcc(1, 3);
        BoostMetodos.chamarAcc(1, 4);
        BoostMetodos.Sleep(3);
        BoostMetodos.aceitar(1);
        BoostMetodos.aceitar(2);
        BoostMetodos.aceitar(3);
        BoostMetodos.aceitar(4);
    }

    public void criarlobbys2() throws InterruptedException {
        BoostMetodos.mouseDelay(del16);
        BoostMetodos.desbugar(1);
        BoostMetodos.desbugar(2);
        BoostMetodos.abrirSala2(1);
        BoostMetodos.chamarAcc(1, 1);
        BoostMetodos.desbugar(8);
        BoostMetodos.desbugar(9);
        BoostMetodos.abrirSala2(2);
        BoostMetodos.chamarAcc(2, 5);
        BoostMetodos.Sleep(3);
        BoostMetodos.aceitar(98);
        BoostMetodos.aceitar(99);
    }

    public void iniciarBusca() throws InterruptedException {
        BoostMetodos.Sleep(2);
        BoostMetodos.mouseDelay(del17);
        BoostMetodos.irClicar(175, 223);
        BoostMetodos.Sleep2(150);
        BoostMetodos.irClicar(1121, 222);
        BoostMetodos.Sleep2(150);
        BoostMetodos.irClicar(221, 221);
        BoostMetodos.Sleep2(150);
        BoostMetodos.irClicar(1183, 221);
        BoostMetodos.fim();
    }

    public void iniciarBusca1() throws InterruptedException {
        BoostMetodos.Sleep(2);
        BoostMetodos.mouseDelay(del17);
        BoostMetodos.irClicar(175, 223);
        BoostMetodos.Sleep2(150);
        BoostMetodos.irClicar(221, 221);
        BoostMetodos.fim();
    }

    public void task() {
        new Thread(() -> new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (Main.getAtual() == Timers.IDLE) {
                        FXMLController.setModo(1);
                    }
                    if (Main.getAtual() == Timers.AAO) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.achouBusca(2, 1, 1);
                        }
                        if (FXMLController.getModo() == 2) {
                            Main.setAtual(Timers.IDLE);
                            FXMLController.setModo(1);
                        }
                    }
                    if (Main.getAtual() == Timers.AAO1) {
                        FXMLController.this.achouBuscawingman(1, 1, 1);
                    }
                    if (Main.getAtual() == Timers.AAO21) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.criarlobbys2();
                            FXMLController.setModo(2);
                        }
                        if (FXMLController.getModo() == 2) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(3);
                        }
                        if (FXMLController.getModo() == 3) {
                            FXMLController.this.achouBuscawingman(4, 2, 3);
                        }
                        if (FXMLController.getModo() == 4) {
                            Main.setAtual(Timers.IDLE);
                            FXMLController.setModo(1);
                        }
                    }
                    if (Main.getAtual() == Timers.AAO2) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.criarlobbys();
                            FXMLController.setModo(2);
                        }
                        if (FXMLController.getModo() == 2) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(3);
                        }
                        if (FXMLController.getModo() == 3) {
                            FXMLController.this.achouBusca(4, 2, 3);
                        }
                        if (FXMLController.getModo() == 4) {
                            Main.setAtual(Timers.IDLE);
                            FXMLController.setModo(1);
                        }
                    }
                    if (Main.getAtual() == Timers.DERANK) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.criarlobbys1();
                            FXMLController.setModo(2);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 2) {
                            FXMLController.this.iniciarBusca1();
                            FXMLController.setModo(3);
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 3) {
                            FXMLController.this.achouBusca1(4, 3);
                        }
                        if (FXMLController.getModo() == 4) {
                            FXMLController.this.derank(1);
                            FXMLController.setModo(1);
                        }
                    }
                    if (Main.getAtual() == Timers.BOOST9X0) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.criarlobbys2();
                            FXMLController.setModo(2);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 2) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(3);
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 3) {
                            FXMLController.this.achouBuscawingman(4, 2, 3);
                        }
                        if (FXMLController.getModo() == 4) {
                            FXMLController.this.wingman(2, 1);
                            FXMLController.setModo(5);
                        }
                        if (FXMLController.getModo() == 5) {
                            FXMLController.this.criarlobbys2();
                            FXMLController.setModo(6);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 6) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(7);
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 7) {
                            FXMLController.this.achouBuscawingman(8, 6, 7);
                        }
                        if (FXMLController.getModo() == 8) {
                            FXMLController.this.wingman(1, 2);
                            FXMLController.setModo(1);
                        }
                    }
                    if (Main.getAtual() == Timers.BOOST9X02) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.criarlobbys2();
                            FXMLController.setModo(2);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 2) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(3);
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 3) {
                            FXMLController.this.achouBuscawingman(4, 2, 3);
                        }
                        if (FXMLController.getModo() == 4) {
                            FXMLController.this.wingman(2, 1);
                            FXMLController.setModo(5);
                        }
                        if (FXMLController.getModo() == 5) {
                            FXMLController.this.criarlobbys2();
                            FXMLController.setModo(6);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 6) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(7);
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 7) {
                            FXMLController.this.achouBuscawingman(8, 6, 7);
                        }
                        if (FXMLController.getModo() == 8) {
                            FXMLController.this.wingman(2, 1);
                            FXMLController.setModo(1);
                        }
                    }
                    if (Main.getAtual() == Timers.BOOST16x0) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.criarlobbys();
                            FXMLController.setModo(2);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 2) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(3);
                            BoostMetodos.fim();
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 3) {
                            FXMLController.this.achouBusca(4, 2, 3);
                        }
                        if (FXMLController.getModo() == 4) {
                            FXMLController.this.gamelobby1(2, 1);
                            FXMLController.setModo(5);
                        }
                        if (FXMLController.getModo() == 5) {
                            FXMLController.this.criarlobbys();
                            FXMLController.setModo(6);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 6) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(7);
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 7) {
                            FXMLController.this.achouBusca(8, 6, 7);
                        }
                        if (FXMLController.getModo() == 8) {
                            BoostMetodos.fim();
                            FXMLController.this.gamelobby1(1, 2);
                            FXMLController.setModo(1);
                        }
                    }
                    if (Main.getAtual() == Timers.BOOST16x02) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.criarlobbys();
                            FXMLController.setModo(2);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 2) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(3);
                            BoostMetodos.fim();
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 3) {
                            FXMLController.this.achouBusca(4, 2, 3);
                        }
                        if (FXMLController.getModo() == 4) {
                            BoostMetodos.fim();
                            FXMLController.this.gamelobby1(2, 1);
                            FXMLController.setModo(5);
                        }
                        if (FXMLController.getModo() == 5) {
                            FXMLController.this.criarlobbys();
                            FXMLController.setModo(6);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 6) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(7);
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 7) {
                            FXMLController.this.achouBusca(8, 6, 7);
                        }
                        if (FXMLController.getModo() == 8) {
                            FXMLController.this.gamelobby1(2, 1);
                            FXMLController.setModo(1);
                        }
                    }
                    if (Main.getAtual() == Timers.BOOST15x15) {
                        if (FXMLController.getModo() == 1) {
                            FXMLController.this.criarlobbys();
                            FXMLController.setModo(2);
                            System.out.println("Criou as lobbys");
                        }
                        if (FXMLController.getModo() == 2) {
                            FXMLController.this.iniciarBusca();
                            FXMLController.setModo(3);
                            System.out.println("Iniciando busca");
                        }
                        if (FXMLController.getModo() == 3) {
                            FXMLController.this.achouBusca(4, 2, 3);
                        }
                        if (FXMLController.getModo() == 4) {
                            FXMLController.this.empate(1, 2);
                            FXMLController.setModo(1);
                        }
                    }
                } catch (InterruptedException e) {
                    System.out.println(new StringBuilder("Erro: ").append(e.getMessage()));
                }
            }
        }, 0L, 20L)).start();
    }

    public void achouBusca(int mod, int mod2, int mod3) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        int color1 = Main.getRobot().getPixelColor(176, 362).getRGB();
        int color2 = Main.getRobot().getPixelColor(152, 361).getRGB();
        int color3 = Main.getRobot().getPixelColor(1139, 364).getRGB();
        int color4 = Main.getRobot().getPixelColor(1117, 363).getRGB();
        int color5 = Main.getRobot().getPixelColor(215, 219).getRGB();
        int color6 = Main.getRobot().getPixelColor(1179, 223).getRGB();
        if (FXMLController.getModo() == mod3) {
            if (color1 == new Color(76, 175, 80).getRGB() || color1 == new Color(113, 214, 117).getRGB() || color2 == new Color(255, 255, 255).getRGB()) {
                System.out.println("Achou lobby 1");
                BoostMetodos.Sleep2(20);
                if (color3 == new Color(76, 175, 80).getRGB() || color3 == new Color(91, 203, 95).getRGB() || color4 == new Color(255, 255, 255).getRGB()) {
                    System.out.println("Achou lobby 2");
                    BoostMetodos.irClicar(164, 130);
                    BoostMetodos.irClicar(164, 130);
                    BoostMetodos.irClicar(164, 362);
                    BoostMetodos.irClicar(164, 362);
                    BoostMetodos.irClicar(164, 591);
                    BoostMetodos.irClicar(164, 591);
                    BoostMetodos.irClicar(479, 128);
                    BoostMetodos.irClicar(479, 128);
                    BoostMetodos.irClicar(479, 360);
                    BoostMetodos.irClicar(479, 360);
                    BoostMetodos.irClicar(803, 129);
                    BoostMetodos.irClicar(803, 129);
                    BoostMetodos.irClicar(803, 359);
                    BoostMetodos.irClicar(803, 359);
                    BoostMetodos.irClicar(1118, 127);
                    BoostMetodos.irClicar(1118, 127);
                    BoostMetodos.irClicar(1123, 358);
                    BoostMetodos.irClicar(1123, 358);
                    BoostMetodos.irClicar(1118, 592);
                    BoostMetodos.irClicar(1118, 592);
                    System.out.println("Iniciando Modo GAME");
                    FXMLController.setModo(mod);
                    BoostMetodos.fim();
                } else {
                    System.out.println("Cancelando Busca");
                    BoostMetodos.irClicar(164, 130);
                    BoostMetodos.irClicar(1181, 222);
                    BoostMetodos.Sleep(90);
                    FXMLController.setModo(mod2);
                    BoostMetodos.fim();
                }
            } else if (color5 != new Color(48, 2, 2).getRGB()) {
                BoostMetodos.irClicar(175, 223);
                BoostMetodos.Sleep2(150);
                BoostMetodos.irClicar(221, 221);
                BoostMetodos.fim3();
            }
        }
        if (FXMLController.getModo() == mod3) {
            if (color3 == new Color(76, 175, 80).getRGB() || color3 == new Color(91, 203, 95).getRGB() || color4 == new Color(255, 255, 255).getRGB()) {
                System.out.println("Achou lobby 2");
                BoostMetodos.Sleep2(20);
                if (color1 == new Color(76, 175, 80).getRGB() || color1 == new Color(113, 214, 117).getRGB() || color2 == new Color(255, 255, 255).getRGB()) {
                    System.out.println("Achou lobby 1");
                    BoostMetodos.irClicar(164, 130);
                    BoostMetodos.irClicar(164, 130);
                    BoostMetodos.irClicar(164, 362);
                    BoostMetodos.irClicar(164, 362);
                    BoostMetodos.irClicar(164, 591);
                    BoostMetodos.irClicar(164, 591);
                    BoostMetodos.irClicar(479, 128);
                    BoostMetodos.irClicar(479, 128);
                    BoostMetodos.irClicar(479, 360);
                    BoostMetodos.irClicar(479, 360);
                    BoostMetodos.irClicar(803, 129);
                    BoostMetodos.irClicar(803, 129);
                    BoostMetodos.irClicar(803, 359);
                    BoostMetodos.irClicar(803, 359);
                    BoostMetodos.irClicar(1118, 127);
                    BoostMetodos.irClicar(1118, 127);
                    BoostMetodos.irClicar(1123, 358);
                    BoostMetodos.irClicar(1123, 358);
                    BoostMetodos.irClicar(1118, 592);
                    BoostMetodos.irClicar(1118, 592);
                    System.out.println("Iniciando Modo GAME");
                    FXMLController.setModo(mod);
                    BoostMetodos.fim();
                } else {
                    System.out.println("Cancelando Busca");
                    BoostMetodos.irClicar(1118, 127);
                    BoostMetodos.irClicar(220, 221);
                    BoostMetodos.Sleep(90);
                    FXMLController.setModo(mod2);
                    BoostMetodos.fim();
                }
            } else if (color6 != new Color(48, 2, 2).getRGB()) {
                BoostMetodos.irClicar(1121, 222);
                BoostMetodos.Sleep2(150);
                BoostMetodos.irClicar(1183, 221);
                BoostMetodos.fim3();
            }
        }
    }

    public void derank(int ldr) throws InterruptedException {
        BoostMetodos.mouseDelay(del17);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del1);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep(del2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del2);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del3);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del4);
        BoostMetodos.rec(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 2);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.rec(ldr, 1);
        BoostMetodos.fim();
        BoostMetodos.Sleep(del5);
        BoostMetodos.disc(ldr, 1);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 5);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 3);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 4);
        BoostMetodos.Sleep2(300);
        BoostMetodos.disc(ldr, 2);
        BoostMetodos.Sleep(30);
    }


    public void AbrirConta(String username, String password, String x, String y) throws IOException {
        String options = " -nofriendsui -nochatui -silent -applaunch 730 -novid -w 640 -h 480 -window -noborder -language English +exec boost.cfg +duck +cl_forcepreload 1 ";
        Main.getRuntime().exec(String.valueOf(new StringBuilder(String.valueOf(this.steamlocation.getText())).append(" -no-browser -login ")
                .append(username).append(" ").append(password).append(options).append("-x ").append(x).append(" -y ").append(y)));
        
        System.out.println("Abrindo conta (" + username + ")");
    }

    public static synchronized void setModo(int mod) {
        modo = mod;
    }

    public static synchronized int getModo() {
        return modo;
    }
}
