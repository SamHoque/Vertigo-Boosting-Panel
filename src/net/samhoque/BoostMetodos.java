package net.samhoque;

import net.samhoque.boost.Timers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BoostMetodos {
    public static void abrirAdd(final int i) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        if (i == 1) {
            irClicar(310, 55);
            irClicar(310, 55);
            irClicar(247, 69);
        }
        else if (i == 2) {
            irClicar(1269, 56);
            irClicar(1269, 56);
            irClicar(1209, 71);
        }
    }

    public static void abrirSala2(final int i) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        if (i == 1) {
            irClicar(12, 33);
            irClicar(12, 33);
            irClicar(61, 40);
            irClicar(61, 40);
        }
        else if (i == 2) {
            irClicar(973, 30);
            irClicar(973, 30);
            irClicar(1020, 41);
            irClicar(1020, 41);
        }
    }

    public static void Sleep(final int i) {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(i));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void fim() throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        irClicar(950, 466);
        Sleep(1);
        irClicar(950, 466);
    }

    public static void disconnect() throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        Thread.sleep(150L);
        Main.getRobot().keyPress(75);
        Main.getRobot().keyRelease(75);
    }

    public static void rec(final int i, final int i2) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        System.out.println(String.valueOf(new StringBuilder("Reconectando Acc ").append(i2).append(" do lado ").append(i)));
        if (i == 1) {
            if (i2 == 1) {
                irClicar(243, 11);
            }
            if (i2 == 2) {
                irClicar(241, 242);
            }
            if (i2 == 3) {
                irClicar(242, 472);
            }
            if (i2 == 4) {
                irClicar(563, 13);
            }
            if (i2 == 5) {
                irClicar(563, 241);
            }
        }
        if (i == 2) {
            if (i2 == 1) {
                irClicar(883, 14);
            }
            if (i2 == 2) {
                irClicar(883, 243);
            }
            if (i2 == 3) {
                irClicar(1207, 9);
            }
            if (i2 == 4) {
                irClicar(1207, 240);
            }
            if (i2 == 5) {
                irClicar(1207, 473);
            }
        }
    }

    public static void mouseDelay(final int delay) {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        Main.getRobot().setAutoDelay(delay);
    }

    public static void irClicar(final int x, final int y) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        Main.getRobot().mouseMove(x, y);
        Main.getRobot().delay(40);
        Thread.sleep(50L);
        Main.getRobot().mousePress(16);
        Thread.sleep(50L);
        Main.getRobot().mouseRelease(16);
    }

    public static void colar() {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        Main.getRobot().keyPress(17);
        Main.getRobot().keyPress(86);
        Main.getRobot().keyRelease(86);
        Main.getRobot().keyRelease(17);
    }

    public static void aceitar(final int i) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        if (i == 1) {
            irClicar(308, 290);
            irClicar(308, 290);
            irClicar(308, 290);
        }
        else if (i == 2) {
            irClicar(307, 521);
            irClicar(307, 521);
            irClicar(307, 521);
        }
        else if (i == 3) {
            irClicar(628, 60);
            irClicar(628, 60);
        }
        else if (i == 4) {
            irClicar(632, 290);
            irClicar(632, 290);
            irClicar(632, 290);
        }
        else if (i == 5) {
            irClicar(1268, 291);
            irClicar(1268, 291);
            irClicar(1268, 291);
        }
        else if (i == 6) {
            irClicar(1270, 521);
            irClicar(1270, 521);
            irClicar(1270, 521);
        }
        else if (i == 7) {
            irClicar(948, 60);
            irClicar(948, 60);
            irClicar(948, 60);
        }
        else if (i == 8) {
            irClicar(949, 291);
            irClicar(949, 291);
            irClicar(949, 291);
        }
        else if (i == 98) {
            irClicar(309, 290);
            irClicar(309, 290);
            irClicar(260, 290);
        }
        else if (i == 99) {
            irClicar(1273, 290);
            irClicar(1273, 290);
            irClicar(1224, 290);
        }
    }

    public static void desbugar(final int i) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        if (i == 1) {
            irClicar(310, 55);
            esc();
            irClicar(310, 55);
        }
        else if (i == 2) {
            irClicar(310, 283);
            esc();
            irClicar(310, 283);
        }
        else if (i == 3) {
            irClicar(310, 516);
            esc();
            irClicar(310, 516);
        }
        else if (i == 4) {
            irClicar(629, 55);
            esc();
            irClicar(629, 55);
        }
        else if (i == 5) {
            irClicar(629, 283);
            esc();
            irClicar(629, 283);
        }
        else if (i == 6) {
            irClicar(950, 55);
            esc();
            irClicar(950, 55);
        }
        else if (i == 7) {
            irClicar(950, 283);
            esc();
            irClicar(950, 283);
        }
        else if (i == 8) {
            irClicar(1272, 55);
            esc();
            irClicar(1272, 55);
        }
        else if (i == 9) {
            irClicar(1272, 290);
            esc();
            irClicar(1272, 283);
        }
        else if (i == 10) {
            irClicar(1272, 516);
            esc();
            irClicar(1272, 516);
        }
    }

    public static void iniciar(final int i) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        if (i == 1) {
            irClicar(393, 273);
        }
        else if (i == 2) {
            irClicar(1832, 273);
        }
    }

    public static void Sleep2(final int i) {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        try {
            Thread.sleep(i);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void chamarAcc(final int i, final int i2) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        abrirAdd(i);
        if (i2 == 1) {
            irClicar(310, 284);
            Thread.sleep(150L);
            irClicar(251, 301);
            Thread.sleep(150L);
            irClicar(170, 361);
            Thread.sleep(150L);
            irClicar(201, 360);
            Thread.sleep(150L);
        }
        if (i2 == 2) {
            irClicar(311, 514);
            Thread.sleep(150L);
            irClicar(249, 527);
            Thread.sleep(150L);
            irClicar(165, 590);
            Thread.sleep(150L);
            irClicar(203, 592);
            Thread.sleep(150L);
        }
        if (i2 == 3) {
            irClicar(631, 57);
            Thread.sleep(150L);
            irClicar(569, 70);
            Thread.sleep(150L);
            irClicar(486, 132);
            Thread.sleep(150L);
            irClicar(518, 132);
            Thread.sleep(150L);
        }
        if (i2 == 4) {
            irClicar(629, 285);
            Thread.sleep(150L);
            irClicar(572, 300);
            Thread.sleep(150L);
            irClicar(490, 361);
            Thread.sleep(150L);
            irClicar(522, 361);
            Thread.sleep(150L);
        }
        if (i2 == 5) {
            irClicar(1270, 284);
            Thread.sleep(150L);
            irClicar(1211, 298);
            Thread.sleep(150L);
            irClicar(1131, 361);
            Thread.sleep(150L);
            irClicar(1164, 361);
            Thread.sleep(150L);
        }
        if (i2 == 6) {
            irClicar(1271, 513);
            Thread.sleep(150L);
            irClicar(1208, 530);
            Thread.sleep(150L);
            irClicar(1126, 591);
            Thread.sleep(150L);
            irClicar(1158, 591);
            Thread.sleep(150L);
        }
        if (i2 == 7) {
            irClicar(949, 57);
            Thread.sleep(150L);
            irClicar(890, 69);
            Thread.sleep(150L);
            irClicar(806, 132);
            Thread.sleep(150L);
            irClicar(835, 132);
            Thread.sleep(150L);
        }
        if (i2 == 8) {
            irClicar(950, 284);
            Thread.sleep(150L);
            irClicar(889, 299);
            Thread.sleep(150L);
            irClicar(808, 363);
            Thread.sleep(150L);
            irClicar(841, 363);
            Thread.sleep(150L);
        }
        colarFechar(i);
    }

    public static void disc(final int ldr, final int id) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        System.out.println(String.valueOf(new StringBuilder("Disconectando Acc ").append(id).append(" do lado ").append(ldr)));
        if (ldr == 1) {
            if (id == 1) {
                irClicar(212, 103);
                disconnect();
                disconnect();
            }
            if (id == 2) {
                irClicar(212, 331);
                disconnect();
                disconnect();
            }
            if (id == 3) {
                irClicar(212, 559);
                disconnect();
                disconnect();
            }
            if (id == 4) {
                irClicar(515, 118);
                disconnect();
                disconnect();
            }
            if (id == 5) {
                irClicar(515, 318);
                disconnect();
                disconnect();
            }
        }
        if (ldr == 2) {
            if (id == 1) {
                irClicar(1160, 120);
                disconnect();
                disconnect();
            }
            if (id == 2) {
                irClicar(1165, 355);
                disconnect();
                disconnect();
            }
            if (id == 3) {
                irClicar(1165, 568);
                disconnect();
                disconnect();
            }
            if (id == 4) {
                irClicar(835, 123);
                disconnect();
                disconnect();
            }
            if (id == 5) {
                irClicar(839, 336);
                disconnect();
                disconnect();
            }
        }
        irClicar(950, 466);
    }

    public static void killAllExe(final String name) throws IOException {
        Main.getRuntime().exec(String.valueOf("taskkill /f /im " + name));
        System.out.println(String.valueOf("Fechando programa (" + name + ")"));
    }

    public static void esc() {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        Main.getRobot().keyPress(27);
        Main.getRobot().keyRelease(27);
    }

    public static void fim2() throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        irClicar(950, 466);
        Sleep(5);
        irClicar(950, 466);
    }

    public static void abrirSala(final int i) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        if (i == 1) {
            irClicar(11, 31);
            irClicar(38, 41);
        }
        else if (i == 2) {
            irClicar(971, 31);
            irClicar(995, 41);
        }
    }

    public static void fim3() throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        irClicar(950, 466);
    }

    public static void colarFechar(final int i) throws InterruptedException {
        if (Main.getAtual() == Timers.IDLE) {
            return;
        }
        if (i == 1) {
            irClicar(131, 108);
            colar();
            Thread.sleep(100L);
            irClicar(177, 112);
            Thread.sleep(200L);
            irClicar(125, 119);
            Thread.sleep(200L);
            irClicar(237, 109);
            Thread.sleep(200L);
            irClicar(199, 141);
        }
        else if (i == 2) {
            irClicar(1102, 110);
            colar();
            Thread.sleep(100L);
            irClicar(1137, 109);
            Thread.sleep(200L);
            irClicar(1089, 116);
            Thread.sleep(200L);
            irClicar(1202, 106);
            Thread.sleep(200L);
            irClicar(1161, 139);
        }
    }
}
