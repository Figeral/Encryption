package com.encryption;

import javafx.scene.control.TextField;

public class Hill {
    static String encryption(String msg, TextField a, TextField b, TextField c, TextField d) {

        // for making msg length even
        if (msg.length() % 2 != 0) {
            msg += "z";
        }
        int msgNum[] = new int[msg.length()];
        for (int i = 0; i < msg.length(); i++) {
            msgNum[i] = ((int) msg.charAt(i)) - 65;
            // System.out.println(msgNum[i]);
        }

        int key[][] = new int[2][2];
        key[0][0] = Integer.parseInt(a.getText());
        key[1][0] = Integer.parseInt(b.getText());
        key[0][1] = Integer.parseInt(c.getText());
        key[1][1] = Integer.parseInt(d.getText());
        String eText = "";
        for (int i = 0; i < msg.length(); i += 2) {

            int temp1 = msgNum[i] * key[0][0] + msgNum[i + 1] * key[1][0];
            eText += (char) ((temp1 % 26) + 65);

            int temp2 = msgNum[i] * key[0][1] + msgNum[i + 1] * key[1][1];
            eText += (char) ((temp2 % 26) + 65);
        }

        return eText;
    }

}
