package br.com.infomed.utils;

import java.util.Random;

public class GeradorStringRandom {
    public String getLoginRandom() {
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder loginCriado = new StringBuilder();
        Random rnd = new Random();
        while (loginCriado.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * CHARS.length());
            loginCriado.append(CHARS.charAt(index));
        }
        String saltStr = loginCriado.toString();
        return saltStr;

    }
}
